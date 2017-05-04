package HW3.Controllers;


import HW3.DAO.CustomersDAO;
import HW3.Essences.Customers;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Alexander on 14/04/2017.
 */
public class CustomersController {

    private CustomersDAO customersDAO;

    @Transactional
    public List<Customers> getAllCustomers(){
        return customersDAO.findAll();
    }

    @Transactional
    public void createNewCustomers(String customerName){
        Customers customer = new Customers();
        customer.setCustomer_name(customerName);

        Set<Customers> check = new HashSet<>(customersDAO.findAll());

        if (!check.contains(customer)){
            customersDAO.save(customer);
        }
    }

    @Transactional
    public Customers findCustomerById(int id) {
        return customersDAO.load(id);
    }

    @Transactional
    public Customers findCustomerByName (String customerName) {
        return customersDAO.findByName(customerName);
    }

    @Transactional
    public void deleteCustomer(String customerName){
        Customers customer = customersDAO.findByName(customerName);
        Set<Customers> check = new HashSet<>(customersDAO.findAll());
        if (check.contains(customer)){
            customersDAO.delete(customer);
        }
    }

    public void setCustomersDAO(CustomersDAO customersDAO) {
        this.customersDAO = customersDAO;
    }
}
