package dev.richardnewman.sfgpetclinic.repositories;

import dev.richardnewman.sfgpetclinic.model.PetType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends JpaRepository<PetType, Long> {
}
