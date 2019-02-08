<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="UTF-8">
    </head>
    <body bgcolor="yellow">
        <form action="insert.do">
        아이디 :  <input type="text" name="id"><br>
        이름 :  <input type="text" name="name"><br>
        가격 :  <input type="text" name="price"><br>
        가수 :  <input type="text" name="singer"><br>
        <input type="submit" value="서버로 전송">
        <input type="reset" value="초기화">
        </form> 
    </body>
</html>