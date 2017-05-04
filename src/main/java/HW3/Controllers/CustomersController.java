package HW3.Controllers;

import HW3.DAO.hibernate.DAOImp;
import HW3.Essences.Customers;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 14/04/2017.
 */
public class CustomersController extends DAOImp {

    private DAOImp daoImp;

    public List<Customers> readAll() throws SQLException {
        List<Customers> result = new ArrayList<>();
        return result;
    }

    public List<Customers> read(String params) throws SQLException{
        List<Customers> result = new ArrayList<>();
        return result;
    }

    private Customers createCustomers(ResultSet resultSet) throws SQLException {
        Customers customers = new Customers();
        customers.setCustomer_id(resultSet.getInt("customer_id"));
        customers.setCustomer_name(resultSet.getString("customer_name"));
        return customers;
    }

    public void setDaoImp(DAOImp daoImp) {
        this.daoImp = daoImp;
    }
}
