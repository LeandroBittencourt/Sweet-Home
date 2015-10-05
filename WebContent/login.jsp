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
            <form class="col-xs-12 col-sm-6 col-md-8" role="form" action="login" method="post">
                <div class="centerForm">
                    <div class="form-group centerForm">
                        <label for="idade">email:</label>
                        <input type="email" class="form-control" id="email" placeholder="Digite seu email">
                        <span>${usernameError}</span>
                    </div>
                    <div class="form-group centerForm">
                        <label for="pswd">senha:</label>
                        <input type="password" class="form-control" id="pswd" placeholder="digite sua senha">
                        <span>${Erro}</span>
                    </div>
                    <h5><a href="/Sweet_Home/novoUsuario.jsp">Clique aqui para criar um novo cadastro</a></h5>
                    <button type="submit" class="btn btn-primary btn-lg">Login</button>
                </div>
            </form>
         </div>
      </div>
    </body>
</html>