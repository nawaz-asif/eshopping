<%@page import="java.util.List"%>

<%@page import="com.teamsankya.eshopping.dto.EshoppingBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.column {
	float: left;
	width: 33.33%;
	padding: 5px;
}
.row::after {
	content: "";
	clear: both;
	display: table;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="topnav">
		<a class="active" href="/eshopping/index.jsp">Home</a>
	</div>
	<%-- <h2>${productdetail}</h2> --%>


	<%
		List<EshoppingBean> beans = (List<EshoppingBean>) request.getAttribute("productdetail");
	%>
	<div class="row">
		<%
			for (EshoppingBean bean : beans) {
		%>
		<div class="column">
			<tr>
				<img src="rorito.jpeg" /> Id:<%=bean.getProductid()%><br> Name:<%=bean.getProductname()%><br>
				Company:<%=bean.getProductcompanyname()%><br> Type:<%=bean.getProductcategory()%><br>
				Price:<%=bean.getProductprice()%>
			</tr>
		</div>

		<%
			}
		%>
	</div>
	<footer>
	<div class="pagination">
		<a href="#">&laquo;</a> <a href="./1?type=pen" class="active">1</a>
		<a href="./2?type=pen">2</a> <a href="./3?type=pen">3</a> <a
			href="#">&raquo;</a> <br>
	</div>
	</footer>
</body>
</html>