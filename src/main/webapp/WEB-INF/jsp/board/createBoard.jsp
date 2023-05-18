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
<form action="/testProject/boardCreate" method="post" accept-charset="utf-8">
	<h3>게시물 생성 페이지</h3>
	<div>
	<p>제목 </p>
	<input type=text name="bd_title" style="width:300px" placeholder="제목을 입력해주세요." />
	<p>내용 </p>
	<input type=text name="bd_body" placeholder="내용을 입력해주세요." style="width:300px; height:100px"/>
	<p><button type="submit">확인</button></p>
	</div>
</form>
</body>
</html>