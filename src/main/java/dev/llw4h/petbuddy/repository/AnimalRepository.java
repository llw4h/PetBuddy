package dev.llw4h.petbuddy.repository;

import dev.llw4h.petbuddy.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    Optional<Animal> findAnimalById(Integer id);
}
