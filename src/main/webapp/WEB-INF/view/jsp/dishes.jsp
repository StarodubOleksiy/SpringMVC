<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
    <title></title>
</head>
<body>
<div class="dish">
<h1>Меню ресторана</h1>
<table style="align-items: center">
  <tr>
    <th> Name </th>
    <th>Weight</th>
    <th>Cost</th>
</tr>

  <c:forEach items="${dishes}" var="dish">
    <tr>
      <td> <a href="/dish?dishName=${dish.name}">${dish.name}</a></td>
      <td>${dish.weight}</td>
      <td>${dish.price}</td>
    </tr>
  </c:forEach>
</table>
  </div>

</body>
</html>
