package dev.richardnewman.sfgpetclinic.model;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table
public class Pet extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "type.id")
    private PetType petType;

    private String name;

    @ManyToOne
    @JoinColumn(name="owner.id")
    private Owner owner;

    private LocalDate birthDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet.id")
    private Set<Visit> visits;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Visit> getVisits() {
        return visits;
    }

    public void setVisits(Set<Visit> visits) {
        this.visits = visits;
    }
}
