<%--
  Created by IntelliJ IDEA.
  User: SyaoKyo
  Date: 2018/9/5
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<table border="1" width="100%">
  <tr>
    <th>stuNo</th>
    <th>stuName</th>
    <th>stuSex</th>
    <th>stuAge</th>
  </tr>
  <c:forEach items="${list}" var="a">
    <tr>
      <td>${a.stuNo}</td>
      <td>${a.stuName}</td>
      <td>${a.stuSex}</td>
      <td>${a.stuAge}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
