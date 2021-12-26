package dev.richardnewman.sfgpetclinic.services;

import dev.richardnewman.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
