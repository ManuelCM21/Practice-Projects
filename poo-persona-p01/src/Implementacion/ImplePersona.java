
package Implementacion;

import Entidad.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ImplePersona {
    
    List<Persona> lis = new CopyOnWriteArrayList<>();
//    List<Persona> lis = new ArrayList<>();
    int id = 0;
    
    public void create(Persona p){
        id = id +1;
        p.setId(id);
        lis.add(p);
    }
            
    public List<Persona> list(){
        return lis;
    }
    
    public void delete(int id){
        for(Persona ps: lis){
            if (id == ps.getId()) {
                System.out.println("Eliminando a: "+ps.getNombres());
                lis.remove(ps);
            }
        }
//        Iterator<Persona> itr = lis.iterator();
//        while (itr.hasNext()) {            
//            Persona pers =itr.next();
//            if (pers.getId()==(id)) {
//                System.out.println("Eliminando a: "+pers.getNombres());
//                itr.remove();
//            }
//        }
    }
}
