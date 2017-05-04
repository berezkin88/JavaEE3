package HW3.DAO.hibernate;

import HW3.DAO.CustomersDAO;
import HW3.Essences.Customers;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Alexander on 04/05/2017.
 */
public class HCustomersDAO implements CustomersDAO{

    private SessionFactory sessionFactory;

    @Override
    public void save(Customers customer) {
        sessionFactory.getCurrentSession().save(customer);
    }

    @Override
    public Customers load(int id) {
        return sessionFactory.getCurrentSession().load(Customers.class, id);
    }

    @Override
    public Customers findByName(String customer) {
        return (Customers) sessionFactory.getCurrentSession().createQuery("select c from Customers c where c.customer_name like :customer")
                .setParameter("customer", customer).uniqueResult();
    }

    @Override
    public void delete(Customers customer) {
        sessionFactory.getCurrentSession().delete(customer);
    }

    @Override
    public List findAll() {
        return sessionFactory.getCurrentSession().createQuery("select c from Customers c").list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
