<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
<c:import url="../default/header.jsp"/>
<h1>게시판</h1>
<table>
	<tr>
		<td>번호</td><td>제목</td><td>작성자</td><td></td><td>작성일</td><td>조회수</td>
	</tr>
</table>
<input type="button" value="게시글 작성" onclick="location.href='boardWriting'">
</body>
</html>