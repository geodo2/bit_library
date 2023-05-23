package com.example.library.book;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BookUpdateDAO{
    private Connection connection;

    public BookUpdateDAO(Connection connection) {
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
    public void updateBook(int bookId, String title, String author, String publisher, String weight, int quantity) {

        try (
             PreparedStatement statement = connection.prepareStatement("UPDATE BookInventory SET title=?, author=?, publisher=?, book_weight=?, quantity=? WHERE book_id=?")) {
            statement.setString(1, title);
            statement.setString(2, author);
            statement.setString(3, publisher);
            statement.setString(4, weight);
            statement.setInt(5, quantity);
            statement.setInt(6, bookId);

            // Execute the update statement
            statement.executeUpdate();
        } catch (SQLException e) {
            // Handle any errors that occurred during the update process
            e.printStackTrace();
        }
    }

}
