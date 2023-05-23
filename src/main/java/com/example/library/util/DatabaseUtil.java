package com.example.library.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/minbook"; // MySQL 서버 URL
        String username = "root"; // MySQL 사용자 이름
        String password = "1234"; // MySQL 비밀번호

        // JDBC 드라이버 로드
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 데이터베이스 연결
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}
