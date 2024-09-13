package tools;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;

public class DataSourceProvider {
    private static DataSource instance;

    public static DataSource getDataSourceInstance()
    {
        if (instance == null)
        {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setServerName("localhost");
            dataSource.setPort(3306);
            dataSource.setDatabaseName("app_db");
            dataSource.setUser("root");
            dataSource.setPassword("root");
            instance = dataSource;
        }
        return instance;
    }
}
