package dev.richardnewman.sfgpetclinic.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Vet extends Person {

    @ManyToMany
    @JoinTable(name="vet_specialties", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    private Set<Specialty> specialties = new HashSet<>();

    protected Set<Specialty> getSpecialtiesInternal() {
        return this.specialties;
    }

    public List<String> getSpecialties() {
        List<String> names = new ArrayList<>();
        getSpecialtiesInternal().forEach(specialty -> names.add(specialty.getDescription()));
        return names;
    }
}
