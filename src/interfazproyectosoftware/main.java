
package interfazproyectosoftware;

import java.util.ArrayList;
import logica.clsControlador;
import logica.clsPersona;
import presentacion.index;

public class main {

   
    public static void main(String[] args) {
        clsControlador control = clsControlador.getInstacia();
        control.crearUsuario("gomes", 123234, 12343,"gomes","gomes");
        control.crearUsuario("rene",1223,1234,"rene","rene","alto");
        control.crearUsuario("daniel",234,234,"daniel","daniel",'m');
        //se crea establecimientos
        control.agregarLugar("Hotel San Martin","calle 5 numero 12","hotel","5","hoteles");
        ArrayList<String> servicios = new ArrayList();
        servicios.add("Musica");
        //clsPersona  persona= control.obtenerPersona("daniel");
        control.agregarEstablecimientoSocio("daniel", "la Cosecha", "centro", "Restaubrante", "medio",1234,0);
        control.agregarServiciosLugar("la Cosecha",servicios);
         control.agregarEstablecimientoSocio("daniel", "campanario", "centro", "centro comercial", "medio",1234,0);
        control.agregarServiciosLugar("campanario",servicios);
        
        
        
        index form = new index();
       form.setVisible(true);
       
    }
    
    
    
}
