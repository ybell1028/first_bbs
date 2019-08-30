<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<title>게시물 목록</title>
</head>
<body>
	<table border="1">
        <thead>
            <tr>
                <th>번호</th>
                <th>제목</th>
                <th>작성자</th>
                <th>작성일</th>
                <th>조회수</th>
            </tr>
        </thead>
        <tbody>
        
        <c:forEach items="${list}" var="list">
        <!-- forEach는 리스트형 데이터를 받아서 그 리스트의 갯수만큼 반복합니다.
        forEach 내부에있는 items 속성에는 컨트롤러에서 작성했던 list,
              즉 model.addAttribute("list", list);가 들어갑니다.
              그리고 var속성은 items에 있는 데이터가 들어갈 변수가 됩니다.
		items로 받는 데이터의 명이 긴 경우 var로 이름을 줄여서 사용할 수 있습니다.-->
		
        	<tr>
        		<td>${list.bno}</td>
        		<td>
        			<a href="/board/view?bno=${list.bno}">${list.title}</a>
        			<!-- 게시물 제목을 출력하는 링크 태그를 추가
        			?(물음표)는 일반주소와 매개변수를 구분짓는 문자 -->
        		<td>${list.title}</td>
        		<td>${list.writer}</td>
        		<td>
        			<fmt:formatDate value="${list.regDate}" pattern="yyyy-MM-dd" />
        		</td>
        		<td>${list.viewCnt}</td>
        	</tr>
        </c:forEach>
        </tbody>
    </table>
    
    <c:forEach begin="1" end="${pageNum}" var="num">
    	<!--
    	<span>${num}</span>
    	pageNum의 갯수만큼을 출력하는 단순한 코드입니다. -->
    	<span>
    		<a href="/board/listPage?num=${num}">${num}</a>
    	</span>
    </c:forEach>
	
	
</body>
</html>