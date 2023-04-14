/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import main.RegistroEstudiantes;
import main.EstudianteInternacional;
import main.Estudiante;
/**
 *
 * @author SEBASTIAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RegistroEstudiantes registro = new RegistroEstudiantes(3);
        
        // Crear algunos estudiantes
        Estudiante est1 = new Estudiante("Juan", "Pérez", 20, 8.5);
        Estudiante est2 = new Estudiante("María", "García", 21, 9.2);
        Estudiante est3 = new EstudianteInternacional("Sara", "Lee", 19, 7.8, "Corea del Sur");
        
        // Agregar estudiantes al registro
        registro.agregarEstudiante(est1);
        registro.agregarEstudiante(est2);
        registro.agregarEstudiante(est3);
        
        // Buscar estudiantes por nombre
       Estudiante encontrado = registro.buscarEstudiante("Juan");
       System.out.println("Estudiante encontrado: \n" + encontrado.getNombre() + "\n");
       Estudiante[] estudiantes = registro.getEstudiantes();
       for(int i = 0; i < estudiantes.length; i++) {
            Estudiante estudiante = estudiantes[i];
            if(estudiante != null) { // Verificar si el estudiante actual es nulo
                System.out.println("Estudiante " + (i+1) + ":");
                System.out.println("Nombre: " + estudiante.getNombre());
                System.out.println("Apellido: " + estudiante.getApellido());
                System.out.println("Edad: " + estudiante.getEdad());
                System.out.println("Nota promedio: " + estudiante.getNotaPromedio());
                System.out.println("-----------------------");
            }
        }

       
        // Eliminar un estudiante
        registro.eliminarEstudiante("Sara");
        System.out.println("\n\nEstudiante eliminado\n");
        for(int i = 0; i < estudiantes.length; i++) {
            Estudiante estudiante = estudiantes[i];
            if(estudiante != null) { // Verificar si el estudiante actual es nulo
                System.out.println("Estudiante " + (i+1) + ":");
                System.out.println("Nombre: " + estudiante.getNombre());
                System.out.println("Apellido: " + estudiante.getApellido());
                System.out.println("Edad: " + estudiante.getEdad());
                System.out.println("Nota promedio: " + estudiante.getNotaPromedio());
                System.out.println("-----------------------");
            }
        }
    }
    
}
