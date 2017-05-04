package DAO;

import Essences.Developers;

/**
 * Created by Alexander on 04/05/2017.
 */
public interface developerDAO {
    void save(Developers developer);
    Developers load (int id);
    Developers findByName (Developers developer);
    void delete(Developers developer);
}
