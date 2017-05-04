package HW3.DAO;

import HW3.Essences.Customers;

/**
 * Created by Alexander on 04/05/2017.
 */
public interface CustomersDAO {

    void save(Customers customer);
    Customers load (int id);
    Customers findByName (Customers customer);
    void delete(Customers customer);
}
