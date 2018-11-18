package by.itacademy.servlet;

import by.itacademy.model.SystemUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/adminFillPage")
public class AdminFillPageController extends HttpServlet {


//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setAttribute("systemuserList", DebitorDaoImpl.getDebitorDao().findAll());
//        req.setAttribute("myName", "Выберите категорию");
//        showPage(req, resp);
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/user");
    }

    private SystemUser getReqForSystemUser(HttpServletRequest request) {
        SystemUser systemUser = new SystemUser();
        systemUser.setNameUser("Admin");
        systemUser.setEmail("Email");
        systemUser.setPasswordUser("pass");
        return systemUser;
    }

    private void showPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/jsp/adminFillPage.jsp").forward(req, resp);
    }
}