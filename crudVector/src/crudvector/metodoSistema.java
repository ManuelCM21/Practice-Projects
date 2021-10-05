
package crudvector;

import java.util.*;

public class metodoSistema {
    
    public Vector lista = new Vector();
    
    public ArrayList<datosPersona> list = new ArrayList<>();

    public void registrarPersona(Object x) {
        lista.add(x);
    }
    
    public void eliminarPersona(Object x){
//        if (y.equals(ve.nombres) || y.equals(ve.codigo)) {
//            for(int i = 0; i<lista.size(); i++){
//                filas[i][0]= ve.nombres;
//                filas[i][1]= ve.ap_paterno;
//                filas[i][2]= ve.ap_materno;
//                filas[i][3]= ve.codigo;
//            }
//            lista.remove(filas);
//        }
        Object filas[][]=new Object[lista.size()][4];
        for(int i = 0; i<lista.size(); i++){
            datosPersona dp = (datosPersona)lista.get(i);
            filas[i][0]= dp.nombres;
            filas[i][1]= dp.ap_paterno;
            filas[i][2]= dp.ap_materno;
            filas[i][3]= dp.codigo;
            if (x.equals(dp.nombres) || x.equals(dp.codigo)) {
                System.out.println("Eliminando a: "+dp.nombres);
                lista.remove(i);
            }
        }
    }
    
}
