package com.stx.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.util.ResourceBundle;

public class DataSourceTest {
    @Test
//    测试手动创建 c3p0数据源。
    public void test1() throws Exception {
        ComboPooledDataSource dataSource =
                new ComboPooledDataSource();
        dataSource.setDriverClass("oracle.jdbc.driver.OracleDriver");
        dataSource.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:mldn");
        dataSource.setUser("scott");
        dataSource.setPassword("tiger");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
//    使用Druid配置数据库连接。
    @Test
    public void test2() throws Exception{
        DruidDataSource dataSource =
                new DruidDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:mldn");
        dataSource.setUsername("scott");
        dataSource.setPassword("tiger");
        DruidPooledConnection connection =
                dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
    /*
    * 配置文件连接数据库。
    * */
    @Test
    public void test3() throws Exception{
        ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");
        String driver = resourceBundle.getString("driver");
        String url = resourceBundle.getString("url");
        String user = resourceBundle.getString("user");
        String password = resourceBundle.getString("password");

//        1、创建数据源对象。2、设置连接参数。
        DruidDataSource dataSource =
                new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);

        Connection conn = dataSource.getConnection();
        System.out.println(conn);
    }
    /*
    *1、 利用applicationContext.xml配置文件来连接数据库。
    * 2、配置文件里面通过外部properties文件来引入具体的数据库。
    * */
    @Test
    public void test4() throws Exception{
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//   DataSource.class只有一个bean的时候可以用，多个bean的时候用id获取。
        DataSource dataSource=app.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }
}
