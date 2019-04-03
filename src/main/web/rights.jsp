<%@ page import="model.Right" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Оля
  Date: 09.02.2019
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rights</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <table class="table table-striped table-dark">
        <thead>
        <tr class="h3">
            <th scope="col">#</th>
            <th scope="col">Right ID</th>
            <th scope="col">Right Name</th>
            <th scope="col">Update</th>
            <th scope="col">Delete</th>
        </tr>
        </thead>
        <tbody>
        <%
            int count = 1;
            ArrayList<Right> rights = (ArrayList<Right>) request.getAttribute("rights");
            for (Right right : rights) {
        %>

        <tr>
            <form action="rightsUpdate">
                <th scope="row"><%= count++%>
                </th>
                <td><input class="form-control" type="text" name="id" value="<%=right.getId()%>" readonly>
                </td>
                <td><input class="form-control" type="text" name="name" value="<%=right.getName()%>">
                </td>
                <td><input type="submit" class="btn btn-info" value="Update"></td>
            </form>
            <td>
                <a class="btn btn-danger" href="/WApp/rightsDelete?id=<%= right.getId() %>">Delete</a>
            </td>

        </tr>

        <%} %>
        </tbody>
    </table>

</div>
<div class="container">
    <div>
        <form action="/WApp/rightsCreate" method="post">
            <input type="text" name="rightName" placeholder="Name">
            <input type="submit" value="CREATE">
        </form>
    </div>
</div>
<hr/>
<a href="/WApp">HOME </a>
</body>
</html>
