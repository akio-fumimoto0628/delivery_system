package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Delivery;

public class DeliveryValidator {
    public static List<String> validate(Delivery d) {
        List<String> errors = new ArrayList<String>();

        String money_error = _validateMoney(d.getMoney());
        if(!money_error.equals("")) {
            errors.add(money_error);
        }

        String content_error = _validateContent(d.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }
        return errors;
    }
    private static String _validateMoney(Integer money) {
        if(money == null) {
            return "金額を入力してください。";
        }

        return "";
    }

    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "内容を入力してください。";
            }
        return "";
    }
}
