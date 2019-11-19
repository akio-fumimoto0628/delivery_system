package controllers.product;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Product;

/**
 * Servlet implementation class ProductsRegistration
 */
@WebServlet("/products/registration")
public class ProductsRegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductsRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         //おまじないとしてインスタンスを生成
        request.setAttribute("product", new Product());

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/products/registration.jsp");
        rd.forward(request, response);
    }
}

