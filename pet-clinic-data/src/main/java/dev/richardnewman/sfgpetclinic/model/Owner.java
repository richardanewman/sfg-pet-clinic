package dev.richardnewman.sfgpetclinic.model;

import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;

import javax.persistence.*;
import java.util.*;

@Entity
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;

    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    protected Set<Pet> getPetsInternal() {
        return this.pets;
    }

    public List<String> getPets() {
       List<String> names = new ArrayList<>();
       getPetsInternal().forEach(pet -> names.add(pet.getName()));
       return names;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
