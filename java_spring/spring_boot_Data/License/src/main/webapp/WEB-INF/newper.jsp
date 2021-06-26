<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
      
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h1>New person</h1>
<form:form action="/tocreate" method="post" modelAttribute="Person">
    <p>
        <form:label path="firstName">firstName</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </p>
    <p>
        <form:label path="lastName">lastName</form:label>
        <form:errors path="lastName"/>
        <form:textarea path="lastName"/>
    </p>

  
    <input type="submit" value="Submit"/>
</form:form> 
</body>
</html>