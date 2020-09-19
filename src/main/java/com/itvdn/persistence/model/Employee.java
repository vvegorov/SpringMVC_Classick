package com.itvdn.persistence.model;


import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "name")
    String name;

    @Column(name = "position")
    String position;

    @Column(name = "phone")
    String phone;

    public Employee() {
        super();
    }

    public Employee(long id, String name, String position, String phone) {

        super();
        this.id = id;
        this.name = name;
        this.position = position;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.join(", ", new String[]{
                "Employee # " + id,
                name, position, phone
        });
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
