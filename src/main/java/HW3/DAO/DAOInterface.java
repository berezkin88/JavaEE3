package HW3.DAO;

import java.sql.SQLException;

/**
 * Created by Alexander on 08/04/2017.
 */
public interface DAOInterface {

    void createDatabase(String databaseName) throws SQLException;
    void createTable(String tableName, String params) throws SQLException;
    void deleteTable(String tableName);
    void deleteDB(String databaseName);
}
