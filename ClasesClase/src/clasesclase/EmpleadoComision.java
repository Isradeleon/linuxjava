/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesclase;

/**
 *
 * @author solidus
 */
public class EmpleadoComision extends Empleado {
    private double ventas, tarifasCOmision;

    public EmpleadoComision(double ventas, double tarifasCOmision,
            String NSS, String nombre, String apellidos, double salario) {
        super(NSS, nombre, apellidos, salario);
        this.ventas = ventas;
        this.tarifasCOmision = tarifasCOmision;
    }
    
    public double getSalarioTarifaComision(){
        return this.getSalarioIva()+this.ventas*this.tarifasCOmision;
    }
    
    public double getSalarioIvaProducto(){
        return this.ventas * 0.16 * this.tarifasCOmision + this.getSalarioIva();
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getTarifasCOmision() {
        return tarifasCOmision;
    }

    public void setTarifasCOmision(double tarifasCOmision) {
        this.tarifasCOmision = tarifasCOmision;
    }
    
    
}
