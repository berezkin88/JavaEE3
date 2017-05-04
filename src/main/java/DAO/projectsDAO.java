package DAO;

import Essences.Projects;

/**
 * Created by Alexander on 04/05/2017.
 */
public interface projectsDAO {
    void save(Projects project);
    Projects load (int id);
    Projects findByName (Projects project);
    void delete(Projects project);
}
