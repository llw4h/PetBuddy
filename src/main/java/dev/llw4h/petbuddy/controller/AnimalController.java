package dev.llw4h.petbuddy.controller;

import dev.llw4h.petbuddy.model.Animal;
import dev.llw4h.petbuddy.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
//@RequestMapping("/api/v1/pets")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @RequestMapping("/")
    public String hello_world(){
        return "Hello World";
    }

    @PostMapping("/add")
    public ResponseEntity<Animal> addPet(@RequestBody Animal animal){
        return new ResponseEntity<Animal>(animalService.addAnimal(animal), HttpStatus.CREATED);
    }

    @GetMapping("/pet/{id}")
    public ResponseEntity<Optional<Animal>> getPetById(@PathVariable("id") Integer id){
        return new ResponseEntity<Optional<Animal>>(animalService.getAnimalById(id), HttpStatus.OK);
    }

    @GetMapping("/pets")
    public ResponseEntity<List<Animal>> getPets(){
        return new ResponseEntity<List<Animal>>(animalService.getAnimals(), HttpStatus.OK);
    }

    @PutMapping("/pet")
    public ResponseEntity<Animal> updatePet(@RequestBody Animal animal){
        return new ResponseEntity<Animal>(animalService.updateAnimal(animal), HttpStatus.OK);
    }

    @DeleteMapping("/pet/{id}")
    public ResponseEntity<Void> deletePet(@PathVariable("id") Integer id){
        animalService.deleteAnimal(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
