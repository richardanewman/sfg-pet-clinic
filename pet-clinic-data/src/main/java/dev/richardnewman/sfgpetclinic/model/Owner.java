package dev.richardnewman.sfgpetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;

    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

    protected Set<Pet> getPetsInternal() {
        return this.pets;
    }

    public List<String> getPets() {
       List<String> names = new ArrayList<>();
       getPetsInternal().forEach(pet -> names.add(pet.getName()));
       return names;
    }

}
