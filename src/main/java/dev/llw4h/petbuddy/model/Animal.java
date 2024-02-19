package dev.llw4h.petbuddy.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Animal {
    @Id
    @SequenceGenerator(
            name = "animal_id_sequence",
            sequenceName = "animal_id_sequence"
    )
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator = "animal_id_sequence"
    )
    private Integer id;

    private String name;

    private String gender;

    private Integer birthyear;

    private Double weight;

    private String species;

    private String breed;

    private String microchipId;

    private String notes;

    public Animal(Integer id,
                  String name,
                  String gender,
                  Integer birthyear,
                  Double weight,
                  String species,
                  String breed,
                  String notes,
                  String microchipId) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthyear = birthyear;
        this.weight = weight;
        this.species = species;
        this.breed = breed;
        this.notes = notes;
        this.microchipId = microchipId;
    }

    public Animal() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(Integer birthyear) {
        this.birthyear = birthyear;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getMicrochipId() {
        return microchipId;
    }

    public void setMicrochipId(String microchipId) {
        this.microchipId = microchipId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(id, animal.id) && Objects.equals(name, animal.name) && Objects.equals(gender, animal.gender) && Objects.equals(birthyear, animal.birthyear) && Objects.equals(weight, animal.weight) && Objects.equals(species, animal.species) && Objects.equals(breed, animal.breed) && Objects.equals(notes, animal.notes) && Objects.equals(microchipId, animal.microchipId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender, birthyear, weight, species, breed, notes, microchipId);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthyear=" + birthyear +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", notes='" + notes + '\'' +
                ", microchipId='" + microchipId + '\'' +
                '}';
    }
}
