<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${employee.name }님 정보수정입니다.</title>
</head>
<body>
<div>
<table>
  <thead>
    <tr>
      <th>직원번호</th>
      <th>직급</th>
      <th>이름</th>
      <th>전화번호</th>
      <th>이메일</th>
    </tr>
  </thead>
  <tbody>
</div>
<form action="/employeeUpdate/${employee.employee_number}">
<div>
     <td><input type="text" name="employee_number" id="employee_number" value="${employee.employee_number}" readonly></td>
     <td><input type="text" name="job_title" id="job_title" value="${employee.job_title}"/></td>
     <td><input type="text" name="name" id="name"  value="${employee.name}"/></td>
     <td><input type="text" name="phone" id="phone"  value="${employee.phone}"/></td>
     <td><input type="email" name="email" id="email"  value="${employee.email}"/></td>
  </div>
  </tbody>
</table>
<div>
     <input type="submit" value="정보수정"/>
     <input type="button" value="탈퇴하기" onclick="location.href='/employeeDelete/${employee.employee_number}'"/>
	 <a href="/employeeList">리스트 되돌아가기</a></td>
</div>
</form>
</body>
</html>