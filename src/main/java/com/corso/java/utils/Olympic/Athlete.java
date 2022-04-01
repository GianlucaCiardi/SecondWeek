package com.corso.java.utils.Olympic;

import lombok.Data;

import java.util.Date;



@Data
public class Athlete implements Repository<Athlete>{

    private int code;
    private String name;
    private String nation;
    private double height;
    private Date birthDate;

    @Override
    public void findAll() {

    }

    @Override
    public void persist(Athlete clazz) {

    }

    @Override
    public void update(Athlete clazz) {

    }

    @Override
    public void delete(Athlete clazz) {

    }

    @Override
    public Athlete findByPrimaryKey(int code) {
        return null;
    }
}
