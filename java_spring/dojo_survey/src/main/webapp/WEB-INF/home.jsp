<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<form action="/submit" method= "POST">
your name : <input type="text" name= "name"><br>
Dojo location: <input type="text" name="combo"><br>
favoritr language : <input type = "text" name="lang"><br>
comment (optinal):<br>
<textarea rows="5" cols="10" name="comment"></textarea><br>
<button type="submit">submit</button>
</form>

</body>
</html>