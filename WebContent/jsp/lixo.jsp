<%@page import="entity.Listar"%>
<%@page import="controler.Controler"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"	crossorigin="anonymous"></script>
<script	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css'>
<link href="http://code.ionicframework.com/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet">
<script src="//code.jquery.com/jquery-2.1.0.min.js" type="text/javascript"></script>

<title>Lista de Metricas</title>
</head>
<body >
<hr>
<body>


	<div class="container">
		<h2>Questionários</h2>
		<div class="panel panel-default">
			<div class="panel-heading">Perguntas</div>
			<div class="panel-body">
				<table class="table table-bordered">
					<thead class="thead-dark">
						<tr>
							<th scope="col"><center>Id</center></th>
							<th scope="col"><center>Nome da Metrica</center></th>
							<th scope="col"><center>Prazo</center></th>
						</tr>
					</thead>

					<tbody>
						<c:forEach var="j" items="${listagem}">
						<tr class="success">
  							<td align="center">${j.nome}</td>
							<td align="center">${j.prazo}</td>
							<td align="center">${j.id}</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>


			</div>
			<div class="panel-footer" align="right">1.0</div>
		</div>
	</div>
 	<form onloadstart="true" action="Controler" method="post" name= "form1">
<!-- 	Nome.: <input type="text" name="nome" /><br /> Sobrenome: <input -->
<!-- 	type="text" name="sobrenome" /> <br />  -->
<!-- 	<input type="submit" value="Enviar" /> -->
 	</form>

<%-- 	<c:forEach var="j" items="${listagem}"> --%>

<%-- 		${j.nome} --%>
<%-- 		${j.prazo} --%>
<%-- 		${j.id} --%>
<!-- 			<br> -->
<%-- 	</c:forEach> --%>


</body>
</html>