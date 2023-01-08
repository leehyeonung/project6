<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.net.URLEncoder" %>
<%@ page import="java.security.SecureRandom" %>
<%@ page import="java.math.BigInteger" %>

<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" 
crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	text-align: center;
	margin:0 auto;
	width: 100%;
	padding-top : 150px;
}
.logo>a>img{
	width: 150px;
	height: 150px;
}
.login-container{
	border: 1px solid gray;
	width: 500px;
	height: 100%;
	
	margin: 30px auto;
	
	/* display: flex;
	align-items: center;
	justify-content: center; */
}
div{
	/* display: flex;
	align-items: center;
	justify-content: center; */
}
.api>a>img{
	margin : 10px;
	width: 40px;
	height: 40px;
}
hr{
	margin: 0 auto;
	
}
.memOrNon>a>button{
	text-decoration: none;
	background-color: white;
	
	font-size: 25px;
	width: 100px;
	color : gray;
}
</style>
</head>
<body>
	<div class="memOrNon">
		<a href="/mem/login-member"><button>회원</button></a>
		<a href="/mem/login-Non-member"><button>비회원</button></a>
	</div>
	<div class="login-container">
	
		<div class="logo">
			<a href="/"><img src="../resources/logo.jpg" alt="로고"></a><br>
		</div>
		<div class="login">
			<form action="/mem/login" method="post">
				<input type="text" placeholder="ID" name="mem_id"><Br>
				<input type="password" placeholder="Password" name="mem_pw"><br><br>
				<a><button type="submit" class="btn btn-outline-secondary">확인</button></a><br><br>
			</form>
			<div>
				<a>비밀번호찾기</a>
				<a>아이디찾기</a> 
				<a href="/mem/joinPage">회원가입</a>
			</div>
		
		</div>

	<div>
		<span>
			<hr width="300px">
			<div class="login_line">
				<span>SNS로 3초만에 로그인</span>
			</div>
		</span>
		<div class="api">
		  <%
		    String clientId = "4NMOgJ2RQBlsecZK4ye2";//애플리케이션 클라이언트 아이디값";
		    String redirectURI = URLEncoder.encode("http://localhost:8089/", "UTF-8");
		    SecureRandom random = new SecureRandom();
		    String state = new BigInteger(130, random).toString();
		    String apiURL = "https://nid.naver.com/oauth2.0/authorize?response_type=code"
		         + "&client_id=" + clientId
		         + "&redirect_uri=" + redirectURI
		         + "&state=" + state;
		    session.setAttribute("state", state);
 			%>

			<a href="<%=apiURL%>"><img height="50" src="../resources/btnG_icon_circle.png"></a>
			<!-- <button>카카오</button>
			<button>구글</button> -->
		</div>
	</div>
</div>
</body>
</html>