package org.example.services;


import org.example.entities.Personne;
import org.example.interfaces.ISErvice;
import org.example.utils.MyDataBase;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ServicePersonne implements ISErvice<Personne> {
    private Connection cnx;


    public ServicePersonne() {
        this.cnx = MyDataBase.getInstance().getCnx();
    }

    @Override
    public void add(Personne p) {
        String qry = "INSERT INTO `personne`(`nom`, `prenom`, `age`) VALUES ('" + p.getNom() + "','" + p.getPrenom() + "','" + p.getAge() + "')";
        try {
            Statement stm = cnx.createStatement();
            stm.executeUpdate(qry);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }

    @Override
    public ArrayList<Personne> getAll() {
        ArrayList<Personne> personnes = new ArrayList<>();
        String qry = "SELECT * FROM `personne` ";
        try {
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery(qry);
            while (rs.next()) {
                Personne p = new Personne();
                p.setId(rs.getInt(1));
                p.setNom(rs.getString("nom"));
                p.setPrenom(rs.getString(3));
                p.setAge(rs.getInt("age"));

                personnes.add(p);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return personnes;
    }

    @Override
    public void update(Personne p) {

    }

    @Override
    public void delete(Personne p) {

    }
}
