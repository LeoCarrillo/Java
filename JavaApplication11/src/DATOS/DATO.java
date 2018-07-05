/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

/**
 *
 * @author LEO1
 */
public class DATO {
    public String nombre;
    public int edad;
    public int id;
    public int fecha;
    public int contador;
    public double op;
    public double ady;
    public boolean nuevo;
    public DATO(){
        
    }
    
    public String nombres;
    public String edades;
    public String ids;
    public String fechas;
    
    public String getnombre() {
        return nombre;
    }
    public String getnombres() {
        return nombres;
    }
    public String getedades() {
        return edades;
    }
    public String getids() {
        return ids;
    }
    public String getfechas() {
        return fechas;
    }
    

    public DATO(String nombre, int edad, int id, int fecha) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.fecha = fecha;
    }
    
    public String mostrar(){
        return " ID " + ids + " nombre " + nombres + " edad " + edades + " fecha " + fechas;
    }
    public Double Opuesto(double angulo, double adyacente){
       op = Math.tan(angulo) * adyacente;
       return op;
    }
    
    public Double Adyacente(double angulo, double opuesto){
       ady = opuesto/Math.tan(angulo);
       return ady;
    }
}
