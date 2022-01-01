package dev.richardnewman.sfgpetclinic.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
public class Specialty extends BaseEntity {

    private String description;

}
