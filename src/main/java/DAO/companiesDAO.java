package DAO;

import Essences.Companies;

/**
 * Created by Alexander on 04/05/2017.
 */
public interface companiesDAO {

    void save(Companies company);
    Companies load (int id);
    Companies findByName (Companies company);
    void delete(Companies company);
}
