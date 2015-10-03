<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
      <title>Adoção Sweet home</title>
      <meta charset="utf-8">
      <meta name="description" content="Um site para adoção de cães da clínica Sweet Home">
      <meta name="keywords" content="adoção,cães,veterinario, cachorros">
      <meta name="author" content="InovaTI">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
       <link rel="stylesheet" type="text/css" href="css/home.css">
   </head>
   <body>
      <nav class="navbar navbar-default">
         <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header"> 
               <a class="navbar-brand" href="#">
                <img alt="Brand" src="img/sweetHome.jpg">
               </a>
               <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
               <span class="sr-only">Toggle navigation</span>
               <span class="icon-bar"></span>
               <span class="icon-bar"></span>
               <span class="icon-bar"></span>
               </button>
               <a class="navbar-brand" href="#">Adoção Sweet Home</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
               <ul class="nav navbar-nav">
                  <li class="active"><a href="/Sweet_Home/home">Home <span class="sr-only">(current)</span></a></li>
               </ul>
               <p class="navbar-text navbar-middle">Faça um animalzinho feliz!</p>
               <form class="navbar-form navbar-right" role="search">
                  <div class="form-group">
                     <input type="email" class="form-control" placeholder="email" id="username">
                     <input type="password" class="form-control" placeholder="senha" id="pswd">
                  </div>
                  <button type="submit" class="btn btn-default">login</button>
               </form>
            </div><!-- /.navbar-collapse -->
         </div><!-- /.container-fluid -->
      </nav>
      <div class="container-fluid">
         <div class="row">
            <form class="col-xs-12 col-sm-6 col-md-8" role="form" method="post" action="dogCadastro">
                <div class="centerForm">
                    <div class="form-group centerForm ">
                        <label for="name">Nome:</label>
                        <input type="text" class="form-control" id="name" name="name">
                    </div>
                    <div class="form-group centerForm">
                        <label for="idade">Idade:</label>
                        <input type="text" class="form-control" id="idade" name="idade">
                    </div>
                    <div class="form-group centerForm">
                        <label for="raca">Raça:</label>
                        <input type="text" class="form-control" id="raca" name="raca">
                    </div>
                    <div class="form-group centerForm">
                        <label for="prevAdocao">Previsão  de adoção:</label>
                        <input type="text" class="form-control" id="prevAdocao" name="prevAdocao">
                    </div>
                    <button type="submit" class="btn btn-primary btn-lg">Cadastrar</button>
                </div>
            </form>
         </div>
      </div>
    </body>
</html>