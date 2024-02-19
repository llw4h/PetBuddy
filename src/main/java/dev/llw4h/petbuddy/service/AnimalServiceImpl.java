package dev.llw4h.petbuddy.service;

import dev.llw4h.petbuddy.model.Animal;
import dev.llw4h.petbuddy.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService{

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public Animal addAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public Optional<Animal> getAnimalById(Integer id) {
        return animalRepository.findAnimalById(id);
    }

    @Override
    public List<Animal> getAnimals() {
        return animalRepository.findAll();
    }

    @Override
    public void deleteAnimal(Integer id) {
        animalRepository.deleteById(id);
    }

    @Override
    public Animal updateAnimal(Animal animal){
        return animalRepository.save(animal);
    }
}
