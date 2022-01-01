package dev.richardnewman.sfgpetclinic.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name="type")
public class PetType extends BaseEntity {

    private String name;

}
