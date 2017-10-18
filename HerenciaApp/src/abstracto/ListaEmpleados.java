/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto;

import herenciaapp.NombresApellidos;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Isra
 */
public abstract class ListaEmpleados {
    public static ArrayList<OperacionEmpleado> EMPLEADOS=new ArrayList();
    public static final Random RAND=new Random();
    public static final DecimalFormat DEC_FORMAT = new DecimalFormat("#.##");
    
    public static void generarEmpleados(int numero_empleados){
        EMPLEADOS.clear();
        for (int i = 0; i < numero_empleados; i++) {
            EMPLEADOS.add(new OperacionEmpleado(
                    NombresApellidos.NOMBRES[RAND.nextInt(NombresApellidos.NOMBRES.length)],
                    NombresApellidos.APELLIDOSA[RAND.nextInt(NombresApellidos.APELLIDOSA.length)]+" "+
                    NombresApellidos.APELLIDOSB[RAND.nextInt(NombresApellidos.APELLIDOSB.length)],
                    Double.valueOf(String.valueOf(RAND.ints(8000,30000).findFirst().getAsInt()))
            ));
            EMPLEADOS.get(i).setVentas(RAND.nextInt(1000));
            EMPLEADOS.get(i).setTarifasComision(RAND.doubles(0, 1.5).findFirst().getAsDouble());
        }
    }
}
