<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="register" method="POST">
        <pre>
        User Id      : <input type="number" name="id" /><br>
        Username     : <input type="text" name="username" /><br>
        Phone#       : <input type="number" name="phone" /><br>
        Email        : <input type="email" name="email" /><br>
        Address      : <input type="address" name="address" /><br>
        Reg Date     : <input type="string" name="reg_date" /><br>
        Password     : <input type="password" name="password" /><br>
        Upload Photo : <input type="string" name="upload_photo" /><br>
                       <input type="submit" value="Sign Up" /><br>
       </pre>
     </form>
</body>
</html>