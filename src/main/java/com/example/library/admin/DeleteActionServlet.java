package com.example.library.admin;

import com.example.library.book.BookDeleteDAO;
import com.example.library.book.BookVO;
import com.example.library.util.DatabaseUtil;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(name = "DeleteActionServlet", value = "/DeleteActionServlet")
public class DeleteActionServlet extends HttpServlet {
    private com.example.library.book.BookDeleteDAO BookDeleteDAO;
    public void init() throws ServletException {
        super.init();
        // 데이터베이스 연결 초기화 등의 작업 수행
        Connection connection = null; // 데이터베이스 연결 객체
        try {
            // 데이터베이스 연결
            connection = DatabaseUtil.getConnection(); // getConnection()은 데이터베이스 연결을 수행하는 메서드로 구현되어야 합니다.
            BookDeleteDAO = new BookDeleteDAO(connection);
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
        String bookId = request.getParameter("bookId");
        System.out.println("Received bookId: " + bookId);
        int bookeditnum = Integer.parseInt(bookId);

        // 책 리스트 조회
        BookDeleteDAO.deleteBook(bookeditnum);

        // 조회된 책 리스트를 JSP에 전달

        // BookList.jsp로 이동
        ServletContext context = getServletContext().getContext("/");
        context.getRequestDispatcher("/admin.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data

    }
}
