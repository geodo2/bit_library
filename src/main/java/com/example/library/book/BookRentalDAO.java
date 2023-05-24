package com.example.library.book;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookRentalDAO {


    private Connection connection;

    public BookRentalDAO(Connection connection) {
        this.connection = connection;
    }
    public Date calculateDueDate() {
        LocalDate currentDate = LocalDate.now();
        LocalDate dueDate = currentDate.plusDays(7);
        return Date.valueOf(dueDate);
    }
    public Date rentalBook(int bookId, String userId) {
        try (PreparedStatement statement = connection.prepareStatement("UPDATE BookInventory SET quantity = quantity - 1, borrower_id = ?, borrow_date = ?, due_date = ? WHERE book_Id = ?")) {
            statement.setString(1, userId);
            statement.setDate(2, Date.valueOf(LocalDate.now()));
            statement.setDate(3, calculateDueDate());
            statement.setInt(4, bookId);
            System.out.println("데이터가 다 들어왔는지 확인");
            // Execute the update statement
            statement.executeUpdate();
            return calculateDueDate();
        } catch (SQLException e) {
            // Handle any errors that occurred during the update process
            e.printStackTrace();
        }
        return null;
    }

    public List<BookVO> getBooksByUserId(String userId) {
        List<BookVO> books = new ArrayList<>();

        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM BookInventory WHERE borrower_id = ?")) {
            statement.setString(1, userId);

            // Execute the query
            ResultSet resultSet = statement.executeQuery();

            // Iterate over the result set and create BookVO objects
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

                books.add(book);
            }
        } catch (SQLException e) {
            // Handle any errors that occurred during the query process
            e.printStackTrace();
        }

        return books;
    }

    public void returnBook(int bookId, String userId) {

        System.out.println("여기 까지 값이 넘어오는지 확인");
        try (PreparedStatement statement = connection.prepareStatement("UPDATE BookInventory SET quantity = quantity + 1, borrower_id = NULL, borrow_date = NULL, due_date = NULL, return_date = ? WHERE book_id = ? AND borrower_id = ?")) {
            statement.setDate(1, Date.valueOf(LocalDate.now()));
            statement.setInt(2, bookId);
            statement.setString(3, userId);

            // Execute the update statement
            statement.executeUpdate();
        } catch (SQLException e) {
            // Handle any errors that occurred during the update process
            e.printStackTrace();
        }
    }
}
