package Controllers;

import DAO.hibernate.DAOImp;
import Essences.Companies;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 14/04/2017.
 */
public class CompaniesController extends DAOImp {

    private DAOImp daoImp;

    public List<Companies> readAll() throws SQLException {
        List<Companies> result = new ArrayList<>();

        return result;
    }

    public List<Companies> read(String params) throws SQLException{
        List<Companies> result = new ArrayList<>();

        return result;
    }

    private Companies createCompany(ResultSet resultSet) throws SQLException {
        Companies companies = new Companies();
        companies.setCompany_id(resultSet.getInt("company_id"));
        companies.setCompany_name(resultSet.getString("company_name"));
        companies.setNumber_of_employees(resultSet.getInt("number_of_employees"));
        return companies;
    }

    public void setDaoImp(DAOImp daoImp) {
        this.daoImp = daoImp;
    }
}
