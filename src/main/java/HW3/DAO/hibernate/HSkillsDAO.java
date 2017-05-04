package HW3.DAO.hibernate;

import HW3.DAO.SkillsDAO;
import HW3.Essences.Skills;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Alexander on 04/05/2017.
 */
public class HSkillsDAO implements SkillsDAO {

    private SessionFactory sessionFactory;

    @Override
    public void save(Skills skill) {
        sessionFactory.getCurrentSession().save(skill);
    }

    @Override
    public Skills load(int id) {
        return sessionFactory.getCurrentSession().load(Skills.class, id);
    }

    @Override
    public Skills findByName(String skill) {
        return (Skills) sessionFactory.getCurrentSession().createQuery("select s from Skills s where s.area_of_skill like :skill")
                .setParameter("skill", skill).uniqueResult();
    }

    @Override
    public List findAll() {
        return sessionFactory.getCurrentSession().createQuery("select p from Projects p").list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
