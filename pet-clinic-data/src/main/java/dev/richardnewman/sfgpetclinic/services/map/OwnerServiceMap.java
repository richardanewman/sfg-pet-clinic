package dev.richardnewman.sfgpetclinic.services.map;

import dev.richardnewman.sfgpetclinic.model.Owner;
import dev.richardnewman.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
@Profile("map")
public class OwnerServiceMap extends CommonMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return this.findAll().stream().filter(owner -> owner.getLastName().equalsIgnoreCase(lastName)).findFirst().orElse(null);
    }
}
