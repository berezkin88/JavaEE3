package Controllers;

import DAO.hibernate.DAOImp;
import Essences.Developers;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 14/04/2017.
 */
public class DevelopersController extends DAOImp {
    private DAOImp daoImp;

    public List<Developers> readAll() throws SQLException {
        List<Developers> result = new ArrayList<>();

        return result;
    }

    public List<Developers> read(String params) throws SQLException{
        List<Developers> result = new ArrayList<>();

        return result;
    }

    private Developers createDevelopers(ResultSet resultSet) throws SQLException {
        Developers developers = new Developers();
        developers.setId(resultSet.getInt("id"));
        developers.setName(resultSet.getString("name"));
        developers.setSurname(resultSet.getString("surname"));
        developers.setAge(resultSet.getInt("age"));
        developers.setSalary(resultSet.getDouble("salary"));
        developers.setProject(resultSet.getInt("project"));
        return developers;
    }

    public void setDaoImp(DAOImp daoImp) {
        this.daoImp = daoImp;
    }
}
