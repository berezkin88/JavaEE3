package HW3.Controllers;

import HW3.DAO.CompaniesDAO;
import HW3.Essences.Companies;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alexander on 14/04/2017.
 */
public class CompaniesController {

    private CompaniesDAO companiesDAO;

    @Transactional
    public List<Companies> getAllCompanies(){
        return companiesDAO.findAll();
    }


    public void setCompaniesDAO(CompaniesDAO companiesDAO) {
        this.companiesDAO = companiesDAO;
    }
}
