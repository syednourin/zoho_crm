<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list of all contacts</title>
</head>
<body>

<h2>show the contacts</h2>
<form>
<table>
      <tr>
          <th>Id</th>
          <th>FIRST NAME</th>
          <th>LAST NAME</th>
           <th>EMAIL</th>
           <th>LEAD SOURCE</th>
           <th>MOBILE</th>
           <th>BILLING</th>
      </tr>
   <c:forEach items="${contacts}" var="contacts">
       <tr>
          <td>${contacts.id}</td>
          <td><a href="getContactById?id=${contacts.id }">${contacts.firstName}</a></td>
           <td>${contacts.lastName}</td>
           <td>${contacts.email}</td>
           <td>${contacts.leadsource }</td>
           <td>${contacts.mobile }</td>
           <td><a href="getContactById?id=${contacts.id }">Generate Bill</a></td>
       </tr>
   </c:forEach>
</table>
</form>

</body>
</html>