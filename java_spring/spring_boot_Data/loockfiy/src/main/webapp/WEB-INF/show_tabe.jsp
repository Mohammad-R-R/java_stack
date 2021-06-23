<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
Title: <h2  >${songs.title}</h2><br>
Artist : <h2  >${songs.artist}</h2><br>
rating : <h2 >${songs.rating}</h2><br>

<a href="/delete/${songs.id} ">Delete</a>
</body>
</html>