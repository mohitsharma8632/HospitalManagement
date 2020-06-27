<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "header.jsp"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
			<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
					integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
		<style>
			table{
				border-spacing : 5px;
			}
		</style>
	</head>
	<body>
	<div class="container">
		<h4 class="text-center">Patient Registration</h4>
		<br/><br/>
		<form class="" action="#" method="post">
			<div class="form-group row">
				<label for="ssnId" class="col-form-label offset-md-2 col-md-2"><strong>Patient SSN ID<sup>*</sup></strong></label>
				<input type="text" class="form-control offset-md-1 col-md-4" id="ssnId" name="ssnId" required/>
			</div>
			<div class="form-group row">
				<label for="name" class="col-form-label offset-md-2 col-md-2"><strong>Patient Name<sup>*</sup></strong></label>
				<input type="text" class="form-control offset-md-1 col-md-4" id="name" name="name" required/>
			</div>
			<div class="form-group row">
				<label for="age" class="col-form-label offset-md-2 col-md-2"><strong>Patient Age<sup>*</sup></strong></label>
				<input type="number" class="form-control offset-md-1 col-md-4" id="age" name="age" required/>
			</div>
			<div class="form-group row">
				<label for="dateOfAdmission" class="col-form-label offset-md-2 col-md-2"><strong>Date of Admission<sup>*</sup></strong></label>
				<input type="date" class="form-control offset-md-1 col-md-4" id="dateOfAdmission" name="dateOfAdmission" required/>
			</div>
			<div class="form-group row">
				<label for="typeOfBed" class="col-form-label offset-md-2 col-md-2"><strong>Type of Bed<sup>*</sup></strong></label>
				<select class="form-control offset-md-1 col-md-4" id="typeOfBed" name="typeOfBed" required>
					<option value="">Select</option>
					<option value="General Ward">General Ward</option>
					<option value="Semi Sharing">Semi sharing</option>
					<option value="Single Room">Single Room</option>
				</select>
			</div>
			<div class="form-group row">
				<label for="address" class="col-form-label offset-md-2 col-md-2"><strong>Address<sup>*</sup></strong></label>
				<textarea class="form-control offset-md-1 col-md-4" rows="5" id="address" name="address" required></textarea>
			</div>
			<div class="form-group row">
				<label for="state" class="col-form-label offset-md-2 col-md-2"><strong>State<sup>*</sup></strong></label>
				<select class="form-control offset-md-1 col-md-4" name="state" id="state" required>
					<option value="">Select</option>
                 	<option value="Madhya Pradesh">Madhya Pradesh</option>
               		<option value="Uttar Pradesh">Uttar Pradesh</option>
                 	<option value="Maharashtra">Maharashtra</option>
                	<option value="Gujrat">Gujrat</option>
                 	<option value="Karnataka">Karnataka</option>
				</select>
			</div>
			<div class="form-group row">
				<label for="city" class="col-form-label offset-md-2 col-md-2"><strong>City<sup>*</sup></strong></label>
				<select class="form-control offset-md-1 col-md-4" name="city" id="city" required>
                	<option value="">Select</option>
                	<option value="Indore">Indore</option>
                	<option value="Pune">Pune</option>
                	<option value="Mumbai">Mumbai</option>
                	<option value="Gwalior">Gwalior</option>
                	<option value="Bangalore">Bangalore</option>
              		<option value="Ahemdabad">Ahemdabad</option>
              		<option value="Patna">Patna</option>				
				</select>
			</div>
			<div class="form-group row">
				<span class="offset-md-3">*Mandatory</span>
			</div>
			<div class="form-group row">
            	<div class="offset-md-3 col-md-2">
                	<button type="submit" class="btn  btn-block btn-dark ">
               			<strong>Submit</strong>
                	</button>
            	</div>
            	<div class="col-md-2">
                	<button type="reset" class="btn  btn-block btn-dark ">
               			<strong>Reset</strong>
                	</button>
            	</div>
			</div>                                    
		</form>
	</div>
	</body>
</html>