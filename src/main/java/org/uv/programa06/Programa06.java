/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa06;



import java.time.Instant;
import java.util.Date;


/**
 *
 * @author ivan
 */
public class Programa06 {

    public static void main(String[] args) {
        DAOVenta dao= new DAOVenta();
        Venta venta = new Venta();
        
        
        Date fecha = Date.from(Instant.now());
        java.sql.Date fechaSQL=new java.sql.Date(fecha.getTime());
        venta.setFecha(fechaSQL);
        
        DetalleVenta detventa = new DetalleVenta();
        detventa.setCantidad(10);
        detventa.setPrecio(20);
        detventa.setSubtotal(10*20);
        detventa.setVenta(venta);
        venta.getDetalleVenta().add(detventa);
        
        DetalleVenta detVenta2 = new DetalleVenta();
        detVenta2.setCantidad(3);
        detVenta2.setPrecio(10);
        detVenta2.setSubtotal(3*10);
        detVenta2.setVenta(venta);
        venta.getDetalleVenta().add(detVenta2);
        
        venta.setMonto(30+1000);
        dao.create(venta);
        
        
        
        System.out.println("Hello World!");
    }
}
