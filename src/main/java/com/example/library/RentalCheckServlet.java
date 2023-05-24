package com.example.library;

import com.example.library.book.BookRentalDAO;
import com.example.library.book.BookVO;
import com.example.library.util.DatabaseUtil;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(name = "RentalCheckServlet", value = "/RentalCheckServlet")
public class RentalCheckServlet extends HttpServlet {

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

    @Override
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
        String userId = request.getParameter("userId");
        List<BookVO> bookList = new ArrayList<>();
        bookList = BookRentalDAO.getBooksByUserId(userId);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        request.setAttribute("bookList", bookList);
        // BookList.jsp로 이동
        ServletContext context = getServletContext().getContext("/");
        context.getRequestDispatcher("/ReturnPage.jsp").forward(request, response);


    }
}
