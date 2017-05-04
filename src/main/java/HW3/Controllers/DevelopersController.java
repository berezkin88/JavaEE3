package HW3.Controllers;

import HW3.DAO.DevelopersDAO;
import HW3.DAO.hibernate.DAOImp;
import HW3.Essences.Developers;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Alexander on 14/04/2017.
 */
public class DevelopersController extends DAOImp {

    private DevelopersDAO developersDAO;

    @Transactional
    public List<Developers> getAllDevelopers(){
        return developersDAO.findAll();
    }

    @Transactional
    public void createNewDeveloper(String name, String surname, int age, double salary){
        Developers developer = new Developers();
        developer.setName(name);
        developer.setSurname(surname);
        developer.setAge(age);
        developer.setSalary(salary);

        Set<Developers> check = new HashSet<>(developersDAO.findAll());

        if (!check.contains(developer)){
            developersDAO.save(developer);
        }
    }

    @Transactional
    public Developers findCompanyById(int id) {
        return developersDAO.load(id);
    }

    @Transactional
    public Developers findDeveloperByName (String name) {
        return developersDAO.findByName(name);
    }

    @Transactional
    public void deleteDeveloper(String name){
        Developers developer = developersDAO.findByName(name);
        Set<Developers> check = new HashSet<>(developersDAO.findAll());
        if (check.contains(developer)){
            developersDAO.delete(developer);
        }
    }

    public void setDevelopersDAO(DevelopersDAO developersDAO) {
        this.developersDAO = developersDAO;
    }
}
