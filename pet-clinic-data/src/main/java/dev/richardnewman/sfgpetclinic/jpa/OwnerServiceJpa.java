package dev.richardnewman.sfgpetclinic.jpa;

import dev.richardnewman.sfgpetclinic.model.Owner;
import dev.richardnewman.sfgpetclinic.repositories.OwnerRepository;
import dev.richardnewman.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Profile("jpa")
@Transactional
public class OwnerServiceJpa extends CommonJpaService<Owner, OwnerRepository> implements OwnerService {

    public OwnerServiceJpa(OwnerRepository repository) {
        super(repository);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }
}
