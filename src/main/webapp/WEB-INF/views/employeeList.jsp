<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
    <c:forEach var="employee" items="${employee }">
    <tr>
     <td>${fn:replace(employee.employee_number, '^(\\d{1,2})$', '00$1')}</td>
      <td>${employee.job_title}</td>
      <td>${employee.name}</td>
      <td>${employee.phone}</td>
      <td>${employee.email}</td>
    <td><a href="/employeeDetail/${employee.employee_number}">정보수정</a></td>
    </tr>
    </c:forEach>
  </tbody>
</table>
</div>
</body>
</html>