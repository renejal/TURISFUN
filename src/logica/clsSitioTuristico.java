package logica;

public class clsSitioTuristico extends clsLugar{
    private String atrTipo;

    public clsSitioTuristico(String atrNombre, String atrDireccion, String atrDescripcion, int atrCalificacion, String atrTipo) {
        super(atrNombre, atrDireccion, atrDescripcion, atrCalificacion);
        this.atrTipo = atrTipo;
    }

    public String getAtrTipo() {
        return atrTipo;
    }

    public void setAtrTipo(String atrTipo) {
        this.atrTipo = atrTipo;
    }
    
}
