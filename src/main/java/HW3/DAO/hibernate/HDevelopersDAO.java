package HW3.DAO.hibernate;

import HW3.DAO.DevelopersDAO;
import HW3.Essences.Developers;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Alexander on 04/05/2017.
 */
public class HDevelopersDAO implements DevelopersDAO {

    private SessionFactory sessionFactory;

    @Override
    public void save(Developers developer) {
        sessionFactory.getCurrentSession().save(developer);
    }

    @Override
    public Developers load(int id) {
        return sessionFactory.getCurrentSession().load(Developers.class, id);
    }

    @Override
    public Developers findByName(String name) {
        return (Developers) sessionFactory.getCurrentSession().createQuery("select d from Developers d where d.name like :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public void delete(Developers developer) {
        sessionFactory.getCurrentSession().delete(developer);
    }

    @Override
    public List findAll() {
        return sessionFactory.getCurrentSession().createQuery("select d from Developers d").list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
