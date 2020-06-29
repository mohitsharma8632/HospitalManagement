<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<c:url value="/login" var="loginUrl"/>  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>ABC Hospital Management System</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
			integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	</head>
	<body>
		<div style="text-align:center;" class="bg-info mb-5 pb-4">
					<p class="text-white bg-dark">ABC Hospital Management System</p>
					
						<h1>ABC Hospital Management System</h1>
		</div>
		<div class="">
			<h4 class="d-flex justify-content-center mb-5">Login</h4>
		</div>
		<div class="container justify-content-center">
			<form action="${loginUrl}" method="post">         
		    <c:if test="${param.error != null}">          
		        <p>  
		            Invalid username and password.  
		        </p>  
		    </c:if>  
		    <c:if test="${param.logout != null}">         
		        <p>  
		            You have been logged out.  
		        </p>  
		    </c:if>  
		    <div class="form-group row justify-content-center">  
		        <label for="username" class="col-form-label col-md-2">User</label>  
		        <input type="text" class="form-control col-md-3" id="username" name="username"/>      
		    </div>  
		    <div class="form-group row justify-content-center">  
		        <label for="password" class="col-form-label col-md-2">Password</label>  
		        <input type="password" class="form-control col-md-3" id="password" name="password"/>      
		    </div>
		    <div class="form-group row justify-content-center">  
			    <input type="hidden"                          
			        name="${_csrf.parameterName}"  
			        value="${_csrf.token}"/>  
			    <button type="submit" class="btn btn-dark">Log in</button>  
		    </div>
		</form>
		</div>
		
	</body>
</html>
