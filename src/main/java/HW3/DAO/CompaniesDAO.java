package HW3.DAO;

import HW3.Essences.Companies;

import java.util.List;

/**
 * Created by Alexander on 04/05/2017.
 */
public interface CompaniesDAO {

    void save(Companies company);
    Companies load (int id);
    Companies findByName (String name);
    List findAll();
    void delete(Companies company);
}
