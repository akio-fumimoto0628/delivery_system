<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<label for ="product_name">商品名</label><br />
<input type="text" name ="product_name" value="${products.product_name}" />
<br /><br />

<label for ="amount_money">金額</label><br />
<input type="text" name ="amount_money" value="${products.amount_money}" />
<br /><br />

<input type="hidden" name ="_token" value="${_token}" />
<button type="submit">登録</button>
