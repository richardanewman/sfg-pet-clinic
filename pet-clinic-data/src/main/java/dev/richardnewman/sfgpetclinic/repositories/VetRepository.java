package dev.richardnewman.sfgpetclinic.repositories;

import dev.richardnewman.sfgpetclinic.model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends JpaRepository<Vet, Long> {
}
