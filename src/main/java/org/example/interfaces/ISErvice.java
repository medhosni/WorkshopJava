package org.example.interfaces;


import java.util.ArrayList;

public interface ISErvice<T> {

    void add(T p);

    ArrayList<T> getAll();

    void update(T p);

    void delete(T p);


}
