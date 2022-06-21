<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%
	String memberEmail = (String)session.getAttribute("MEMBEREMAIL");
	boolean loginCheck = memberEmail == null ? false : true;
%> --%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <fmt:bundle basename="resource.message"> --%>
<%-- <%
	if(loginCheck){
		response.sendRedirect("../main/index.jsp");
	}

%>
 --%>
 <!DOCTYPE html>
 <html>
 <head>
 <body>
 <%

 response.sendRedirect(request.getContextPath()+ "/src/main/webapp/aviato/themes/aviato/index.html");
 
 %>
 </body>
 </head>
 </html>