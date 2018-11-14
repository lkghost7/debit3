package by.itacademy.servlet;


import by.itacademy.dao.generic.DebitorDaoImpl;
import by.itacademy.model.Debitor;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        List<Debitor> debitorList = DebitorDaoImpl.getDebitorDao().findAll();
        req.setAttribute("debitorList", debitorList);

        getServletContext()
                .getRequestDispatcher("/WEB-INF/jsp/admin.jsp")
                .forward(req, resp);
    }
}