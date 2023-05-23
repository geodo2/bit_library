package com.example.library;

import com.example.library.Dto.Member;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

@WebServlet(name = "SignupServlet", value = "/Signup-Servlet")
public class SignupServlet extends HttpServlet {
    private List<Member> memberList; // 링크드 리스트 선언

    @Override
    public void init() throws ServletException {
        super.init();
        memberList = new LinkedList<>(); // 링크드 리스트 초기화
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String author = req.getParameter("author");
        int quantity = req.getIntHeader("quantity");
        System.out.println(title);

        resp.setContentType("text/html");

        // Hello
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "message" + "</h1>");
        out.println("</body></html>");
        // JSP로 포워딩
     //   RequestDispatcher dispatcher = req.getRequestDispatcher("memberList.jsp");
      //  dispatcher.forward(req, resp);
    }
}
