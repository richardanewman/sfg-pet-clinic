package dev.richardnewman.sfgpetclinic.services.map;

import dev.richardnewman.sfgpetclinic.model.Specialty;
import dev.richardnewman.sfgpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

@Service
public class SpecialtyMapService extends CommonMapService<Specialty, Long> implements SpecialtyService {
}
