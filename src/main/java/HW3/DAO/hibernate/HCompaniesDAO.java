package HW3.DAO.hibernate;

import HW3.DAO.CompaniesDAO;
import HW3.Essences.Companies;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Alexander on 04/05/2017.
 */
public class HCompaniesDAO implements CompaniesDAO {

    private SessionFactory sessionFactory;

    @Override
    public void save(Companies company) {
        sessionFactory.getCurrentSession().save(company);
    }

    @Override
    public Companies load(int id) {
        return sessionFactory.getCurrentSession().load(Companies.class, id);
    }

    @Override
    public Companies findByName(String name) {
        return (Companies) sessionFactory.getCurrentSession().createQuery("select c from Companies c where c.company_name like :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public void delete(Companies company) {
        sessionFactory.getCurrentSession().delete(company);
    }

    @Override
    public List findAll() {
        return sessionFactory.getCurrentSession().createQuery("select c from Companies c").list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
