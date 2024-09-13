package models;

import com.mysql.cj.xdevapi.Client;

import java.util.ArrayList;

public class Comptable {
    private Long id;
    private String nom;
    private String email;
    private String telephone;
    private ArrayList<Client> clients;

    public Comptable(Long id, String nom, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.clients = clients;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void addClient(ArrayList<Client> clients, Client client){
        clients.add(client);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
