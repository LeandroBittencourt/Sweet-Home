<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
      <%@ include file="/meta.jsp" %>
   </head>
   <body>
      <%@ include file="/navHeader.jsp" %>
      <div class="container-fluid">
		<div class="row">
		   <c:forEach	items="${dogs}" var="dog" >
		      <div class="col-md-4">
		         <div class="thumbnail">
		            <img src="img/beagle.jpg" alt="">
		            <div class="caption">
		               <h3>Dog Name: ${dog.nome}</h3>
		               <p>Raça: ${dog.raca}</p>
		               <p>Idade: ${dog.idade}</p>
		               <p><a href="mailto:{$user.email}" class="btn btn-primary" role="button">Entrar em contato</a> 
		            </div>
		         </div>
	         </div>
		   </c:forEach>
		   </div>
		</div>

       <!--SCRIPTS-->
      <script src="js/jquery-2.1.4.min.js"></script>
      <script src="js/bootstrap.min.js"></script>
      <script type="text/javascript">
      	$(document).ready(function(){

	      	$("#btnNovoAnimal").click(function(){
	      		window.location.href='/Sweet_Home/dogCadastro.jsp';
	      	});
	      	
	      	$("#btnLogin").click(function(){
	      		window.location.href='/Sweet_Home/login.jsp';
	      	});

		});

      </script>
   </body>
</html>