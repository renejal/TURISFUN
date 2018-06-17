package logica;

import java.util.ArrayList;

public class clsLugar {
    private String atrNombre;
    private String atrDireccion;
    private String atrDescripcion;
    private int atrCalificacion;
    protected ArrayList<String> atrColServicios;
    

    public clsLugar(String atrNombre, String atrDireccion, String atrDescripcion, int atrCalificacion) {
        this.atrNombre = atrNombre;
        this.atrDireccion = atrDireccion;
        this.atrDescripcion = atrDescripcion;
        this.atrCalificacion = atrCalificacion;
        this.atrColServicios = new ArrayList();
    }

    public ArrayList<String> getAtrColServicios() {
        return atrColServicios;
    }
    
    public String getAtrNombre() {
        return atrNombre;
    }

    public String getAtrDireccion() {
        return atrDireccion;
    }

    public String getAtrDescripcion() {
        return atrDescripcion;
    }

    public int getAtrCalificacion() {
        return atrCalificacion;
    }

    public void setAtrNombre(String atrNombre) {
        this.atrNombre = atrNombre;
    }

    public void setAtrDireccion(String atrDireccion) {
        this.atrDireccion = atrDireccion;
    }

    public void setAtrDescripcion(String atrDescripcion) {
        this.atrDescripcion = atrDescripcion;
    }

    public void setAtrCalificacion(int atrCalificacion) {
        this.atrCalificacion = atrCalificacion;
    }

    public void setAtrColServicios(ArrayList<String> atrColServicios) {
        this.atrColServicios = atrColServicios;
    }
    
    
    
    
}
