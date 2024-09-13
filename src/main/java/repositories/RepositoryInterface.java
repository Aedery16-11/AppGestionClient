package repositories;

import java.sql.SQLException;
import java.util.ArrayList;

public interface RepositoryInterface<T, ID> {
    void create(T entity) throws SQLException;
    void update(T entity) throws SQLException;
    void delete(ID id);
    T findById(ID id);
    ArrayList<T> findAll();
}
