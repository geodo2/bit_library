package com.example.library.admin;

import com.example.library.book.BookUpdateDAO;
import com.example.library.util.DatabaseUtil;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(name = "DeleteActionServlet", value = "/DeleteActionServlet")
public class DeleteActionServlet extends HttpServlet {
    private com.example.library.book.BookUpdateDAO BookUpdateDAO;
    public void init() throws ServletException {
        super.init();
        // 데이터베이스 연결 초기화 등의 작업 수행
        Connection connection = null; // 데이터베이스 연결 객체
        try {
            // 데이터베이스 연결
            connection = DatabaseUtil.getConnection(); // getConnection()은 데이터베이스 연결을 수행하는 메서드로 구현되어야 합니다.
            BookUpdateDAO = new BookUpdateDAO(connection);
            System.out.println("BookListDAO 데이터베이스 처리는 성공");
        } catch (SQLException e) {
            // 데이터베이스 연결 오류 처리
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        int bookId = Integer.parseInt(request.getParameter("bookId"));
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String publisher = request.getParameter("publisher");
        String weight = request.getParameter("weight");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        System.out.println(bookId+title+author);

        BookUpdateDAO.updateBook(bookId,title,author,publisher,weight,quantity);






        System.out.println("수정 완료 !!");

        // Perform book update logic
        // ...

        // Redirect or forward to another page
        // ...
        response.sendRedirect("index.jsp");
    }
}
