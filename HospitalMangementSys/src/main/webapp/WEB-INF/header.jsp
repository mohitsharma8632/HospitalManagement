<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
				<div class="row justify-content-center">
					<div class="dropdown">
					  <button class="btn btn-primary dropdown-toggle" type="button" id="patient" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					    <strong>Patient</strong>
					  </button>
					  <div class="dropdown-menu" aria-labelledby="patient">
					    <a class="dropdown-item" href="patientRegistrationForm">Patient registration</a>
					    <a class="dropdown-item" href="updatePatientForm">Update Patient</a>
					    <a class="dropdown-item" href="deletePatientForm">Delete Patient</a>
					    <a class="dropdown-item" href="viewPatients">View Patients</a>
					    <a class="dropdown-item" href="patientDetailsForm">Search Patient</a>
					    <a class="dropdown-item" href="#">Patient Billing</a>
					  </div>
					</div>
					<div class="dropdown mx-5">
					  <button class="btn btn-primary dropdown-toggle" type="button" id="pharmacy" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					    <strong>Pharmacy</strong>
					  </button>
					  <div class="dropdown-menu" aria-labelledby="pharmacy">
					    <a class="dropdown-item" href="#">Patient Details</a>
					  </div>
					</div>
					<div class="dropdown ">
					  <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					    <strong>Diagnostics</strong>
					  </button>
					  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
					    <a class="dropdown-item" href="#">Patient Details</a>
					  </div>
					</div>
				</div>
		</div>
		
		<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" 
			crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" 
			integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" 
			integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
		
	</body>
</html>