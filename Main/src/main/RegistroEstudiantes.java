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
public class RegistroEstudiantes {
    private Estudiante[] estudiantes;
    private int numEstudiantes;
    
    RegistroEstudiantes(int capacidadMaxima) {
        estudiantes = new Estudiante[capacidadMaxima];
        numEstudiantes = 0;
    }
    
    public boolean agregarEstudiante(Estudiante estudiante) {
        if (numEstudiantes < estudiantes.length) {
            estudiantes[numEstudiantes] = estudiante;
            numEstudiantes++;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean eliminarEstudiante(String nombre) {
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i].getNombre().equals(nombre)) {
                estudiantes[i] = estudiantes[numEstudiantes-1];
                estudiantes[numEstudiantes-1] = null;
                numEstudiantes--;
                return true;
            }
        }
        return false;
    }
    
    public Estudiante buscarEstudiante(String nombre) {
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i].getNombre().equals(nombre)) {
                return estudiantes[i];
            }
        }
        return null;
    }
    public Estudiante[] getEstudiantes() {
        return this.estudiantes;
    }
 
}
