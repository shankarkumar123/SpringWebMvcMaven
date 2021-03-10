<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"
	integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js"
	integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js"
	integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"
	integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn"
	crossorigin="anonymous"></script>
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<div class="container-fluid">
		<div class="jumbotron text-center">
			<h2>Welcome to Shankar.com</h2>
		</div>
		<div class="card">
			<h2 align="Center">Welcome to Registration page !</h2>
			<form action="insert" method="post">
			
				

<div class="row">
    <div class="col-sm-2" style="background-color: lavender;">User Name</div>
    <div class="col-sm-10" style="background-color: lavenderblush;">
<input type="text" name="usrName">
						</div>
  </div>
     
     <div class="row">
    <div class="col-sm-2" style="background-color: lavender;">Password</div>
    <div class="col-sm-10" style="background-color: lavenderblush;">
<input type="text" name="usrPwd">
						</div>
  </div>
  <div class="row">
    <div class="col-sm-2" style="background-color: lavender;">Gen</div>
    <div class="col-sm-10" style="background-color: lavenderblush;">
<input type="radio" name="usrGen" value="M">Male
<input type="radio" name="usrGen" value="F">Female</div>
  </div>
     <div class="row">
    <div class="col-sm-2" style="background-color: lavender;">Addaress</div>
    <div class="col-sm-10" style="background-color: lavenderblush;">
<textarea name="usrAdd"></textarea>
						</div>
  </div>
     
     <div class="row">
    <div class="col-sm-2" style="background-color: lavender;">Enable</div>
    <div class="col-sm-10" style="background-color: lavenderblush;">
							<select name="usrEnable">
           <option value="">---select---</option>
           <option value="YES">Yes</option>
           <option value="NO">No</option>
     </select> </div>
  </div>   
     <div class="row">
    <div class="col-sm-2" style="background-color: lavender;">Country</div>
    <div class="col-sm-10" style="background-color: lavenderblush;">
<input type="text" name="usrCountry">
						</div>
  </div>
     
     <pre>
                                        
                                        
                                         <input type="submit" value="Register" class="btn btn-primary">  <a href="all">View All</a>
                     
                     <h4 class="text-success"> ${message}</h4>
	     </pre>
     </form>
			
		</div>

	</div>
	
	<footer class="footer">
	<div class="footerContainer">
		<p class="copyright">© Shankar.com 2021 All Right Reserved</p>
	</div>
	</footer>
</body>
</html>