<template>
  <main>
    <Navbar />
    <div class="my-5">
      <div class="mx-auto w-25 " style="max-width:100%;">
        <h2 class="text-center mb-3">Add Pet</h2>
        <form @submit.prevent="addPet">
          <!--name-->
          <div class="row">
            <div class="col-md-12 form-group mb-3">
              <label for="name" class="form-label">Name</label>
              <input id="name"  type="text" name="name" class="form-control" placeholder="Name" required v-model="animal.name">
            </div>
          </div>

          <!--gender-->
          <label for="gender" class="form-label">Gender</label>
          <div class="form-check">
            <input class="form-check-input"   type="radio" name="gender" id="male" value="male" v-model="animal.gender">
            <label class="form-check-label" for="male">Male</label>
          </div>
          <div class="form-check">
            <input class="form-check-input" type="radio"   name="gender" id="female" value="female" v-model="animal.gender">
            <label class="form-check-label" for="female">Female</label>
          </div>

          <!--birthyear-->
          <div class="row">
            <div class="col-md-12 form-group mb-3">
              <label for="birthyear" class="form-label">Birth Year</label>
              <input id="birthyear" type="number" min="1900" max="2099" name="birthyear" class="form-control" placeholder="YYYY" required v-model="animal.birthyear" >
            </div>
          </div>

          <!--weight-->
          <div class="row">
            <div class="col-md-12 form-group mb-3">
              <label for="weight" class="form-label">Weight</label>
              <input id="weight" type="number" min="0" step="0.1" name="weight" class="form-control" placeholder="weight" required v-model="animal.weight" >
            </div>
          </div>

          <!--species-->
          <div class="row">
            <div class="col-md-12 form-group mb-3">
              <label for="species" class="form-label">Species</label>
              <input id="species"  type="text" name="species" class="form-control" placeholder="Species" required v-model="animal.species">
            </div>
          </div>

          <!--breed-->
          <div class="row">
            <div class="col-md-12 form-group mb-3">
              <label for="breed" class="form-label">Breed</label>
              <input id="breed"  type="text" name="breed" class="form-control" placeholder="Breed" required v-model="animal.breed">
            </div>
          </div>

          <!--microchipID-->
          <div class="row">
            <div class="col-md-12 form-group mb-3">
              <label for="microchipId" class="form-label">Microchip ID</label>
              <input id="microchipId"  type="text" name="microchipId" class="form-control" placeholder="Microchip ID" required v-model="animal.microchipId">
            </div>
          </div>

          <!--notes-->
          <div class="row">
            <div class="col-md-12 form-group mb-3">
              <label for="notes" class="form-label">Notes</label>
              <input id="notes"  type="text" name="notes" class="form-control" placeholder="Notes" required v-model="animal.notes">
            </div>
          </div>

          <div class="row">
            <div class="col-md-12 form-group">
              <input class="btn btn-primary w-100" type="submit" value="Submit">
            </div>
          </div>

          <div>

          </div>
        </form>

      </div>
    </div>
  </main>
</template>


<script>
import Navbar from '../components/Navbar.vue';

export default {
  name: 'AddPet',
  components: {
    Navbar
  },

  data() {
    return {
      animal : {
        name: '',
        gender: '',
        birthyear: '',
        weight: '',
        species: '',
        breed: '',
        microchipId: '',
        notes: ''
      }
    }
  },

  methods: {
    addPet(){
      fetch('http://localhost:8080/add', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(this.animal)
      })
          .then(data => {
            console.log(data)
            this.$router.push("/");
          })

    }
  },

}


</script>