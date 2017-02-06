<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="locale" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<t:template>
    <table>
    <thead class="tg">
    <h3>Products List</h3>
    <c:if test="${!empty products}">
        <tr>
            <th>Id</th>
            <th>Title</th>
            <th>Description</th>
            <th>Count</th>
            <th>Price</th>
            <th>Category Id</th>
            <th>Category title</th>
        </tr>
        </thead>
        <c:forEach items="${products}" var="product">
            <tbody class="tg">
            <tr>
                <td>${product.id}</td>
                <td>${product.title}</td>
                <td>${product.description}</td>
                <td>${product.count}</td>
                <td>${product.price}</td>
                <td>${product.productCategory.id}</td>
                <td>${product.productCategory.title}</td>
                <td><a href="<c:url value='/edit/${product.id}' />">Edit</a></td>
                <td><a href="<c:url value='/product/remove/${product.id}' />">Delete</a></td>
            </tr>
            </tbody>
        </c:forEach>
        </table>
    </c:if>
   <%--<<h3>--%>
        <%--Add a Product--%>
    <%--</h3>--%>
    <%--<c:url var="addAction" value="/product/add"></c:url>--%>
    <%--<form:form action="${addAction}" commandName="product">--%>
        <%--<table>--%>
            <%--<c:if test="${!empty product.title}">--%>
                <%--<tr>--%>
                    <%--<td>--%>
                        <%--<form:label path="id">--%>
                            <%--<locale:message text="ID"/>--%>
                        <%--</form:label>--%>
                    <%--</td>--%>
                    <%--<td>--%>
                        <%--<form:input path="id" readonly="true" size="8" disabled="true"/>--%>
                        <%--<form:hidden path="id"/>--%>
                    <%--</td>--%>
                <%--</tr>--%>
            <%--</c:if>--%>
            <%--<tr>--%>
                <%--<td>--%>
                    <%--<form:label path="title">--%>
                        <%--<locale:message text="Title"/>--%>
                    <%--</form:label>--%>
                <%--</td>--%>
                <%--<td>--%>
                    <%--<form:input path="title"/>--%>
                <%--</td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td>--%>
                    <%--<form:label path="description">--%>
                        <%--<locale:message text="Description"/>--%>
                    <%--</form:label>--%>
                <%--</td>--%>
                <%--<td>--%>
                    <%--<form:input path="description"/>--%>
                <%--</td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td colspan="2">--%>
                    <%--<c:if test="${!empty person.title}">--%>
                        <%--<input type="submit"--%>
                               <%--value="<locale:message text="Edit Product"/>"/>--%>
                    <%--</c:if>--%>
                    <%--<c:if test="${empty person.title}">--%>
                        <%--<input type="submit"--%>
                               <%--value="<locale:message text="Add Product"/>"/>--%>
                    <%--</c:if>--%>
                <%--</td>--%>
            <%--</tr>--%>
        <%--</table>--%>
    <%--</form:form>--%>
    <%--<br>--%>

</t:template>



