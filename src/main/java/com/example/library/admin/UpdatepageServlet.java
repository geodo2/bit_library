package com.example.library.admin;

import com.example.library.book.BookListDAO;
import com.example.library.book.BookVO;
import com.example.library.util.DatabaseUtil;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UpdatepageServlet", value = "/UpdatepageServlet")
public class UpdatepageServlet extends HttpServlet {
    private BookListDAO BookListDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        // 데이터베이스 연결 초기화 등의 작업 수행
        Connection connection = null; // 데이터베이스 연결 객체
        try {
            // 데이터베이스 연결
            connection = DatabaseUtil.getConnection(); // getConnection()은 데이터베이스 연결을 수행하는 메서드로 구현되어야 합니다.
            BookListDAO = new BookListDAO(connection);
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
        try {
            // 책 리스트 조회
            List<BookVO> bookList = BookListDAO.getAllBooks();
            System.out.println("책 전달");
            // 조회된 책 리스트를 JSP에 전달
            request.setAttribute("bookList", bookList);
            // BookList.jsp로 이동
            ServletContext context = getServletContext().getContext("/");
            context.getRequestDispatcher("/bookUpdate.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            // 오류 처리
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // doPost() 메서드에서 필요한 로직이 있다면 구현
    }

    @Override
    public void destroy() {
        super.destroy();
        // 데이터베이스 연결 종료 등의 정리 작업 수행
        // 연결된 데이터베이스 리소스 반환 등
    }

    private Connection getConnection() throws SQLException {
        // 데이터베이스 연결 코드를 구현하여 연결된 Connection 객체 반환
        // 연결 설정, 드라이버 로딩 등
        return null; // 실제 코드에서는 연결된 Connection 객체를 반환해야 합니다.
    }
}
