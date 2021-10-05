
package poo.persona.p01;

import Entidad.Persona;
import Implementacion.ImplePersona;
import java.util.Scanner;

public class PooPersonaP01 {

    ImplePersona ip = new ImplePersona();
    
    public void listar(){
        System.out.println(" ");
        for(Persona p : ip.list()){
            System.out.print(p.getId()+" ");
            System.out.print(p.getNombres()+" ");
            System.out.print(p.getAp_paterno()+" ");
            System.out.print(p.getAp_materno()+" ");
            System.out.println(p.getSexo()); 
        }
    }
    
    public void crear() {
        Persona p1 = new Persona();
        p1.setNombres("Lucas");
        p1.setAp_paterno("Chunca");
        p1.setAp_materno("Mamani");
        p1.setSexo("M");
        
        Persona p2 = new Persona();
        p2.setNombres("Jose Luis");
        p2.setAp_paterno("Chunca");
        p2.setAp_materno("Mamani");
        p2.setSexo("M");
        
        Persona p3 = new Persona();
        p3.setNombres("Daniela");
        p3.setAp_paterno("Chipana");
        p3.setAp_materno("Rodriguez");
        p3.setSexo("F");
        
        ip.create(p1);
        ip.create(p2);
        ip.create(p3);
    }
    
    public void eliminar(){
        listar();
        int opt = 0;
        Scanner tc = new Scanner(System.in);
        System.out.print("\nElije el ID de la persona: ");
        opt = tc.nextInt();
        ip.delete(opt);
        System.out.println("¡SE ELIMINÓ CORRECTAMENTE!");
    }
    
    public static void main(String[] args) {
        PooPersonaP01 po = new PooPersonaP01();
        int opt;
        Scanner tc = new Scanner(System.in);
        String mensaje = "\nElige la opcion que quieres ejecutar:\n"+
            "\t1 = crear\n\t2 = listar\n\t3 = eliminar --> ";
        System.out.print(mensaje);
        do {
            opt = tc.nextInt();
            switch(opt){
                case 1: po.crear();
                    System.out.println("¡SE CREO CORRECTAMENTE!");break;
                case 2: po.listar(); break;
                case 3: po.eliminar(); break;    
            }
            if (opt!=0) {
                System.out.print(mensaje);
            }
        } while (opt!=0);
    }
}
    

