package logica;

import java.util.ArrayList;

public class clsRestaurante extends clsEstablecimiento{
    
    ArrayList atrColMenu = new ArrayList();
    
    public clsRestaurante(String atrNombre, String atrDireccion, String atrDescripcion, int atrCalificacion, int atrTelefono, clsSocio atrSocio, ArrayList parColMenu) {
        super(atrNombre, atrDireccion, atrDescripcion, atrCalificacion, atrTelefono, atrSocio);
        this.atrColMenu = parColMenu;
    }
        
}
