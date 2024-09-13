package services;

import models.Comptable;
import repositories.ComptableRepository;

import java.sql.SQLException;

public class ComptableService {
    private ComptableRepository repository;
    public ComptableService()
    {
        this.repository = new ComptableRepository();
    }
    public void create(String nom, String email, String telephone) throws SQLException {
        Comptable c = new Comptable(null, nom, email, telephone);
        this.repository.create(c);
    }
    public void update(Long id, String nom, String email, String telephone) throws SQLException {
        Comptable c = new Comptable(id, nom, email, telephone);
        this.repository.update(c);
    }
}
