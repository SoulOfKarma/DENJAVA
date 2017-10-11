<%-- 
    Document   : Listar
    Created on : 10-10-2017, 14:45:43
    Author     : ricar
--%>

<%@page import="Negocio.Producto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Negocio.ArregloProducto"%>
<%@page import="Negocio.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
   Usuario usu = new Usuario("", "");
   
   if(session.getAttribute("usuario") != null)
            {
                usu = (Usuario)session.getAttribute("usuario"); //se asigna la sesión actual
            }
            else{
                response.sendRedirect("index.jsp");
            }

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado</title>
    </head>
    <body>
        <h1>Bienvenido : <%=usu.getUser() %> </h1><label>    </label><a href="ServletCerrarSession">CerrarSession</a> <br>
        <a href="Producto.jsp">Agregar</a>
        <a href="Listar.jsp">Listar</a>
        <%
          ArrayList<Producto> list = (ArrayList<Producto>) session.getAttribute("arreglo");
          int a = list.size();
         for (Producto pro : list) {
   
        %>
        <br> Codigo :<%=pro.getCodigo() %><br>
        Modelo :<%=pro.getModelo()%><br>
        Marca :<%=pro.getMarca() %><br>
        Temporada :<%=pro.getTemporada() %><br>
        Talla :<%=pro.getTalla() %><br>
        Fecha :<%=pro.getFecha()%><br>
        Stock :<%=pro.getStock() %><br>
        Caña :<%=pro.getCana() %><br>
         <%}%>
        
    </body>
</html>
