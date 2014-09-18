package org.dmuskat.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * Created by davidmuskat on 9/17/14.
 */
@Entity /* Jpa annotation to represent a persistence object */
public class User {

    @Id  /* Represents a primary key column in db */
    @GeneratedValue /* auto generates a value for id attribute */
    private Long id;
    private String firstName;
    private String lastName;

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }






}
