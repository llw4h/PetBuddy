package dev.llw4h.petbuddy.service;

import dev.llw4h.petbuddy.model.Animal;

import java.util.List;
import java.util.Optional;

public interface AnimalService {
    Animal addAnimal(Animal animal);
    Optional<Animal> getAnimalById(Integer id);
    List<Animal> getAnimals();
    void deleteAnimal(Integer id);
    Animal updateAnimal(Animal animal);
}
