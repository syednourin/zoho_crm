<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list of all leads</title>
</head>
<body>
<a href="view">Create new lead</a>
<h2>list of all leads</h2>

<table>
      <tr>
          <th>Id</th>
          <th>FIRST NAME</th>
          <th>LAST NAME</th>
           <th>EMAIL</th>
           <th>LEAD SOURCE</th>
           <th>MOBILE</th>
      </tr>
   <c:forEach items="${leads}" var="lead">
       <tr>
          <td>${lead.id}</td>
          <td><a href="getLeadById?id=${lead.id }">${lead.firstName}</a></td>
           <td>${lead.lastName}</td>
           <td>${lead.email}</td>
           <td>${lead.leadsource }</td>
           <td>${lead.mobile }</td>
       </tr>
   </c:forEach>
</table>

</body>
</html>