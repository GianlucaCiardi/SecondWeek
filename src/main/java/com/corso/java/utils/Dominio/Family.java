package com.corso.java.utils.Dominio;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="family:id")
    private String id;

    @Column(length = 100)
    private String description;
    @ManyToOne
    @JoinColumn(name = "familyid")
    private Family family;

}
