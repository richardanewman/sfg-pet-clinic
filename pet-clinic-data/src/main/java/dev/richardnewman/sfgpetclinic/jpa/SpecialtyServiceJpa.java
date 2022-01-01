package dev.richardnewman.sfgpetclinic.jpa;

import dev.richardnewman.sfgpetclinic.model.Specialty;
import dev.richardnewman.sfgpetclinic.repositories.SpecialtyRepository;
import dev.richardnewman.sfgpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Profile("jpa")
@Transactional
public class SpecialtyServiceJpa extends CommonJpaService<Specialty, SpecialtyRepository> implements SpecialtyService {
     public SpecialtyServiceJpa(SpecialtyRepository repository) {
        super(repository);
    }
}
