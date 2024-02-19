<template>
  <main>
    <Navbar />

    <!-- Table-->
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <h1 class="text-center">View Pet</h1>
          <!--Add button -->
          <a href="/add" class="btn btn-primary">Add Pet</a>
          <table class="table table-striped">
            <thead>
            <tr>
              <th scope="col">Id</th>
              <th scope="col">Name</th>
              <th scope="col">Gender</th>
              <th scope="col">Birth Year</th>
              <th scope="col">Weight</th>
              <th scope="col">Species</th>
              <th scope="col">Breed</th>
              <th scope="col">Microchip ID</th>
              <th scope="col">Notes</th>
            </tr>
            </thead>
            <tbody>
            <tr v-for="animal in animals" :key="animal.id">
              <th scope="row">{{animal.id}}</th>
              <td>{{animal.name}}</td>
              <td>{{animal.gender}}</td>
              <td>{{animal.birthyear}}</td>
              <td>{{animal.weight}}</td>
              <td>{{animal.species}}</td>
              <td>{{animal.breed}}</td>
              <td>{{animal.microchipId}}</td>
              <td>{{animal.notes}}</td>
              <td>
                <a class="btn btn-primary" :href="`/edit/${animal.id}`">Edit</a>
                <button class="btn btn-danger mx-2" @click="deletePet(animal.id)">Delete</button>
              </td>
            </tr>
            </tbody>
          </table>
        </div>
      </div>
    </div>

  </main>
</template>


<script>
import Navbar from '../components/Navbar.vue'

export default {
  name: 'ViewPets',
  components: {
    Navbar
  },
  data() {
    return {
      animals: []
    }
  },

  beforeMount(){
    this.getPets()
  },

  methods: {
    getPets(){
      fetch('http://localhost:8080/pets')
          .then(res => res.json())
          .then(data => {
            this.animals = data
            console.log(data)
          })
    },
    deletePet(id){
      fetch(`http://localhost:8080/pet/${id}`, {
        method: 'DELETE'
      })
          .then(data => {
            console.log(data)
            this.getPets()
          })
    }
  }

}

</script>