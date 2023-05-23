package com.example.library.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDeleteDAO {
    private Connection connection;

    public BookDeleteDAO(Connection connection) {
        this.connection = connection;
    }
    public void deleteBook(int bookId) {
        try (
             PreparedStatement statement = connection.prepareStatement("DELETE FROM BookInventory WHERE book_id=?")) {
            statement.setInt(1, bookId);

            // Execute the delete statement
            statement.executeUpdate();
        } catch (SQLException e) {
            // Handle any errors that occurred during the delete process
            e.printStackTrace();
        }
    }


}

