
package interfazproyectosoftware;

import logica.clsControlador;
import presentacion.index;

public class main {

   
    public static void main(String[] args) {
        clsControlador control = clsControlador.getInstacia();
        control.crearUsuario("rene", 0, 0, "rene", "rene", "1");
        control.crearUsuario("hola", 0, 0, "hola", "hola",'f');
        control.crearUsuario("jalvinr", 0, 0, "rene", "rene", "1");
        control.crearUsuario("jalvin", 0, 0, "jalvinr","jalvin");
        control.crearUsuario("rene", 0, 0, "rene", "rene", "1");
        control.agregarLugar("oronegro", "las perritas","culos buenos","mas o mones", "regulares");
        control.agregarLugar("oronegro", "las perritas","culos buenos","mas o mones", "regulares");
        control.agregarLugar("oronegro", "las perritas","culos buenos","mas o mones", "regulares");
        index form = new index();
       form.setVisible(true);
       
    }
    
    
    
}
