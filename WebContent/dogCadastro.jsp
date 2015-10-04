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
                        <label for="raca">Ra�a:</label>
                        <input type="text" class="form-control" id="raca" name="raca">
                    </div>
                    <div class="form-group centerForm">
                        <label for="prevAdocao">Previs�o  de ado��o:</label>
                        <input type="text" class="form-control" id="prevAdocao" name="prevAdocao">
                    </div>
                    <button type="submit" class="btn btn-primary btn-lg">Cadastrar</button>
                </div>
            </form>
         </div>
      </div>
    </body>
</html>