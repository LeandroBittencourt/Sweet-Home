<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
      <title>Adoção Sweet home</title>
      <meta charset="ISO-8859-1">
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
                  <li class="active"><a href="#">Home <span class="sr-only">(current)</span></a></li>
               </ul>
               <p class="navbar-text navbar-middle">Faça um animalzinho feliz!</p>
               <form class="navbar-form navbar-right" role="search">
      			  <button type="submit" class="btn btn-default"><a href="dogCadastro.jsp">Cadastrar novo animal!</a></button>
                  <div class="form-group">
                     <input type="email" class="form-control" placeholder="email" id="username">
                     <input type="password" class="form-control" placeholder="senha" id="pswd">
                  </div>
                  <button type="submit" class="btn btn-default">login</button>
               </form>
            </div><!-- /.navbar-collapse -->
         </div><!-- /.container-fluid -->
      </nav>
      <div class="container">
      	<div class="jumbotron">
  			<h1>ERRO</h1>
  			<p>Ops aconteceu algo errado, nossos gnomos irão verificar essa intervenção paranormal no nosso site.</p>
		</div>
      </div>
</body>
</html>