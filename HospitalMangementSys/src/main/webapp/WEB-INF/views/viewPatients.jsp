<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<style>
			th,td{
				text-align: center;
			}
		</style>
	</head>
	<body>
		
		
		<div class="container">
			<h4 class="text-center">View Patients</h4>
			<br/><br/>
			<table align="center" border="1" style="width:100%" class="justify-content-center">
				<colgroup>
			       <col span="1" style="width: 10%;">
			       <col span="1" style="width: 15%;">
			       <col span="1" style="width: 10%;">
			       <col span="1" style="width: 35%;">
			       <col span="1" style="width: 15%;">
			       <col span="1" style="width: 15%;">
			    </colgroup>
				<tr class="bg-dark text-light">
					<th>Patient ID</th>
					<th>Name</th>
					<th>Age</th>
					<th>Address</th>
					<th>DOJ</th>
					<th>Type Of Room</th>
				</tr>
			<c:forEach items="${plist}" var="p">
				<tr>
					<td>${p.id}</td>
					<td>${p.name}</td>
					<td>${p.age}</td>
					<td>${p.address}</td>
					<td>${p.dateOfAdmission}</td>
					<td>${p.typeOfBed}</td>
				</tr>
			</c:forEach>
				<!--  <tr>
					<td>1234</td>
					<td>Joseph</td>
					<td>56</td>
					<td>Rick Street, Ameerpet, Hyderabad</td>
					<td>03-May-2020</td>
					<td>Single</td>
				</tr>-->
			</table>
		</div>
	</body>
</html>