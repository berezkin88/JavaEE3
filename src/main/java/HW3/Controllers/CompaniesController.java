package HW3.Controllers;

import HW3.DAO.CompaniesDAO;
import HW3.Essences.Companies;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Alexander on 14/04/2017.
 */
public class CompaniesController {

    private CompaniesDAO companiesDAO;

    @Transactional
    public List<Companies> getAllCompanies(){
        return companiesDAO.findAll();
    }

    @Transactional
    public void createNewCompany(String companyName, int numberOfEmployees){
        Companies company = new Companies();
        company.setCompany_name(companyName);
        company.setNumber_of_employees(numberOfEmployees);

        Set<Companies> check = new HashSet<>(companiesDAO.findAll());

        if (!check.contains(company)){
            companiesDAO.save(company);
        }
    }

    @Transactional
    public Companies findById(int id) {
        return companiesDAO.load(id);
    }

    @Transactional
    public Companies findByName (String companyName) {
        return companiesDAO.findByName(companyName);
    }

    @Transactional
    public void deleteCompany(String companyName){
        Companies company = companiesDAO.findByName(companyName);
        Set<Companies> check = new HashSet<>(companiesDAO.findAll());
         if (check.contains(company)){
             companiesDAO.delete(company);
         }
    }


    public void setCompaniesDAO(CompaniesDAO companiesDAO) {
        this.companiesDAO = companiesDAO;
    }
}
