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
     </tbody>
  </table>
             <p><a href="${pageContext.request.contextPath}/products/index">一覧に戻る</a></p>
             <p><a href="${pageContext.request.contextPath}/products/edit?id=${product.id}">このメッセージを編集する</a></p>
         </c:when>
      <c:otherwise>
          <h2>お探しのデータは見つかりませんでした。</h2>
      </c:otherwise>
    </c:choose>
  </c:param>
</c:import>