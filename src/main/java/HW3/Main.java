package HW3;

import HW3.Controllers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Alexander on 08/04/2017.
 */
public class Main {

    private CompaniesController companiesController;
    private CustomersController customersController;
    private DevelopersController developersController;
    private ProjectsController projectsController;
    private SkillsController skillsController;
    private final static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml", "hibernate-context.xml");
        applicationContext.getBean(Main.class).start();

    }

    private void start() {
        companiesController.getAllCompanies().forEach(System.out::println);
        customersController.getAllCustomers().forEach(System.out::println);
        developersController.getAllDevelopers().forEach(System.out::println);
        projectsController.getAllProjects().forEach(System.out::println);
        skillsController.getAllSkills().forEach(System.out::println);
    }

    public void setCompaniesController(CompaniesController companiesController) {
        this.companiesController = companiesController;
    }

    public void setCustomersController(CustomersController customersController) {
        this.customersController = customersController;
    }

    public void setDevelopersController(DevelopersController developersController) {
        this.developersController = developersController;
    }

    public void setProjectsController(ProjectsController projectsController) {
        this.projectsController = projectsController;
    }

    public void setSkillsController(SkillsController skillsController) {
        this.skillsController = skillsController;
    }
}
