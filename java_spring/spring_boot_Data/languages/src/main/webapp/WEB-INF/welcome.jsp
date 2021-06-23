<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="windows-1256">
<title>languages</title>
</head>
<body>
<form action="/getinf" method="post">
Name: <input type="text" name="name">
Creator: <input type = "text" name="creator">
Version: <input type="number" name="version">
<button type= "submit"> Submit</button>
</form>

<table class="table table-dark">
  <thead>
    <tr>
      
      <th scope="col">name</th>
      <th scope="col">Creator</th>
      <th scope="col">Version</th>
      <th scope="col">action</th>
    </tr>
  </thead>
  <tbody>
  <tr> 

  </tr>
  <c:forEach items="${model}" var="mod1">
    <tr>
      <td><a href="/show/${mod1.id}"> ${mod1.name} </a></td>
      <td>${mod1.creator}</td>
      <td>${mod1.version}</td>
      <td><a href="/delete/${mod1.id}" >delete </a>   <a href="/edit/${mod1.id}">  edit</a> </td>
    </tr>
 </c:forEach>
</table>
</body>
</html>