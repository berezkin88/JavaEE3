package HW3.Controllers;

import HW3.DAO.ProjectsDAO;
import HW3.DAO.hibernate.DAOImp;
import HW3.Essences.Projects;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Alexander on 14/04/2017.
 */
public class ProjectsController extends DAOImp {

    private ProjectsDAO projectsDAO;

    @Transactional
    public List<Projects> getAllProjects(){
        return projectsDAO.findAll();
    }

    @Transactional
    public void createNewProject(String projectTitle){
        Projects project = new Projects();
        project.setProject_title(projectTitle);

        Set<Projects> check = new HashSet<>(projectsDAO.findAll());

        if (!check.contains(project)){
            projectsDAO.save(project);
        }
    }

    @Transactional
    public Projects findProjectById(int id) {
        return projectsDAO.load(id);
    }

    @Transactional
    public Projects findProjectByTitle (String projectTitle) {
        return projectsDAO.findByName(projectTitle);
    }

    @Transactional
    public void deleteProject(String projectTitle){
        Projects project = projectsDAO.findByName(projectTitle);
        Set<Projects> check = new HashSet<>(projectsDAO.findAll());
        if (check.contains(project)){
            projectsDAO.delete(project);
        }
    }

    public void setProjectsDAO(ProjectsDAO projectsDAO) {
        this.projectsDAO = projectsDAO;
    }
}
