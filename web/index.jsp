<%--
  Created by IntelliJ IDEA.
  User: Оля
  Date: 04.02.2019
  Time: 23:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
  </head>
  <body>

  <div class="container" style="margin-top: 15px">
    <form action="/WApp/main" method="post">
      <div class="row">
        <div class="col-1">Email</div>
        <div class="col-4"><input name="email" class="padding-left" type="email" placeholder="email"/></div>
      </div>
      <div class="row">
        <div class="col-1">Password:</div>
        <div class="col-11"><input name="pass" class="padding-left" type="password" placeholder="password"/></div>
      </div>
      <div class="row">
        <div class="col-1">Press:</div>
        <div class="col-4"><input type="submit" value="Login"></div>
      </div>
    </form>
  </div>
  <div>
    <a href="/WApp/rightsGetAll">show all rights</a>
  </div>
  <div>
    <a href="/WApp/products">Show all Products</a>
  </div>
  </body>
</html>
