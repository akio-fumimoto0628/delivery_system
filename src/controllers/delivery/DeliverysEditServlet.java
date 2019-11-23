package controllers.delivery;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Delivery;
import models.Employee;
import utils.DBUtil;

/**
 * Servlet implementation class DeliverysEditServlet
 */
@WebServlet("/deliverys/edit")
public class DeliverysEditServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeliverysEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EntityManager em = DBUtil.createEntityManager();

        Delivery d = em.find(Delivery.class, Integer.parseInt(request.getParameter("id")));

        em.close();

        Employee login_employee = (Employee)request.getSession().getAttribute("login_employee");
        if(login_employee.getId() == d.getEmployee().getId()) {
            request.setAttribute("delivery", d);
            request.setAttribute("_token", request.getSession().getId());
            request.getSession().setAttribute("delivery_id", d.getId());
        }

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/deliverys/edit.jsp");
        rd.forward(request, response);
    }

}
