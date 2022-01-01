package dev.richardnewman.sfgpetclinic.jpa;

import dev.richardnewman.sfgpetclinic.model.Vet;
import dev.richardnewman.sfgpetclinic.repositories.VetRepository;
import dev.richardnewman.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Profile("jpa")
@Transactional
public class VetServiceJpa extends CommonJpaService<Vet, VetRepository> implements VetService {
    public VetServiceJpa(VetRepository repository) {
        super(repository);
    }
}
