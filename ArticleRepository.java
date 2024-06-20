package org.example.demo.repository;

import org.example.demo.entity.Article;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ArticleRepository {
    private final String MYSQL_CONNECTION_STRING = "jdbc:mysql://localhost:3306/student_manager";
    private final String MYSQL_USERNAME = "root";
    private final String MYSQL_PASSWORD = "";

    public void save(Article obj){
        System.out.println("Success");
        try {
            Connection connection = DriverManager.getConnection(MYSQL_CONNECTION_STRING,MYSQL_USERNAME, MYSQL_PASSWORD);
            String strSql = "insert into articles (title, description, content) values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(strSql);
            preparedStatement.setString(1, obj.getTitle());
            preparedStatement.setString(2, obj.getDescription());
            preparedStatement.setString(3, obj.getContent());
            preparedStatement.execute();
            System.out.println(preparedStatement);
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ArticleRepository articleRepository = new ArticleRepository();
        Article article = new Article();
        article.setTitle("Title");
        article.setDescription("Description");
        article.setContent("Content");
    }
}
