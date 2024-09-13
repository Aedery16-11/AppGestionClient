package models;

public class Client {
    private Long id;
    private String raison_sociale;
    private String siret;
    private String telephone;
    private Comptable comptable;

    public Client(Long id, String raison_sociale, String siret, String telephone, Comptable comptable) {
        this.id = id;
        this.raison_sociale = raison_sociale;
        this.siret = siret;
        this.telephone = telephone;
        this.comptable = comptable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRaison_sociale() {
        return raison_sociale;
    }

    public void setRaison_sociale(String raison_sociale) {
        this.raison_sociale = raison_sociale;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Comptable getComptable() {
        return comptable;
    }

    public void setComptable(Comptable comptable) {
        this.comptable = comptable;
    }
}
