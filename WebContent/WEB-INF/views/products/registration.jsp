<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:import url="/WEB-INF/views/layout/app.jsp">
    <c:param name="content">
        <h2>商品登録</h2>
        <form method="POST" action="/delivery_system/models.Validator/registration/validator">
        <label for ="product_name">商品名</laber><br />
        <input type="text name="product_name" value=${prodcts.product_name} />
        <br />
        <label for="amountmoney">値段</label><br />
        <input type="text name="amountmoney" value=${prodcts.amountmoney} />
        <br />

        <input type="hidden" name="_token" value="${_token}" />
        <button type="submit">登録</button><br />
        <br /><br />
        <button type="submit">編集</button><br />
    </c:param>
</c:import>
