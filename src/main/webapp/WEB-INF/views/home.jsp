<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>JSP HOME</title>
</head>
<body>
<h1>
	직원 관리 프로그램 JSP
	직원 리스트 출력 :  출력형식: 직원번호, 직급, 이름, 전화번호, 이메일
  - 정렬: 이름순
  - 직원번호는 항상 3자리 숫자로 출력해야 한다(1일 경우 001로 출력)
</h1>
<div align="center">

<form method="POST" action="/employeeList">
  <label for="job_title">직급:
  <input type="text" name="job_title" required></label><br><br>
  
  <label for="name">이름:
  <input type="text" name="name" required></label><br><br>
  
  <label for="phone">전화번호:
  <input type="text" name="phone" required></label><br><br>
  
  <label for="email">이메일:
  <input type="email" name="email" required></label><br><br>
  
  <button type="submit">등록</button>
</form>

</div>
</body>
</html>