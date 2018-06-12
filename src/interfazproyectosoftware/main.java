
package interfazproyectosoftware;

import logica.clsControlador;
import presentacion.index;

public class main {

   
    public static void main(String[] args) {
        clsControlador control = clsControlador.getInstacia();
        control.crearUsuario("gomes", 123234, 12343,"gomes","gomes");
        control.crearUsuario("rene",1223,1234,"rene","rene","alto");
        control.crearUsuario("daniel",234,234,"daniel","daniel",'m');
        //se crea establecimientos
        control.agregarLugar("los andes","calle 5 numero 12","hotel","5","hoteles");
        index form = new index();
       form.setVisible(true);
       
    }
    
    
    
}
