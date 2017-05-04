package HW3.DAO;

import HW3.Essences.Developers;

/**
 * Created by Alexander on 04/05/2017.
 */
public interface DevelopersDAO {
    void save(Developers developer);
    Developers load (int id);
    Developers findByName (Developers developer);
    void delete(Developers developer);
}
