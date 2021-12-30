package dev.richardnewman.sfgpetclinic.bootstrap;

import dev.richardnewman.sfgpetclinic.model.*;
import dev.richardnewman.sfgpetclinic.services.*;
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
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, PetService petService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.petService = petService;
        this.specialtyService = specialtyService;
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

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        surgery.setDescription("Surgery");
        specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        dentistry.setDescription("Dentistry");
        specialtyService.save(dentistry);

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

        Set<Specialty> samsSpecialties = new HashSet<>();
        samsSpecialties.add(surgery);

        vet1.setSpecialties(samsSpecialties);
        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        Set<Specialty> jessiesSpecialties = new HashSet<>();
        jessiesSpecialties.add(radiology);

        vet2.setSpecialties(jessiesSpecialties);
        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
