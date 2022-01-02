package dev.richardnewman.sfgpetclinic.services.map;

import dev.richardnewman.sfgpetclinic.model.Owner;
import dev.richardnewman.sfgpetclinic.services.PetService;
import dev.richardnewman.sfgpetclinic.services.PetTypeService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {
    OwnerServiceMap ownerServiceMap;

    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeMapService(), new PetServiceMap());
        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Main St");
        owner1.setCity("Boise");
        owner1.setTelephone("208-555-5555");
        owner1.setId(123L);
        ownerServiceMap.save(owner1);
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerServiceMap.findAll();
        assertEquals(1, ownerSet.size());
    }

    @Test
    void findById() {
        Owner owner = ownerServiceMap.findById(123L);
        assertEquals(123L, owner.getId());
    }

    @Test
    void save() {
        Owner owner2 = new Owner();
        owner2.setId(2L);
        ownerServiceMap.save(owner2);
        assertEquals(2L, owner2.getId());
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(123L);
        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void delete() {
        Owner owner = ownerServiceMap.findById(123L);
        ownerServiceMap.delete(owner);
        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void findByLastName() {
        assertEquals("Weston", ownerServiceMap.findById(123L).getLastName());
    }
}