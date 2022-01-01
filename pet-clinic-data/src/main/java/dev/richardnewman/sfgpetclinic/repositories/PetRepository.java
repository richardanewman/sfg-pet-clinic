package dev.richardnewman.sfgpetclinic.repositories;

import dev.richardnewman.sfgpetclinic.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
}
