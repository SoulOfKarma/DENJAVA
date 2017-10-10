<%-- 
    Document   : index
    Created on : 10-10-2017, 7:50:19
    Author     : ricar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login de usuario - acceso a plataforma</title>
    </head>
    <body>
        <form action="ServletUsuario" method="post">
        <label>Usuario : </label><input type="text" name="usuario" placeholder="Usuario"/><br><br>
        
        <label>Pass : </label><input type="password" name="pass" placeholder="Pass"/><br><br>
        
        <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
