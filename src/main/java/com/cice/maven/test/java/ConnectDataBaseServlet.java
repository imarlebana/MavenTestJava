package com.cice.maven.test.java;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class ConnectDataBaseServlet  extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url ="jdbc:mysql://localhost:8889";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = getConnection(url,"root","root");
            Statement statement = connection.createStatement();
            String query = "CREATE DATABASE cice;";
            statement.execute(query);
            query = "use cice;";
            statement.execute(query);
            query = " CREATE TABLE test (id int AUTO_INCREMENT,titulo varchar(255),PRIMARY KEY (id) );";
            statement.execute(query);
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
