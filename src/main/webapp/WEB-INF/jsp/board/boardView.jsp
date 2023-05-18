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
<h1 style="font-Size:40px;">민봉 게시판</h1>
<c:forEach var="board" items="${boardAll}">
	<h3><c:out value="${board.ID}"/>번 게시물</h3>
	<div>
	<p>제목: <c:out value="${board.TITLE}"/>
	<p>
	내용: <c:out value="${board.BODY}"/>
	<button type="button" onclick="location.href='boardUpdate?bd_no=${board.ID}'">수정</button>
	<button type="button" onclick="location.href='boardDelete?bd_no=${board.ID}'">삭제</button>
	</p>
	</div>
	<br/>
</c:forEach>
<button type="button" onclick="location.href='boardCreate'">생성</button>
</body>
</html>