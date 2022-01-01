package dev.richardnewman.sfgpetclinic.services.map;

import dev.richardnewman.sfgpetclinic.model.Owner;
import dev.richardnewman.sfgpetclinic.model.Pet;
import dev.richardnewman.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("map")
public class PetServiceMap extends CommonMapService<Pet, Long> implements PetService {

}
