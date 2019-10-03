<!doctype html>
<html lang="pt-br">
  <head>
    <%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="icon" href="imagens/favicon.ico">

    <title>Template de login, usando Bootstrap.</title>

    <!-- Principal CSS do Bootstrap -->
   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"	crossorigin="anonymous">


    <!-- Estilos customizados para esse template -->
    <link href="resources/bootstrap/css/signin.css" rel="stylesheet">
  </head>

  <body class="text-center">
    <form class="form-signin" action="Controler?cmd=lista" method="post">
    
      <img class="mb-4" src="imagens/bootstrap-solid.svg" alt="" width="72" height="72">
      <h1 class="h3 mb-3 font-weight-normal">Faça login</h1>
      <label for="inputEmail" class="sr-only">Endereço de email</label>
      <input type="email" id="inputEmail" class="form-control" placeholder="Seu email" >
      <label for="inputPassword" class="sr-only">Senha</label>
      <input type="password" id="inputPassword" class="form-control" placeholder="Senha" >
      <div class="checkbox mb-3">
        <label>
          <input type="checkbox" value="remember-me"> Lembrar de mim
        </label>
      </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit" value="Enviar">Login</button> 
      <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
    </form>
    
<!--      <form class="form-signin" action="email" method="post"> -->
<!--           <button class="btn btn-lg btn-primary btn-block" type="submit" value="Enviar">Login</button>  -->
<!--      </form> -->
    
    
  </body>
</html>