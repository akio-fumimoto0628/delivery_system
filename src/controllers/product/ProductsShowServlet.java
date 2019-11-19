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
 * Servlet implementation class ProductsShowServlet
 */
@WebServlet("/products/show")
public class ProductsShowServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductsShowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //おまじないとしてインスタンスを生成
        request.setAttribute("product", new Product());

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/products/show.jsp");
        rd.forward(request, response);
    }
}
