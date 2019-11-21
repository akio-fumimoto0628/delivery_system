<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:import url="/WEB-INF/views/layout/app.jsp">
<c:param name="content">
<h2>配達状況</h2>

<table>
    <tbody>
         <tr>
             <th>配達商品</th>
             <th>商品金額</th>
             <th>個数</th>
             <th>小計</th>
         </tr>
         <tr>
             <td>
                <select name="product_name"><option value="${product.product_name}" /></select>
             </td>
             <td><c:out value="${product.product_name}" /></td>
             <td><c:out value="${product.amount_money}" /></td>
             <td></td>
         </tr>
    </tbody>
</table>
</c:param>
</c:import>