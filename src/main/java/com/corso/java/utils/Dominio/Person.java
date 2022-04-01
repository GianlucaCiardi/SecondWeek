package com.corso.java.utils.Dominio;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(length = 30)
    private String LastName;

    @Column(length = 30)
    private String Name;
    @OneToMany(
            mappedBy = "family"
            ,cascade = {CascadeType.ALL}
    )
    private List<Person> person = new ArrayList<Person>();
}
