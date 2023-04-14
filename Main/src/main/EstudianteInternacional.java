/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author SEBASTIAN
 */
public class EstudianteInternacional extends Estudiante {
    private String paisOrigen;
    
    public EstudianteInternacional(String nombre, String apellido, int edad, double notaPromedio, String paisOrigen) {
        super(nombre, apellido, edad, notaPromedio);
        this.paisOrigen = paisOrigen;
    }
    
    public String getPaisOrigen() {
        return paisOrigen;
    }
    
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
