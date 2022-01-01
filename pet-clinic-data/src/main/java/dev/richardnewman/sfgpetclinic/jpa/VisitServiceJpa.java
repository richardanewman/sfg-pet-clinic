package dev.richardnewman.sfgpetclinic.jpa;

import dev.richardnewman.sfgpetclinic.model.Visit;
import dev.richardnewman.sfgpetclinic.repositories.VisitRepository;
import dev.richardnewman.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Profile("jpa")
@Transactional
public class VisitServiceJpa extends CommonJpaService<Visit, VisitRepository> implements VisitService {
    public VisitServiceJpa(VisitRepository repository) {
        super(repository);
    }
}
