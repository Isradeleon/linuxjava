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
public class EmpleadoComision extends Empleado {
    private double ventas, tarifasComision;

    public EmpleadoComision(String NSS, String nombre, String apellidos, double salario,
            double ventas, double tarifasComision) {
        super(NSS, nombre, apellidos, salario);
        this.ventas = ventas;
        this.tarifasComision = tarifasComision;
    }
    
    public double getSalarioTarifaComision(){
        return this.getSalarioIva()+this.ventas*this.tarifasComision;
    }
    
    public double getSalarioIvaProducto(){
        return this.ventas * 0.16 * this.tarifasComision + this.getSalarioIva();
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getTarifasCOmision() {
        return tarifasComision;
    }

    public void setTarifasCOmision(double tarifasCOmision) {
        this.tarifasComision = tarifasCOmision;
    }
    
    
}
