package HW3.DAO.hibernate;

import HW3.DAO.ProjectsDAO;
import HW3.Essences.Projects;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Alexander on 04/05/2017.
 */
public class HProjectsDAO implements ProjectsDAO{

    private SessionFactory sessionFactory;

    @Override
    public void save(Projects project) {
        sessionFactory.getCurrentSession().save(project);
    }

    @Override
    public Projects load(int id) {
        return sessionFactory.getCurrentSession().load(Projects.class, id);
    }

    @Override
    public Projects findByName(String projectTitle) {
        return (Projects) sessionFactory.getCurrentSession().createQuery("select p from Projects p where p.project_title like :projectTitle")
                .setParameter("projectTitle", projectTitle).uniqueResult();
    }

    @Override
    public void delete(Projects project) {
        sessionFactory.getCurrentSession().delete(project);
    }

    @Override
    public List findAll() {
        return sessionFactory.getCurrentSession().createQuery("select p from Projects p").list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
