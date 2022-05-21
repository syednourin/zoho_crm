<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>generate a bill</title>
</head>
<body>
    <h2>GENERATE A BILL</h2>
    <form action="generate"method="post" >
    <pre>
          FIRSTNAME<input type="text" name="firstName"value="${contacts.firstName}"/>
           LASTNAME<input type="text" name="lastName"value="${contacts.lastName}"/>
            EMAIL<input type="text" name="email"value="${contacts.email}"/>
            MOBILE<input type="text" name="mobile"value="${contacts.mobile}"/>
            PRODUCT NAME<input type="text"name="productname"/>
            AMOUNT PAID<input type="text"name="anount"/>
            <input type="submit"value="generate bill"/>
            </pre>
    </form>
</body>
</html>