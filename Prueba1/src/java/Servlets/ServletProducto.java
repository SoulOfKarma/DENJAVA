/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Negocio.ArregloProducto;
import Negocio.Error;
import Negocio.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ricar
 */
@WebServlet(name = "ServletProducto", urlPatterns = {"/ServletProducto"})
public class ServletProducto extends HttpServlet {
   ArregloProducto ar = new ArregloProducto();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletProducto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletProducto at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      //  processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        HttpSession respuesta = request.getSession(true);
        HttpSession respuesta2 = request.getSession(true);
         Producto p = new Producto();
         
        String codigo = request.getParameter("cod");
        String modelo = request.getParameter("modelo");
        String marca = request.getParameter("marca");
        String temporada = request.getParameter("ddlTemporada");
        String talla = request.getParameter("ddlTalla");
        String fecha = request.getParameter("fecha");
        String stock = request.getParameter("stock");
        String cana = request.getParameter("RBCana");
        p.setCodigo(codigo);
        p.setModelo(modelo);
        p.setMarca(marca);        
        p.setTemporada(temporada);
        p.setTalla(talla);
        p.setFecha(fecha);
        p.setStock(stock);
        p.setCana(cana);
        ar.add(p);
        
        if(ar.isEmpty())
        {
          
          String error = "Los campos no tienen el formato requerido,favor revisar";
          request.setAttribute("mensaje", error);
          
          request.getRequestDispatcher("Producto.jsp").forward(request, response);
        }
        else
        {
          
          String agregado = "Se Agrego la zapatilla";
          request.setAttribute("mensaje", agregado);
         respuesta.setAttribute("arreglo", ar);
         respuesta2.setAttribute("arreglos", ar.imprimir());
        // getServletConfig().getServletContext().getRequestDispatcher("/Producto.jsp").forward(request, response);
          request.getRequestDispatcher("Producto.jsp").forward(request, response);
        }
       // processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
