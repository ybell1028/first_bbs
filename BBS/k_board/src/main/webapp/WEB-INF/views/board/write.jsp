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
		
		<!-- <input>태그의 type속성은 현재 작성되는 텍스트의 타입을 설정합니다. 
		일반 텍스트(text), 비밀번호처럼 보안이 필요한 경우 내용을 숨길 수 있는 패스워드(password), 
		숫자만 입력할 수 있는 넘버(number)등이 있습니다. -->
		
			<label>제목</label> <input type="text" name="title"/>
		</div>

		<div>
			<label>작성자</label> <input type="text" name="writer"/>
		</div>

	<!-- <textarea>는 여러줄로 이루어진 텍스트를 다루고 -->
		<div>
			<label>내용</label>
			<textarea rows="5" cols="50" name="content"></textarea>
		</div>
	<!-- <button>은 버튼의 기능을 수행합니다. -->
		<div>
		<!-- <button>태그에도 type속성이 있는데,
		이 속성은 <input>태그의 속성과 이름이 같지만 기능은 전혀 다릅니다.
		submit속성은 현재 데이터를 전송한다는 의미입니다.
		즉, submit속성이 없으면 아무런 기능도 없습니다 -->
			<button type="submit">작성</button>
		</div>
	</form>
</body>
</html>