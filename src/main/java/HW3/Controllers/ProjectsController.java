package HW3.Controllers;

import HW3.DAO.hibernate.DAOImp;
import HW3.Essences.Projects;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 14/04/2017.
 */
public class ProjectsController extends DAOImp {
    private DAOImp daoImp;

    public List<Projects> readAll() throws SQLException {
        List<Projects> result = new ArrayList<>();

        return result;
    }

    public List<Projects> read(String params) throws SQLException{
        List<Projects> result = new ArrayList<>();

        return result;
    }

    private Projects createProjects(ResultSet resultSet) throws SQLException {
        Projects projects = new Projects();
        projects.setProject_id(resultSet.getInt("project_id"));
        projects.setProject_title(resultSet.getString("project_title"));
        projects.setCompany_id(resultSet.getInt("company_id"));
        projects.setCustomer_id(resultSet.getInt("customer_id"));
        projects.setCost(resultSet.getInt("cost"));
        return projects;
    }

    public void setDaoImp(DAOImp daoImp) {
        this.daoImp = daoImp;
    }
}
