package dev.richardnewman.sfgpetclinic.repositories;

import dev.richardnewman.sfgpetclinic.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
