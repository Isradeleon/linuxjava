package abstracto;

import herenciaapp.OperacionEmpleado;

/**
 *
 * @author Isra
 */
public abstract class Empleado {
    protected String NSS,nombre,apellidos;
    protected double salario;
    protected double tarifasComision;
    protected int ventas;

    public double getTarifasComision() {
        return tarifasComision;
    }

    public void setTarifasComision(double tarifasComision) {
        this.tarifasComision = tarifasComision;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    

    public abstract double getSalarioIvaProducto();
    
    public abstract double getSalarioTarifaComision();
    
    public double getSalarioIva(){
        return this.salario*0.84;
    }
    
    public Empleado(String nombre, String apellidos, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
        this.NSS=this.nombre.substring(0,1)
                +this.apellidos.split(" ")[0].substring(0,1)
                +this.apellidos.split(" ")[1].substring(0,1)
                +String.valueOf(OperacionEmpleado.RAND.ints(10000,100000).findFirst().getAsInt());
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
