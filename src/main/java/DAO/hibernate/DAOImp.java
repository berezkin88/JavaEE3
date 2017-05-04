package DAO.hibernate;

import DAO.DAOInterface;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.sql.*;

/**
 * Created by Alexander on 08/04/2017.
 */
public class DAOImp implements DAOInterface {
    private SessionFactory sessionFactory;

//    Not sure need it
    @Override
    @Transactional
    public void createDatabase(String databaseName) throws SQLException {
        sessionFactory.getCurrentSession().createSQLQuery("CREATE DATABASE " + databaseName).executeUpdate();

    }

//    Not sure need it
    @Override
    @Transactional
    public void createTable(String tableName, String params) throws SQLException {
        sessionFactory.getCurrentSession().createSQLQuery("CREATE TABLE " + tableName + "(" + params +")").executeUpdate();
    }

    @Override
    public void deleteTable(String tableName) {
        sessionFactory.getCurrentSession().createSQLQuery("DROP TABLE " + tableName);
    }

    @Override
    public void deleteDB(String databaseName) {
        sessionFactory.getCurrentSession().createSQLQuery("DROP TABLE " + databaseName);
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
