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
<h1>new license</h1>

<form:form action="/tocreate/line" method="post" modelAttribute="License">
  <p>
        <form:label path="exirationDate">expiration Date</form:label>
        <form:errors path="exirationDate"/>
        <form:input type="date"  path="exirationDate"/>
    </p>
    <p>
        <form:label path="state">state</form:label>
        <form:errors path="state"/>
        <form:textarea path="state"/>
    </p>
 <p>
        <form:label path="person">person</form:label>
        <form:errors path="person"/>
        <form:select path="person">
        	<c:forEach items="${x }" var="person">
            <form:option value="${person.getId() }">${person.firstName }_${person.lastName }</form:option>
            </c:forEach>
        </form:select>
    </p>
  
    <input type="submit" value="Submit"/>
</form:form> 

</body>
</html>