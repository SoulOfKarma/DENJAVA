<%-- 
    Document   : Producto
    Created on : 10-10-2017, 7:55:30
    Author     : ricar
--%>

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
        <link href="Estilo.css" rel="stylesheet" type="text/css"/>
        <title>Productos</title>
    </head>
    <body>
        <h1> Bienvenido : <%=usu.getUser() %></h1> <label>    </label><a href="ServletCerrarSession">CerrarSession</a> <br>
        <a href="Producto.jsp">Agregar</a>
        <a href="Listar.jsp">Listar</a>
        <form action="ServletProducto" method="post" >
        <table border="1" id="tabla" > 
    <tr >
        <td>
            Codigo
        </td>
        <td>
            <input type="number" name="cod" placeholder="Codigo" required="required"/>
        </td>
    </tr>
        
    <br>
    <tr>
         <td>
            Modelo
        </td>
        <td>
            <input type="text" name="modelo" placeholder="Modelo" required="required"/>
        </td>
    </tr>
    <br>
    <tr>
         <td>
           Marca
        </td>
        <td>
            <input type="text" name="marca" placeholder="Marca" required="required"/>
        </td>
    </tr>
            <br>
    <tr>
         <td>
            Temporada
        </td>
        <td>
            <select name="ddlTemporada">
                <option>O</option>
                <option>I</option>
                <option>P</option>
                <option>V</option>
            </select>
        </td>
    </tr>
    <br>
    <tr>
         <td>
            Talla
        </td>
        <td>
            <select name="ddlTalla">
                <option>38</option>
                <option>39</option>
                <option>40</option>
                <option>41</option>
                <option>42</option>
                <option>43</option>
            </select>
        </td>
    </tr>
    <br>
    <tr>
         <td>
            Fecha Ingreso
        </td>
        <td>
           <input type="text" name="fecha" placeholder="DD/MM/AAAA" required="required"/>
        </td>
    </tr>
    <br>
    <tr>
         <td>
             Stock
        </td>
        <td>
            <input type="number" name="stock" placeholder="Numero de stock" required="required"/>
        </td>
    </tr>
    <br>
    <tr>
         <td>
             Con Caña
        </td>
        <td>
            Si <input type="radio" name="RBCana" value="Si" />
            No <input type="radio" name="RBCana" value="No" />
        </td>
    </tr>
    <br>
    <tr>
         <td>
             <input type="submit" value="Agregar" />
        </td>
        <td>
           
        </td>
    </tr>
    </table>
            
            <%=request.getAttribute("mensaje") %>
            
        </form>
    </body>
</html>
