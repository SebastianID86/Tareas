/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author SEBASTIAN
 */
public class Envio {
    private String direccion;

    public Envio(String direccion) {
        this.direccion = direccion;
    }

    public double calcularCostoEnvio(double distancia) {
        double costo = distancia * 0.5; // Costo por kilómetro
        if (distancia > 100) {
            costo -= 50; // Descuento por distancia larga
        }
        return costo;
    }
}