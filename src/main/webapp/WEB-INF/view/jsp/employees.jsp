<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
    <title>Title</title>
</head>
<body>
<h1>Наш персонал</h1>
<div id="personal">
<table style="align-items: center">
  <tr>
    <th>Name </th>

  </tr>

  <c:forEach items="${employees}" var="employee">
    <tr>
      <td>${employee.name}</td>
      <td><img src="/resources/images/${employee.photography}"alt="Логотип" /></td>
    </tr>
  </c:forEach>
</table>
  </div>


</body>
</html>
