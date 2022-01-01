package dev.richardnewman.sfgpetclinic.jpa;

import dev.richardnewman.sfgpetclinic.model.PetType;
import dev.richardnewman.sfgpetclinic.repositories.PetTypeRepository;
import dev.richardnewman.sfgpetclinic.services.PetService;
import dev.richardnewman.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Profile("jpa")
@Transactional
public class PetTypeServiceJpa extends CommonJpaService<PetType, PetTypeRepository> implements PetTypeService {
    public PetTypeServiceJpa(PetTypeRepository repository) {
        super(repository);
    }
}
