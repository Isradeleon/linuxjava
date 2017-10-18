/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto;

/**
 *
 * @author Isra
 */
public class OperacionEmpleado extends Empleado{
    public OperacionEmpleado(String nombre, String apellidos, double salario) {
        super(nombre, apellidos, salario);
    }

    @Override
    public double getSalarioIvaProducto() {
        return Double.valueOf(this.ventas) * 0.16 * this.tarifasComision + this.getSalarioIva();
    }

    @Override
    public double getSalarioTarifaComision() {
        return this.getSalarioIva()+Double.valueOf(this.ventas)*this.tarifasComision;
    }
    
}
