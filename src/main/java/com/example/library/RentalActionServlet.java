package com.example.library;

import com.example.library.book.BookDeleteDAO;
import com.example.library.book.BookRegisterDAO;
import com.example.library.book.BookRentalDAO;
import com.example.library.util.DatabaseUtil;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "RentalActionServlet", value = "/RentalActionServlet")
public class RentalActionServlet extends HttpServlet {

    private com.example.library.book.BookRentalDAO BookRentalDAO;
    public void init() throws ServletException {
        super.init();
        // 데이터베이스 연결 초기화 등의 작업 수행
        Connection connection = null; // 데이터베이스 연결 객체
        try {
            // 데이터베이스 연결
            connection = DatabaseUtil.getConnection(); // getConnection()은 데이터베이스 연결을 수행하는 메서드로 구현되어야 합니다.
            BookRentalDAO = new BookRentalDAO(connection);
            System.out.println("Rental 데이터베이스 처리는 성공");
        } catch (SQLException e) {
            // 데이터베이스 연결 오류 처리
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve the values from the request
        int bookId = Integer.parseInt(request.getParameter("bookId"));
        String userId = request.getParameter("userId");

        Date dueDate = BookRentalDAO.rentalBook(bookId, userId);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String message = "해당 일자까지 반납하면 됩니다: " + dateFormat.format(dueDate);

        // Set the response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Write the response
        out.println("<html><body>");
        out.println("<script>alert('" + message + "');</script>");
        out.println("<script>setTimeout(function() { window.location.href = 'userMain.jsp'; }, 2000);</script>");
        out.println("</body></html>");

        out.close();
        // Perform any necessary operations with the values
        // ...

        // Set the response content type

    }
}
