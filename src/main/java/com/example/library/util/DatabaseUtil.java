package com.example.library.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    public static void main(String[] args) {
    	System.out.println("안녕하세요");
    	
        String url = "jdbc:mysql://localhost:3306/minbook"; // MySQL 서버 URL
        String username = "root"; // MySQL 사용자 이름
        String password = "1234"; // MySQL 비밀번호

        try {
            // JDBC 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 데이터베이스 연결
            Connection connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("MySQL에 연결되었습니다.");
            } else {
                System.out.println("MySQL에 연결할 수 없습니다.");
            }

            // 연결 종료
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버를 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("MySQL에 연결할 수 없습니다.");
            e.printStackTrace();
        }
    }
}