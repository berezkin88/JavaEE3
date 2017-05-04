package HW3.Controllers;

import HW3.DAO.SkillsDAO;
import HW3.DAO.hibernate.DAOImp;
import HW3.Essences.Skills;
import org.springframework.transaction.annotation.Transactional;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Alexander on 15/04/2017.
 */
public class SkillsController {
    private SkillsDAO skillsDAO;

    @Transactional
    public List<Skills> getAllCompanies(){
        return skillsDAO.findAll();
    }

    @Transactional
    public void createNewCompany(String areaOfSkill){
        Skills skill = new Skills();
        skill.setArea_of_skill(areaOfSkill);

        Set<Skills> check = new HashSet<>(skillsDAO.findAll());

        if (!check.contains(skill)){
            skillsDAO.save(skill);
        }
    }

    @Transactional
    public Skills findSkillById(int id) {
        return skillsDAO.load(id);
    }

    @Transactional
    public Skills findSkillByName (String areaOfSkill) {
        return skillsDAO.findByName(areaOfSkill);
    }

    public void setSkillsDAO(SkillsDAO skillsDAO) {
        this.skillsDAO = skillsDAO;
    }
}
