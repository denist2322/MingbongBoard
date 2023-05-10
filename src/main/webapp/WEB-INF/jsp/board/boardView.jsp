<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>민봉님 게시판</title>
</head>
<body>
<h1>민봉 게시판</h1>
<c:forEach var="board" items="${boardAll}">
	<div>
	<p>제목: <c:out value="${board.TITLE}"/></p>
	<p>내용: <c:out value="${board.BODY}"/></p>
	</div>
</c:forEach>
</body>
</html>