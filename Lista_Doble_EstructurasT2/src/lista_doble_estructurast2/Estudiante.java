/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_doble_estructurast2;

/**
 *
 * @author HP
 */
public class Estudiante {
    
    private String cedula;
    private String nombre;
    private String barrio;
    private double notaFinal;
    
    public Estudiante(String ced, String nomb, String barr, double nota){
        setCedula(ced);
        setNombre(nomb);
        setBarrio(barr);
        setNotaFinal(nota);
    }
    
    public String getCedula(){
    return cedula;
    }
    
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getBarrio(){
    return barrio;
    }
    
    public void setBarrio(String barrio){
        this.barrio = barrio;
    }
    
    public double getNotaFinal(){
    return notaFinal;
    }
    
    public void setNotaFinal(double notaFinal){
        this.notaFinal = notaFinal;
    }
    
    public String informacion (){
        String info = getCedula() + " - " + getNombre() + " - " + getBarrio() + " - " + getNotaFinal() + " ";
        return info;
    }
}
