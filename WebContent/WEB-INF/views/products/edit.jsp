<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../layout/app.jsp">
    <c:param name="content">
        <c:choose>
            <c:when test="${product != null}">
                <h2>id : ${product.id} の配達商品編集ページ</h2>

                <form method="POST" action="${pageContext.request.contextPath}/products/update">
                    <c:import url="_form.jsp" />
                </form>

                <p><a href="${pageContext.request.contextPath}/products/index">一覧に戻る</a></p>
                <p><a href="#" onclick="confirmDestroy();">このメッセージを削除する</a></p>
                <form method="POST" action="${pageContext.request.contextPath}/products/destroy">
                    <input type="hidden" name="_token" value="${_token}" />
                </form>
                <script>
                function confirmDestroy() {
                    if(confirm("本当に削除してよろしいですか？")) {
                        document.forms[1].submit();
                    }
                }
                </script>
            </c:when>
            <c:otherwise>
                <h2>お探しのデータは見つかりませんでした。</h2>
            </c:otherwise>
         </c:choose>
    </c:param>
</c:import>