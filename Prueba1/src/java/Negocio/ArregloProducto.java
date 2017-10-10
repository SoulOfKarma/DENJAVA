/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author ricar
 */
public class ArregloProducto extends ArrayList<Producto>
{
    public String imprimir()
    {
    String aux = " ";
        for (Producto thi : this) 
        {
            aux = aux + ((Producto)thi).ObtenerInformacion();
        }
      return aux;
    }
}
