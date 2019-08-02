<%--
  Created by IntelliJ IDEA.
  User: HenryXiao
  Date: 2019/8/2
  Time: 7:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
    <h3>跳转成功</h3>
    <c:forEach items="${list}" var="account">
        ${account.name}<br/>
    </c:forEach>
</body>
</html>
