package HW3.DAO;

import HW3.Essences.Projects;

import java.util.List;

/**
 * Created by Alexander on 04/05/2017.
 */
public interface ProjectsDAO {
    void save(Projects project);
    Projects load (int id);
    Projects findByName (String project);
    void delete(Projects project);
    List<Projects> findAll();
}
