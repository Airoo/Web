<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="locale" %>
<html>
<head>
    <link rel="stylesheet" href='<c:url value="/css/main.css"/>'>
    <script src='<c:url value="/js/main.js"/>'/>
    <title>Title</title>
</head>
<body>
    <div class="" style="height: 100px; background-color: cadetblue"></div>
    <jsp:doBody/>
</body>
</html>
