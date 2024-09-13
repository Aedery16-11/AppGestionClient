package repositories;

import models.Comptable;
import tools.DataSourceProvider;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ComptableRepository implements  RepositoryInterface<Comptable, Long>{

    private DataSource dataSource;
    private Connection connection;

    public ComptableRepository() {
        this.dataSource = DataSourceProvider.getDataSourceInstance();
        this.connection = null;
    }

    @Override
    public void create(Comptable entity) throws SQLException {
        try {
            this.connection = this.dataSource.getConnection();
            PreparedStatement ps = this.connection.prepareStatement("INSERT INTO comptables (nom, email, telephone) VALUES (?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, entity.getNom());
            ps.setString(2, entity.getEmail());
            ps.setString(3, entity.getTelephone());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys(); // dernier id généré
            if (rs.next())
            {
                entity.setId(rs.getLong(1));
            }
            System.out.println("Comptable crée avec l'id" + entity.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (this.connection != null)
            {
                this.connection.close();
            }
        }
    }

    @Override
    public void update(Comptable entity) throws SQLException {
        try {
            this.connection = this.dataSource.getConnection();
            PreparedStatement ps = this.connection.prepareStatement("UPDATE comptables SET nom = ?, email = ?, telephone = ? WHERE id= ?");
            ps.setString(1, entity.getNom());
            ps.setString(2, entity.getEmail());
            ps.setString(3, entity.getTelephone());
            ResultSet rs = ps.getGeneratedKeys(); // dernier id généré
            if (rs.next())
            {
                entity.setId(rs.getLong(1));
            }
            System.out.println("Comptable crée avec l'id" + entity.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (this.connection != null)
            {
                this.connection.close();
            }
        }
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public Comptable findById(Long aLong) {
        return null;
    }

    @Override
    public ArrayList<Comptable> findAll() {
        return null;
    }
}
