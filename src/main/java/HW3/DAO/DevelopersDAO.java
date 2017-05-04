package HW3.DAO;

import HW3.Essences.Developers;

import java.util.List;

/**
 * Created by Alexander on 04/05/2017.
 */
public interface DevelopersDAO {
    void save(Developers developer);
    Developers load (int id);
    Developers findByName (String name);
    void delete(Developers developer);
    List<Developers> findAll();
}
