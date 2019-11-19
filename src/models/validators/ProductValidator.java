package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Product;

public class ProductValidator {
    public static List<String> validate(Product p) {
        List<String> errors = new ArrayList<String>();

        String product_name_error = _validateProduct_name(p.getProduct_name());
        if(!product_name_error.equals("")) {
            errors.add(product_name_error);
        }

        String amount_money_error = _validateAmount_money(p.getAmount_money());
        if(!amount_money_error.equals("")) {
            errors.add(amount_money_error);
        }

        return errors;
    }

    private static String _validateProduct_name(String product_name) {
        if(product_name == null || product_name.equals("")) {
            return "商品名を入力してください。";
        }

        return "";
    }

    private static String _validateAmount_money(Integer amount_money) {
        if(amount_money == null) {
            return "金額を入力してください。";
        }
        return "";
    }
}
