<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="MenuBar.jsp"%>
<h2 align="Center">Users Data page !</h2>
<a href="reg" style="padding-bottom: 2px;padding-top: 2px;">Go to Registration page</a>
<table class="table table-dark table-striped">
    <thead>
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Gender</th>
        <th>Address</th>
        <th>Status</th>
        <th>Country</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="ud">
      <tr>
        <td><c:out value="${ud.usrid}"/></td>
        <td><c:out value="${ud.usrName}"/></td>
        <td><c:out value="${ud.usrGen}"/></td>
        <td><c:out value="${ud.usrAdd}"/></td>
        <td><c:out value="${ud.usrEnable}"/></td>
        <td><c:out value="${ud.usrCountry}"/></td>
        <td><a  href="delete?uid=${ud.usrid }">Delete</a></td>
        
      </tr>
    </c:forEach>
      
    </tbody>
                        <h4 class="text-danger"> ${message}</h4>
  </table>
    
</body>
</html>