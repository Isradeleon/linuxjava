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
    private double tarifasComision;
    private int ventas;

    public EmpleadoComision(String nombre, String apellidos, double salario,
            int ventas, double tarifasComision) {
        super(nombre, apellidos, salario);
        this.ventas = ventas;
        this.tarifasComision = Double.valueOf(String.valueOf(OperacionEmpleado.DEC_FORMAT.format(tarifasComision)));
    }
    
    public double getSalarioTarifaComision(){
        return this.getSalarioIva()+Double.valueOf(this.ventas)*this.tarifasComision;
    }
    
    public double getSalarioIvaProducto(){
        return Double.valueOf(this.ventas) * 0.16 * this.tarifasComision + this.getSalarioIva();
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public double getTarifasCOmision() {
        return tarifasComision;
    }

    public void setTarifasCOmision(double tarifasCOmision) {
        this.tarifasComision = tarifasCOmision;
    }
    
    
}
