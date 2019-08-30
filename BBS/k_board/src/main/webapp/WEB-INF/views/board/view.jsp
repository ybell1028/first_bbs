<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<title>게시물 목록</title>
</head>
<body>
	<!-- <form>태그는 데이터를 전송하기 위한 HTML엘리먼트 -->

	<!-- get은 기존 데이터를 가져와서 우리들에게 보여주는 역할이고
		post는 우리들이 새로운 데이터를 생성해 보내거나, 기존 데이터를 수정해서 보내는겁니다 -->

	<form method="post">

		<!-- <input>태그는 한줄로 이루어진 텍스트를 다루고 -->

		<div>
			<label>제목</label> <input type="text" name="title"
				value="${view.title}" readonly="readonly"/>
				<!-- value=링크를 생성하는 코드 -->
		</div>

		<div>
			<label>작성자</label> <input type="text" name="writer"
				value="${view.writer}" readonly="readonly"/>
		</div>

		<div>
			<label>작성날짜</label> <input type="text" name="regDate"
				value="<fmt:formatDate value="${view.regDate}" pattern="yyyy-MM-dd"  />" readonly="readonly"/>
		</div>

		<div>
			<label>내용</label>
			<textarea rows="5" cols="50" name="content" readonly="readonly">${view.content}</textarea>
		</div>
		
		<!-- 조회 화면에서 수정 화면으로 넘어갈 수 있는 링크를 추가합니다. -->
		<div>
			<a href="/board/update?bno=${view.bno}">수정</a> <br />
			<a href="/board/delete?bno=${view.bno}">삭제</a>
		</div>
		

	</form>
</body>
</html>