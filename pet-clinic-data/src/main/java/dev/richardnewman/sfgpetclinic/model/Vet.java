package dev.richardnewman.sfgpetclinic.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Vet extends Person {

    private Set<Specialty> specialties = new HashSet<>();

    protected Set<Specialty> getSpecialtiesInternal() {
        return this.specialties;
    }

    public List<String> getSpecialties() {
        List<String> names = new ArrayList<>();
        getSpecialtiesInternal().forEach(specialty -> names.add(specialty.getDescription()));
        return names;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
