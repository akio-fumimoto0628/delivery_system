<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:import url="/WEB-INF/views/layout/app.jsp">
  <c:param name="content">
      <c:choose>
          <c:when test="${product != null}">
    <h2>id : ${product.id} 配達状況</h2>

<table>
    <tbody>
         <tr>
             <th>配達商品</th>
             <td><c:out value="${product.product_name}" /></td>
         </tr>
         <tr>
             <th>商品金額</th>
             <td><c:out value="${product.amount_money}" /></td>
         </tr>
         <tr>
             <th>チェック</th>
              <td><input type="radio" name="trigger" value="kannryou">完了</td>
         </tr>
     </tbody>
  </table>
</c:when>
</c:choose>
         <p><a href="${pageContext.request.contextPath}/products/index">一覧に戻る</a></p>
        <p><a href="${pageContext.request.contextPath}/products/edit?id=${product.id}">このメッセージを編集する</a></p>

</c:param>
</c:import>