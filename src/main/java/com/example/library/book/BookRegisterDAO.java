package com.example.library.book;
import java.sql.Connection;
import jakarta.servlet.ServletContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.library.util.DatabaseUtil;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookRegisterDAO {
    public void bookRegister(String title, String author,String publisher, int quantity, int book_weight) {
        try (Connection connection = DatabaseUtil.getConnection()) {
            int isAvailable = 1;
            int borrowerId = 0;
            String borrowDate = null;
            String dueDate = null;
            String returnDate = null;
            String insertQuery = "INSERT INTO BookInventory (book_weight, title, author, publisher, quantity, is_available, borrower_id, borrow_date, due_date, return_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//도서 제목을 입력받는 코드
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1, book_weight);
            preparedStatement.setString(2, title);
            preparedStatement.setString(3, author);
            preparedStatement.setString(4, publisher);
            preparedStatement.setInt(5, quantity);
            preparedStatement.setInt(6, isAvailable);
            preparedStatement.setInt(7, borrowerId);
            preparedStatement.setString(8, borrowDate);
            preparedStatement.setString(9, dueDate);
            preparedStatement.setString(10, returnDate);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("도서 등록이 완료되었습니다.");
            } else {
                System.out.println("도서 등록에 실패하였습니다.");
            }
        } catch (SQLException e) {
            System.out.println("데이터베이스 연결 오류: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 로드 오류: " + e.getMessage());
        }
    }
}