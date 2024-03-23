<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2024/3/21
  Time: 8:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username = (String) request.getAttribute("username");
    String password = (String) request.getAttribute("password");
%>
<h2 align="center">学生信息管理页面</h2>
<table border="1" align="center" cellpadding="0" width="45%">
    <tr>
        <th>姓名：</th>
        <th>学号：</th>
    </tr>
    <tr>
        <td><%=username%></td>
        <td><%=password%></td>
    </tr>
</table>

</body>
</html>
