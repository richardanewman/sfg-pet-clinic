package dev.richardnewman.sfgpetclinic.jpa;

import dev.richardnewman.sfgpetclinic.model.Pet;
import dev.richardnewman.sfgpetclinic.repositories.OwnerRepository;
import dev.richardnewman.sfgpetclinic.repositories.PetRepository;
import dev.richardnewman.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Profile("jpa")
@Transactional
public class PetServiceJpa extends CommonJpaService<Pet, PetRepository> implements PetService {
    public PetServiceJpa(PetRepository repository) {
        super(repository);
    }
}
