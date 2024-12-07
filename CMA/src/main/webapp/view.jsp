<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<th>id</th>
		<th>courseName</th>
		<th>courseName</th>
		<th>fee</th>
		<th>instructor</th>

		<c:forEach items="data" var="course">
			<tr>{course.id}</tr>
			<tr>course.courseName</tr>
			<tr>course.fee</tr>
			<tr>course.instructor</tr>
		</c:forEach>

	</table>

</body>
</html>