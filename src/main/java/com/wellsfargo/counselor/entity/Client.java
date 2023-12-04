package com.wellsfargo.counselor.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity

public class Client {

    @Id
    @GeneratedValue() // primary key annotation
    private long clientId;

    @Column(nullable = false) // specifies that these fields cannot be null
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

  protected client()   // constructor they have same name as classname(client).
                       // private is used becoz this constructor can only accessed in package or subclass
  {

  }

    public Client(String firstName, String lastName, String phone, String email) { // parameterised constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public Long getclientId() { // get is used according to getter name convention.
                                // this method retrieves the value of the clientId
        return clientId;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
