package logica;

import java.util.ArrayList;

public class clsSocio extends clsPersona{
    ArrayList atrColEstablecimientos = new ArrayList();

    public clsSocio(String atrNombre, long atrIdentificacion, int atrTelefono, String atrUsuario, String atrContrasena) {
        super(atrNombre, atrIdentificacion, atrTelefono, atrUsuario, atrContrasena);
    }
    
    private void obtenerEstadisticas(){
        //TODO
    }
    private void modificarDatos(){
        //TODO
    }
}
