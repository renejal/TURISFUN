package logica;

public class clsLugar {
    private String atrNombre;
    private String atrDireccion;
    private String atrDescripcion;
    private int atrCalificacion;

    public clsLugar(String atrNombre, String atrDireccion, String atrDescripcion, int atrCalificacion) {
        this.atrNombre = atrNombre;
        this.atrDireccion = atrDireccion;
        this.atrDescripcion = atrDescripcion;
        this.atrCalificacion = atrCalificacion;
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
    
    
    
    
}
