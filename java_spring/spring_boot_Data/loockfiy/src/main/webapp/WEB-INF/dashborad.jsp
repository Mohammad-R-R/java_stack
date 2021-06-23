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
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<style>
.hello{
display:flex;
justify-content: space-around;
}
</style>
<body>
<div class="hello" >
<a href="/toaddnew">Add new</a> <br>
<a href="/top10">Top songs</a>
<form action="/search">
<input type= "text" name= "search">
<button type="submit">search artists</button>
</form>

</div>
<br>
<br>


<table class="table table-dark">
  <thead>
    <tr>
      
      <th scope="col">Title</th>
      <th scope="col">Rating</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${songs}" var="song">
    <tr>
      <td> <a href = "/show/${song.id}">${song.title}</a></td>
      <td>${song.rating}</td>
      <td><a href = "/delete/${song.id}">delete</a></td>
      <td> </td>
    </tr>
  
  
    </c:forEach>
  </tbody>
</table>

</body>
</html>