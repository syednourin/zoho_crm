<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list of all bills</title>
</head>
<body>

<h2>show the billing details</h2>
<form>
<table>
      <tr>
          <th>Id</th>
          <th>FIRST NAME</th>
          <th>LAST NAME</th>
          <th>MOBILE</th>
           <th>PRODUCT NAME</th>
           <th>AMOUNT</th>
      </tr>
   <c:forEach items="${bill}" var="bill">
       <tr>
          <td>${bill.id}</td>
          <td>${bill.firstName}</td>
           <td>${bill.lastName}</td>
           <td>${bill.mobile }</td>
           <td>${bill.productname }</td>
           <td>${bill.amount }</td>
           
       </tr>
   </c:forEach>
</table>
</form>

</body>
</html>