package dev.richardnewman.sfgpetclinic.services.map;

import dev.richardnewman.sfgpetclinic.model.Specialty;
import dev.richardnewman.sfgpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("map")
public class SpecialtyMapService extends CommonMapService<Specialty, Long> implements SpecialtyService {
}
