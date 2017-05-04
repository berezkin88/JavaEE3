package DAO;

import Essences.Customers;

/**
 * Created by Alexander on 04/05/2017.
 */
public interface customersDAO {

    void save(Customers customer);
    Customers load (int id);
    Customers findByName (Customers customer);
    void delete(Customers customer);
}
