package org.example;


import org.example.entities.Personne;
import org.example.services.ServicePersonne;

public class Main {

    public static void main(String[] args) {
        ServicePersonne sp = new ServicePersonne();
        Personne p = new Personne(200010, 21, "ben ali", "ali");
        Personne p2 = new Personne(200010, 21, "ben ali", "salah");
        Personne p3 = new Personne(200010, 21, "ben ali", "mounir");
        Personne p4 = new Personne(200010, 21, "ben ali", "mohamed");

        sp.add(p);
        sp.add(p2);
        sp.add(p3);
        sp.add(p4);


        System.out.println(sp.getAll().toString());


    }
}