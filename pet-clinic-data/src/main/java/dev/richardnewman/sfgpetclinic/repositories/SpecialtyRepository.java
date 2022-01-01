package dev.richardnewman.sfgpetclinic.repositories;

import dev.richardnewman.sfgpetclinic.model.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialtyRepository extends JpaRepository<Specialty, Long> {
}
