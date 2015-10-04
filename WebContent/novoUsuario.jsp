<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
      <%@ include file="/meta.jsp" %>
   </head>
   <body>
      <%@ include file="/navHeader.jsp" %>
      <div class="container-fluid">
         <div class="row">
            <form class="col-xs-12 col-sm-6 col-md-8" role="form" method="post" action="novoUsuario">
                <div class="centerForm">
                    <div class="form-group centerForm ">
                        <label for="name">Nome:</label>
                        <input type="text" class="form-control" id="name" name="nome">
                    </div>
                    <div class="form-group centerForm">
                        <label for="idade">email:</label>
                        <input type="email" class="form-control" id="email" name="email">
                    </div>
                    <div class="form-group centerForm">
                        <label for="pswd">senha:</label>
                        <input type="password" class="form-control" id="pswd" name="senha">
                    </div>
                    <button type="submit" class="btn btn-primary btn-lg">Cadastrar</button>
                </div>
            </form>
         </div>
      </div>
    </body>
</html>