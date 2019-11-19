package models.validators;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registrationvalidator
 */
@WebServlet("/registration/validator")
public class Registrationvalidator extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registrationvalidator() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // リクエストパラメータを取得する
        String product_name = request.getParameter("product_name");
        String amountmoney = request.getParameter("amountmoney");

        // 入力内容にチェック （バリテーション)
        List<String> errors = new ArrayList<String>();

        if(product_name == null || product_name.equals("")) {
            errors.add("商品名を入力してください");
        }
        if(amountmoney == null) {
            errors.add("金額を入力してください");
        }

        // 入力内容にエラーがあったかどうか
        if(errors.size() > 0) {
            // JSPにエラー内容を送る
            request.setAttribute("errors", errors);
        } else {
        // JSPに値を送る
        request.setAttribute("product_name",product_name);
        request.setAttribute("amountmoney",amountmoney);

        }

    }

}
