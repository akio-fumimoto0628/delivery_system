package controllers.delivery;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Delivery;

/**
 * Servlet implementation class DeliveryNewServlet
 */
@WebServlet("/deliverys/new")
public class DeliverysNewServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeliverysNewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("_token", request.getSession().getId());

        Delivery d = new Delivery();
        d.setDelivery_date(new Date(System.currentTimeMillis()));
        request.setAttribute("delivery", d);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/deliverys/new.jsp");
        rd.forward(request, response);
    }

}