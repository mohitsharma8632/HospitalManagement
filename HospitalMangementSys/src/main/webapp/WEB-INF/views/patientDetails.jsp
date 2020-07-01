<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "header.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body >
	<div class="container">
		<h4 class="text-center">Search Patient</h4>
		<br/><br/>
		
		
		<form class="" action="patientDetailsForm" method="post">
			<div class="form-group row">
				<label for="id" class="col-form-label offset-md-2 col-md-2"><strong>Patient ID<sup>*</sup></strong></label>
					<input type="text" class="form-control offset-md-1 col-md-4" id="id" name="id" value="${p.id}" required/>
				<input type="submit" class="btn btn-block btn-dark col-md-1 offset-md-1" value="get">
			</div>
			</form>
		
		
		
			<div class="form-group row">
				<label for="name" class="col-form-label offset-md-2 col-md-2"><strong>Patient Name</strong></label>
				<input type="text" class="form-control offset-md-1 col-md-4" id="name" name="name" value="${p.name}" disabled/>
			</div>
			<div class="form-group row">
				<label for="age" class="col-form-label offset-md-2 col-md-2"><strong>Patient Age</strong></label>
				<input type="number" class="form-control offset-md-1 col-md-4" id="age" name="age" value="${p.age}" disabled/>
			</div>
			<div class="form-group row">
				<label for="dateOfAdmission" class="col-form-label offset-md-2 col-md-2"><strong>Date of Admission</strong></label>
				<input type="date" class="form-control offset-md-1 col-md-4" id="dateOfAdmission" name="dateOfAdmission" value="${p.dateOfAdmission}" disabled/>
			</div>
			<div class="form-group row">
				<label for="typeOfBed" class="col-form-label offset-md-2 col-md-2"><strong>Type of Bed</strong></label>
				<input type="text" class="form-control offset-md-1 col-md-4" id="typeOfBed" name="typeOfBed" value="${p.typeOfBed}" disabled/>
			</div>
			<div class="form-group row">
				<label for="address" class="col-form-label offset-md-2 col-md-2"><strong>Address</strong></label>
				<input class="form-control offset-md-1 col-md-4" rows="5" id="address" name="address" value="${p.address}" disabled></textarea>
			</div>
			<div class="form-group row">
				<label for="state" class="col-form-label offset-md-2 col-md-2"><strong>State</strong></label>
				<input type="text" class="form-control offset-md-1 col-md-4" id="state" name="state" value="${p.state}" disabled/>
			</div>
			<div class="form-group row">
				<label for="city" class="col-form-label offset-md-2 col-md-2"><strong>City</strong></label>
				<input type="text" class="form-control offset-md-1 col-md-4" id="city" name="city" value="${p.city}" disabled/>
			</div>
			
	
	</div>
</body>
</html>