<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
<c:if test="${sessionScope.loginSession == null }">
	<script type="text/javascript">
		alert("로그인에 실패했습니다...")
		location.href="myPage"
	</script>
</c:if>
</head>
<body>
<c:import url="../default/header.jsp"/>
<h1>마이페이지</h1>
<h2>${loginSession }님의 마이페이지</h2>
<input type="button" value="수정">
<br><br>
아이디 : ${list.id }<br>
주소 : ${list.addr }<br>
이메일 : ${list.mail }<br>
전화번호 : ${list.tel }<br>
<hr>
총 주문 금액 : ${list.total }<br>
마일리지 : ${list.mileage }<br>
쿠폰 : ${list.mileage }<br><hr>
${list.id }님의 회원 등급은 땡땡땡 입니다.
<hr><br>
<h2>게시물</h2>
<input type="button" value="게시물 작성" onclick=""><br><br>
주문일자 상품명 결제금액 주문상세<hr>
여기에 넘겨 받은 값을 넣어준다.<hr>
게시물 작성 날짜 게시물 제목 <hr>
여기에 넘겨 받은 값을 넣어준다.<hr>

</body>
</html>