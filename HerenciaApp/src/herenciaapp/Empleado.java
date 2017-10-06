/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaapp;

/**
 *
 * @author solidus
 */
public class Empleado {
    String NSS,nombre,apellidos;
    double salario;

    public Empleado(String NSS, String nombre, String apellidos, double salario) {
        this.NSS = NSS;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
    }
    
    public double getSalarioIva(){
        return this.salario*0.84;
    }
}
