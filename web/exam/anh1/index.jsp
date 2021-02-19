<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>

<!DOCTYPE HTML >
<html>
  <head>
 	<meta charset="UTF-8">
 	<title>login Servlet</title>
 </head>
  <body>
    <h1>Login</h1>
        <% String userName = (String) request.getAttribute("userName"); %>
       <% String password = (String) request.getAttribute("password"); %>
       <% String userCode = (String) request.getAttribute("userCode"); %>
		
    <br><br>
    <% if (userCode.equals("0")){ %>
     こんにちは、${userName} さん！
    <form method="post" action="./LoginServlet">
      userName : <input type="text" name="name"><br><br>
      password : <input type="password" name="password"><br><br>
      <INPUT type="submit" value="SEND">
      <INPUT type="reset" value="RESET">
    </form>
     <% } else if(userCode.equals("1") ) {%>
     こんにちは、 ${userName} さん！
     <button onclick="location.href='http://localhost:8080/LoginServ/LoginServlet'">OK(戻る)</button>
      <% } else if(userCode.equals("3") ) {%>
     こんにちは、 ${userName} さん！新規登録できました。
     <button onclick="location.href='http://localhost:8080/LoginServ/LoginServlet'">OK(戻る)</button>
     <% 	} else {  // ret 2%>
      ${userName} さん！パスワードが違います、再入力してください。
       <form method="post" action="./LoginServlet">
      userName : <input type="text" name="name"><br><br>
      password : <input type="password" name="password"><br><br>
      <INPUT type="submit" value="SEND">
      <INPUT type="reset" value="RESET">
    </form>
      <% }%>
  </body>
</html>
