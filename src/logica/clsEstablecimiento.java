package logica;

import java.util.ArrayList;

public class clsEstablecimiento extends clsLugar{
    private int atrTelefono;
    private clsSocio atrSocio;
    ArrayList atrColReservas = new ArrayList();

    public clsEstablecimiento(String atrNombre, String atrDireccion, String atrDescripcion, int atrCalificacion, int atrTelefono, clsSocio atrSocio) {
        super(atrNombre, atrDireccion, atrDescripcion, atrCalificacion);
        this.atrTelefono = atrTelefono;
        this.atrSocio = atrSocio;
    }

    public int getAtrTelefono() {
        return atrTelefono;
    }

    public clsSocio getAtrSocio() {
        return atrSocio;
    }

    public void setAtrTelefono(int atrTelefono) {
        this.atrTelefono = atrTelefono;
    }

    public void setAtrSocio(clsSocio atrSocio) {
        this.atrSocio = atrSocio;
    }
    
    
    
    
}
