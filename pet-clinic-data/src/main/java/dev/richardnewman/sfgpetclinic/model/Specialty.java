package dev.richardnewman.sfgpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
