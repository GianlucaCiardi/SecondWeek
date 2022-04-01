package com.corso.java.utils.Olympic;

public interface Repository<R extends Object>{

    void findAll();
    void persist(R clazz);
    void update(R clazz);
    void delete(R clazz);
    R findByPrimaryKey(int code);


}