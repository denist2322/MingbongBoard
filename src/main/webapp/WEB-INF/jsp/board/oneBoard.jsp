<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    // 인코딩
    request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>민봉님 게시판</title>
</head>
<body>
<h1>민봉 게시판</h1>
<form action="/testProject/boardUpdate" method="post" accept-charset="utf-8">
<c:forEach var="board" items="${boardOne}">
	<input type="hidden" name="bd_no" value="${board.ID}"/>
	<h3><c:out value="${board.ID}"/>번 게시물 수정 페이지</h3>
	<div>
	<p>제목 </p>
	<input type=text name="bd_title" value="<c:out value='${board.TITLE}'/>" style="width:300px" />
	<p>내용 </p>
	<input type=text name="bd_body" value="<c:out value='${board.BODY}'/>" style="width:300px; height:100px"/>
	<p><button type="submit">확인</button></p>
	</div>
</c:forEach>
</form>
</body>
</html>