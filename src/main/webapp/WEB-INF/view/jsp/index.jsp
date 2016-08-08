<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Hello GOIT!!! It is now: ${currentTime} </h1>
<a href="/employees">Show all employees</a>
<a href="/dishes">Show all dishes</a>
<a href="/schema">Show cheme</a>
<form method="POST" action="findByWord">
    <table>
        <tr>
            <td>User Name :</td>
            <td><input path="name"/></td>

        </tr>
          <tr>
            <td colspan="2"><input type="submit"></td>
        </tr>
    </table>
</form>

</body>
</html>
