package controllers.delivery;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Delivery;
import models.Employee;
import models.validators.DeliveryValidator;
import utils.DBUtil;

/**
 * Servlet implementation class DeliverysCreateServlet
 */
@WebServlet("/deliverys/create")
public class DeliverysCreateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeliverysCreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String _token = (String)request.getParameter("_token");
        if(_token != null && _token.equals(request.getSession().getId())) {
            EntityManager em = DBUtil.createEntityManager();

            Delivery d = new Delivery();

            d.setEmployee((Employee)request.getSession().getAttribute("login_employee"));

            Date delivery_date = new Date(System.currentTimeMillis());
            String rd_str = request.getParameter("delivery_date");
            if(rd_str != null && !rd_str.equals("")) {
                delivery_date = Date.valueOf(request.getParameter("delivery_date"));
            }
            d.setDelivery_date(delivery_date);

            d.setMoney(Integer.parseInt(request.getParameter("money")));
            d.setContent(request.getParameter("content"));


            List<String> errors = DeliveryValidator.validate(d);
            if(errors.size() > 0) {
                em.close();

                request.setAttribute("_token", request.getSession().getId());
                request.setAttribute("delivery", d);
                request.setAttribute("errors", errors);

                RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/deliverys/new.jsp");
                rd.forward(request, response);
            } else {
                em.getTransaction().begin();
                em.persist(d);
                em.getTransaction().commit();
                em.close();
                request.getSession().setAttribute("flush", "登録が完了しました。");

                response.sendRedirect(request.getContextPath() + "/deliverys/index");
            }
        }
    }

}