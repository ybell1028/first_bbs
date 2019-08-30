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

		<input type="hidden" name="bno" value="${view.bno}" />
		<!-- 글번호를 담아둘 input 태그 
		<input> 태그의 type속성을 hidden으로하면, 데이터를 가지고 있되 보이지 않는 상태가 됩니다.-->

		<div>
			<label>제목</label> <input type="text" name="title"
				value="${view.title}" />
		</div>

		<div>
			<label>작성자</label> <input type="text" name="writer"
				value="${view.writer}" readonly="readonly" />
		</div>


		<div>
			<label>작성날짜</label>
			<fmt:formatDate value="${view.regDate}" pattern="yyyy-MM-dd" />

			<%--	<label>작성날짜</label> <input type="text" name="regDate"
				value="<fmt:formatDate value="${view.regDate}" pattern="yyyy-MM-dd"  />" readonly="readonly"/> 
				
				작성날짜는 기존에 사용하던 <input> 태그를 주석 처리했고, 텍스트만 표시되도록 했습니다.
				이렇게 한 이유는, <input>의 데이터를 날짜형으로 바로 변경할 수 없기 때문입니다. 
				실제로 작성날짜를 <input> 태그에 넣은채 전송한다면 400 에러가 발생하는데, regDate의 데이터형이 맞지 않기 때문입니다.

				BoardVO 내부의 regDate는 Date형 데이터이지만, update.jsp에 있는 regDate는 String형이기 때문에 
				변환 작업이 필요합니다. 이 변환 작업은 이후에 진행하겠습니다.--%>
		</div>

		<div>
			<label>내용</label>
			<textarea rows="5" cols="50" name="content">${view.content}</textarea>
		</div>

		<div>
			<button type="submit">수정</button>
		</div>

		<!-- 제목과 내용에 readonly="readonly" 속성을 제거하고, 수정 버튼을 추가했습니다. -->


	</form>
</body>
</html>