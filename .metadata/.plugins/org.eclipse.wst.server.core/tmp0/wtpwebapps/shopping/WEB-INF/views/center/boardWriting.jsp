<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
<c:if test="${sessionScope.loginSession == null }">
	<script type="text/javascript">
		alert("로그인 후 게시물을 작성해주세요.")
		location.href="myPage"
	</script>
</c:if>
</head>
<body>
<h1>게시물 작성</h1>
이름 : ${loginSession }<br>
제목 : <input type="text" placeholder="제목"><br>
내용 : <input type="text" placeholder="내용"><br>
파일 : <input type="text" placeholder="파일 업로드"><br>
</body>
</html>