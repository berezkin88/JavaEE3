package HW3.DAO;

import HW3.Essences.Projects;

/**
 * Created by Alexander on 04/05/2017.
 */
public interface ProjectsDAO {
    void save(Projects project);
    Projects load (int id);
    Projects findByName (Projects project);
    void delete(Projects project);
}
