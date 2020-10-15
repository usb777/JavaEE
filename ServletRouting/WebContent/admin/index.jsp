<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% out.println("Hello world"); %>
<br><br>
<a href="<%=request.getContextPath()%>/admin/list"> list </a> <br>
<a href="<%=request.getContextPath()%>/admin/user?id=5"> user </a>  <br>
<a href="<%=request.getContextPath()%>/admin/user?id=8"> user </a>  <br>
<a href="<%=request.getContextPath()%>/admin/other"> other </a>  <br>
<a href="<%=request.getContextPath()%>/admin/notother">not other </a>  <br>

   <c:if test="${listUser != null}">
			
		<c:forEach var="user" items="${listUser}">
			<c:out value="${user}" /> <br>
		</c:forEach>
					
  </c:if>
  
  <br>
=============================Other=======================  <br>
 <c:if test="${other != null}">
			Other:	<c:out value='${other}' /> <br><br>
				</c:if>
				<c:if test="${other == null}">
					
				</c:if>
 <br>
=============================not Other=======================  <br>
 <br>
 
 
 =============================NotOther=======================  <br>
 <c:if test="${notother != null}">
			Not Other:	<c:out value='${notother}' /> <br><br>
				</c:if>
				<c:if test="${notother == null}">
					
				</c:if>
 <br>
=============================not Other=======================  <br>
 <br>

         <c:if test="${user != null}">
				<c:out value='${user}' /> <br><br>
				</c:if>
				<c:if test="${user == null}">
					
				</c:if>
</body>
</html>