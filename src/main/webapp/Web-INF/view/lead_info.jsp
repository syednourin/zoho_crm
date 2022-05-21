5<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show the lead info</title>
</head>
<body>
<h2>created lead information</h2>

    Id: ${lead.id }<br/> 
    FIRST NAME:${lead.firstName }<br/>
    LAST NAME:${lead.lastName }<br/>
    EMAIL:${lead.email }<br/>
    LEADSOURCE:${lead.leadsource }<br/>
    MOBILE:${lead.mobile }<br/>
    
    <form action="compose"method="post">
        <input type="hidden" name="emailId"value="${lead.email }"/>
        <input type="submit"value="Email"/>
        </form>
        
        <form action="convertLead"method="post">
        <input type="hidden" name="id"value="${lead.id }"/>
        <input type="submit"value="Convert"/>
        </form>
  

</body>
</html>