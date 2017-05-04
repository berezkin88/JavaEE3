package HW3.DAO;

import HW3.Essences.Skills;

import java.util.List;

/**
 * Created by Alexander on 04/05/2017.
 */
public interface SkillsDAO {
    void save(Skills skill);
    Skills load (int id);
    Skills findByName (String skill);
    List<Skills> findAll();
}
