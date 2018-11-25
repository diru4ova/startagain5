
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Olena
  Date: 18.11.2018
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Messages</title>
</head>
<body>

Here are messages

<c:forEach items="${messageList}" var="message">
    <li id="message_<c:out value="message.id"/>">
        <div class="messageText">
            <c:out value="${message.text}"></c:out>
        </div>
        <div>
            <span class="messageTime"><c:out value="${message.time}"></c:out></span>
            <span class="messageLocation"><c:out value="${message.lattitude}"/>, <c:out value="${message.longitude}"/></span>
        </div>[
    </li>
</c:forEach>




</body>
</html>
