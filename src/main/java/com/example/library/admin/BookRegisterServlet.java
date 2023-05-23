package com.example.library.admin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import com.example.library.book.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BookRegisterServlet", value = "/BookRegisterServlet")
public class BookRegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 파라미터 값 얻기
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String publisher = request.getParameter("publisher");
        int book_weight = Integer.parseInt(request.getParameter("book_weight"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        // 받은 파라미터 값 사용
        System.out.println("책 이름: " + title);
        System.out.println("저자: " + author);
        System.out.println("책 무게: " + book_weight);
        System.out.println("출판사: " + publisher);
        System.out.println("수량: " + quantity);

        // TODO: 받은 파라미터 값으로 필요한 작업 수행
        BookRegisterDAO bookRegisterDAO = new BookRegisterDAO();
        bookRegisterDAO.bookRegister(title, author,publisher, quantity,book_weight);
        // 응답 설정
        ServletContext context = getServletContext().getContext("/");
        context.getRequestDispatcher("/admin.jsp").forward(request, response);

    }
}
