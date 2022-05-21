<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CREATE A LEAD</title>
</head>
<body>
    <h2>CREATE A LEAD</h2>
    <form action="savelead"method="post" >
    <pre>
          FIRSTNAME<input type="text" name="firstName">
           LASTNAME<input type="text" name="lastName">
            EMAIL<input type="text" name="email">
            LEADSOURCE:
            <select name="leadsource">
               <option value="tv commercial">TV COMMERCIAL</option>
               <option value="radio">RADIO</option>
               <option value="newspaper">NEWS PAPER</option>
               <option value="online">ONLINE</option>
            </select>
            MOBILE<input type="text" name="mobile">
            <input type="submit"value="save"/>
            </pre>
    </form>
</body>
</html>