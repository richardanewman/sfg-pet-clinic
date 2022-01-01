package dev.richardnewman.sfgpetclinic.services.map;

import dev.richardnewman.sfgpetclinic.model.Vet;
import dev.richardnewman.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("map")
public class VetServiceMap extends CommonMapService<Vet, Long> implements VetService {

}
