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

		<input type="hidden" name="bno" value="${view.bno}" />

		<div>
			<label>제목</label> <input type="text" name="title"
				value="${view.title}" readonly="readonly" />
		</div>

		<div>
			<button type="submit">삭제</button>
		</div>

	</form>
</body>
</html>