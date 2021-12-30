package dev.richardnewman.sfgpetclinic.bootstrap;

import dev.richardnewman.sfgpetclinic.model.Owner;
import dev.richardnewman.sfgpetclinic.model.Pet;
import dev.richardnewman.sfgpetclinic.model.PetType;
import dev.richardnewman.sfgpetclinic.model.Vet;
import dev.richardnewman.sfgpetclinic.services.OwnerService;
import dev.richardnewman.sfgpetclinic.services.PetService;
import dev.richardnewman.sfgpetclinic.services.PetTypeService;
import dev.richardnewman.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final PetService petService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, PetService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.petService = petService;
    }


    @Override
    public void run(String... args) throws Exception {
       loadData();
    }

    private void loadData() {

        PetType dog = new PetType();
        dog.setName("Dog");

        petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");

        petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Main St");
        owner1.setCity("Boise");
        owner1.setTelephone("208-555-5555");

        Set<Pet> mikesPets = new HashSet<>();
        Pet rover = new Pet();
        rover.setPetType(dog);
        rover.setName("Rover");
        rover.setBirthDate(LocalDate.parse("2020-01-15"));
        petService.save(rover);
        mikesPets.add(rover);

        owner1.setPets(mikesPets);

        ownerService.save(owner1);



        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenna");
        owner2.setAddress("987 Garfield St");
        owner2.setCity("Laramie");
        owner2.setTelephone("307-555-5555");

        Set<Pet> fionaPets = new HashSet<>();
        Pet max = new Pet();
        max.setPetType(dog);
        max.setName("Max");
        max.setBirthDate(LocalDate.parse("2020-02-22"));
        petService.save(max);
        fionaPets.add(max);

        Pet smokey = new Pet();
        smokey.setPetType(dog);
        smokey.setName("Smokey");
        smokey.setBirthDate(LocalDate.parse("2020-02-23"));
        petService.save(smokey);
        fionaPets.add(smokey);

        owner2.setPets(fionaPets);

        ownerService.save(owner2);


        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
