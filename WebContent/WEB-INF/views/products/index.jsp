<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../layout/app.jsp">
    <c:param name="content">
        <h2>登録商品一覧</h2>
        <ul>
            <c:forEach var="product" items="${products}">
                <li>
                    <a href="${pageContext.request.contextPath}/products/show?id=${product.id}">
                        <c:out value="${product.id}" />
                    </a>
                    ：<c:out value="${product.product_name}"></c:out> &gt; <c:out value="${product.amount_money}" />
                </li>
            </c:forEach>
        </ul>

        <p><a href="${pageContext.request.contextPath}/products/new">新規商品の登録</a></p>

    </c:param>
</c:import>