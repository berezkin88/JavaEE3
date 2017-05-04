package DAO;

import Essences.Skills;

/**
 * Created by Alexander on 04/05/2017.
 */
public interface skillsDAO {
    void save(Skills skill);
    Skills load (int id);
    Skills findByName (Skills skill);
    void delete(Skills skill);
}
