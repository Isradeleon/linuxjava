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
    protected String NSS,nombre,apellidos;
    protected double salario;

    public Empleado(String nombre, String apellidos, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
        this.NSS=this.nombre.substring(0,1)
                +this.apellidos.split(" ")[0].substring(0,1)
                +this.apellidos.split(" ")[1].substring(0,1)
                +String.valueOf(OperacionEmpleado.RAND.ints(10000,100000).findFirst().getAsInt());
    }
    
    public double getSalarioIva(){
        return this.salario*0.84;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
