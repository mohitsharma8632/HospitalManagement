<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
	
	<div class="container">
		<h4 class="text-center">Delete Patient</h4>
		<br/><br/>
		<form class="" action="deletePatientget" method="post">
			<div class="form-group row">
				<label for="id" class="col-form-label offset-md-2 col-md-2"><strong>Patient ID<sup>*</sup></strong></label>
					<input type="text" class="form-control offset-md-1 col-md-4" id="id" name="id" value="${p.id}" required/>
				<input type="submit" class="btn btn-block btn-dark col-md-1 offset-md-1" value="get">
			</div>
			</form>
			<form class="" action="deletePatientForm" method="post">
			<input type="hidden" class="form-control offset-md-1 col-md-4" id="id" name="id" value="${p.id}" required/>
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
				<input type="text" class="form-control offset-md-1 col-md-4" id="dateOfAdmission" name="dateOfAdmission" value="${p.dateOfAdmission}" disabled/>
			</div>
			<div class="form-group row">
				<label for="dateOfAdmission" class="col-form-label offset-md-2 col-md-2"><strong>Date of Admission</strong></label>
				<input type="text" class="form-control offset-md-1 col-md-4" id="dateOfAdmission" name="typeOfBed" value="${p.typeOfBed}" disabled/>
			</div>
			<div class="form-group row">
				<label for="dateOfAdmission" class="col-form-label offset-md-2 col-md-2"><strong>Date of Admission</strong></label>
				<input type="text" class="form-control offset-md-1 col-md-4" id="dateOfAdmission" name="address" value="${p.address}" disabled/>
			</div>
			<div class="form-group row">
				<label for="dateOfAdmission" class="col-form-label offset-md-2 col-md-2"><strong>Date of Admission</strong></label>
				<input type="text" class="form-control offset-md-1 col-md-4" id="dateOfAdmission" name="state" value="${p.state}" disabled/>
			</div>
			<div class="form-group row">
				<label for="dateOfAdmission" class="col-form-label offset-md-2 col-md-2"><strong>Date of Admission</strong></label>
				<input type="text" class="form-control offset-md-1 col-md-4" id="dateOfAdmission" name="city" value="${p.city}" disabled/>
			</div>
			<div class="form-group row">
				<span class="offset-md-3">*Mandatory</span>
			</div>
			<div class="form-group row">
            	<div class="offset-md-4 col-md-2">
                	<input type="submit" class="btn  btn-block btn-dark " value="Delete">
                          	</div>
			</div>                                    
		</form>
	</div>
</body>
</html>