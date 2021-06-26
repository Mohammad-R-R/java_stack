<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<form:form action="toCreateNinja" method="post" modelAttribute="ninja">

<form:select path="dojo">
<form:label path="dojo"> Dojo</form:label>


<c:forEach items="${name}" var="doj">
<option value="${doj.getId()}">${doj.getName()}</option>
</c:forEach>
</form:select>

<form:label path="firstName">first Name</form:label>
<form:input path="firstName"/>

<form:label path="lastName">last Name</form:label>
<form:input path="lastName"/>

<form:label path="age">last Name</form:label>
<form:input path="age" />

<input type="submit" value="Create">
</form:form>



</body>
</html>