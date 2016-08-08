
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table style="align-items: center">
  <tr>
    <th> Name </th>
    <th>Dish category </th>
    <th>Price</th>
    <th>Weight</th>

  </tr>

  <tr>
    <td>${dish.name}</td>
    <td>${dish.dishCategory}</td>
    <td>${dish.price}</td>
    <td>${dish.weight}</td>
  </tr>
</table>

<table style="align-items: center">
  <tr>
    <th>Ingradients </th>
  </tr>
  <c:forEach var="ingradients" items="${ingradients}" >
  <tr>
    <td>${ingradients.name}</td>
  </tr>
  </c:forEach>
</table>
</body>
</html>
