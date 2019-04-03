<%@ page import="model.Product" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: Оля
  Date: 21.02.2019
  Time: 01:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page  language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product Page</title>
    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet"
          id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
<!------ Include the above in your HEAD tag ---------->

<div class="container">
    <div class="row">
        <ul class="thumbnails">
<c:forEach items="${products}" var="product">
            <li class="span4">
                <div class="thumbnail">
                    <img src="http://placehold.it/320x200" alt="ALT NAME">
                    <div class="caption">
                        <h3>${product.getName()}</h3>
                        <p>${product.getDescription()}</p>
                        <p align="center"><a href="/WApp/products/product?id=${product.getId()}" class="btn btn-primary btn-block">Open</a></p>
                    </div>
                </div>
            </li>
</c:forEach>
        </ul>
    </div>

</div>
</body>
</html>
