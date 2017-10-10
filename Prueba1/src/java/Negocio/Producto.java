/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author ricar
 */
public class Producto {

    private String codigo;
    private String modelo;
    private String marca;
    private String temporada;
    private String talla;
    private String fecha;
    private String stock;
    private String cana;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getCana() {
        return cana;
    }

    public void setCana(String cana) {
        this.cana = cana;
    }

    public Producto(String codigo, String modelo, String marca, String temporada, String talla, String fecha, String stock, String cana) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.temporada = temporada;
        this.talla = talla;
        this.fecha = fecha;
        this.stock = stock;
        this.cana = cana;
    }

    public Producto() {
    }
    
    public String ObtenerInformacion()
    {
      StringBuilder sb = new StringBuilder();
      sb.append(String.format("Codigo :", this.codigo));
      sb.append(String.format("Modelo :", this.modelo));
      sb.append(String.format("Marca :", this.marca));
      sb.append(String.format("Temporada :", this.temporada));
      sb.append(String.format("Talla :", this.talla));
      sb.append(String.format("Fecha :", this.fecha));
      sb.append(String.format("Stock :", this.stock));
      sb.append(String.format("Caña :", this.cana));
      return sb.toString();
    }
}
