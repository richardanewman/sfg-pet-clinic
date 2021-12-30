package dev.richardnewman.sfgpetclinic.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Vet extends Person {

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="vet_specialties", joinColumns = @JoinColumn(name = "vet.id"), inverseJoinColumns = @JoinColumn(name = "specialty.id"))
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
