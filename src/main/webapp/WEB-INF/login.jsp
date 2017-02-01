<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="locale" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<t:template>
    <form action="/auth.htm" method="post">
        <input type="hidden" name="_spring_security_remember_me" value="true">
        <div>
            <label>Username:</label>
            <input type="text" name="username" value="" placeholder="Your name"/>
        </div>
        <div>
            <label>Password:</label>
            <input type="password" name="password" value=""/>
        </div>
        <div>
            <input type="submit" name="login" value="Log in"/>
        </div>
    </form>
    <p>
        <c:if test="${param.error == 'invalidLoginPassword'}">
            Invalid login or password. Please try again.
        </c:if>
    </p>
    <p>
        <c:if test="${param.error == 'loginRequired'}">
            You are currently logged off. Please log in.
        </c:if>
    </p>
</t:template>
