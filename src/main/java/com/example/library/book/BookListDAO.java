package com.example.library.book;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BookListDAO{
    private Connection connection;

    public BookListDAO(Connection connection) {
        this.connection = connection;
    }

    public List<BookVO> getAllBooks() throws SQLException {
        List<BookVO> bookList = new ArrayList<>();

        String query = "SELECT * FROM BookInventory";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                BookVO book = new BookVO();
                book.setBookId(resultSet.getInt("book_id"));
                book.setBookWeight(resultSet.getInt("book_weight"));
                book.setTitle(resultSet.getString("title"));
                book.setAuthor(resultSet.getString("author"));
                book.setPublisher(resultSet.getString("publisher"));
                book.setQuantity(resultSet.getInt("quantity"));
                book.setAvailable(resultSet.getInt("is_available") == 1);
                book.setBorrowerId(resultSet.getString("borrower_id"));
                book.setBorrowDate(resultSet.getDate("borrow_date"));
                book.setDueDate(resultSet.getDate("due_date"));
                book.setReturnDate(resultSet.getDate("return_date"));

                bookList.add(book);
            }
        }

        return bookList;
    }
    public BookVO getBookById(int bookId) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        BookVO book = null;

        try {
            String query = "SELECT * FROM BookInventory WHERE book_id = ?";
            stmt = connection.prepareStatement(query);
            stmt.setInt(1, bookId);
            rs = stmt.executeQuery();

            if (rs.next()) {
                book = new BookVO();
                book.setBookId(rs.getInt("book_id"));
                book.setBookWeight(rs.getInt("book_weight"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setPublisher(rs.getString("publisher"));
                book.setQuantity(rs.getInt("quantity"));
                book.setAvailable(rs.getBoolean("is_available"));
                book.setBorrowerId(rs.getString("borrower_id"));
                book.setBorrowDate(rs.getDate("borrow_date"));
                book.setDueDate(rs.getDate("due_date"));
                book.setReturnDate(rs.getDate("return_date"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the statement and result set
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return book;
    }

}
