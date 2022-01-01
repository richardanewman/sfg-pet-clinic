package dev.richardnewman.sfgpetclinic.services.map;

import dev.richardnewman.sfgpetclinic.model.Visit;
import dev.richardnewman.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("map")
public class VisitServiceMap extends CommonMapService<Visit, Long> implements VisitService {
}
