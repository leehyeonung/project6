<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/resources/css/main.css">
</head>
<body>
<jsp:include page="../layout/header.jsp"></jsp:include>
<div class="main">
<form action="/board/register" method="post">
제목:<input type="text" name="brd_title" required><br>
작성자:<input type="text" name="brd_writer" value="${ses.mem_id}" readonly><br>
내용:<textarea rows="3" cols="30" name="brd_content"></textarea><br>
카테고리:	<select name="brd_category">
    			<option>질문</option>
    			<option>자유</option>
    			<option>테스트</option>
  			</select>
  			

<div name="brd_mem_num" value="${ses.mem_num}" hidden></div>
<button type="submit" class="btn btn-secondary">작성하기</button>
</div>
<jsp:include page="../layout/footer.jsp"></jsp:include>
</body>
</html>