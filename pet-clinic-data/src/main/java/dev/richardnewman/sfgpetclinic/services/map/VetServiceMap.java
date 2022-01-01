package dev.richardnewman.sfgpetclinic.services.map;

import dev.richardnewman.sfgpetclinic.model.Vet;
import dev.richardnewman.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends CommonMapService<Vet, Long> implements VetService {

}
