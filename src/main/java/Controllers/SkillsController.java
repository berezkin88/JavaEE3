package Controllers;

import DAO.hibernate.DAOImp;
import Essences.Skills;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 15/04/2017.
 */
public class SkillsController extends DAOImp {
    private DAOImp daoImp;

    public List<Skills> readAll() throws SQLException {
        List<Skills> result = new ArrayList<>();

        return result;
    }

    public List<Skills> read(String params) throws SQLException{
        List<Skills> result = new ArrayList<>();

        return result;
    }

    private Skills createSkills(ResultSet resultSet) throws SQLException {
        Skills skills = new Skills();
        skills.setSkill_id(resultSet.getInt("skill_id"));
        skills.setArea_of_skill(resultSet.getString("area_of_skill"));
        skills.setDeveloper_id(resultSet.getInt("developer_id"));
        return skills;
    }

    public void setDaoImp(DAOImp daoImp) {
        this.daoImp = daoImp;
    }
}
