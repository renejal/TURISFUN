package logica;

public class clsHabitacion {
    private int atrNumero;
    private String atrDescripcion;
    private int atrPrecio;

    public clsHabitacion(int atrNumero, String atrDescripcion, int atrPrecio) {
        this.atrNumero = atrNumero;
        this.atrDescripcion = atrDescripcion;
        this.atrPrecio = atrPrecio;
    }

    public int getAtrNumero() {
        return atrNumero;
    }

    public String getAtrDescripcion() {
        return atrDescripcion;
    }

    public int getAtrPrecio() {
        return atrPrecio;
    }

    public void setAtrNumero(int atrNumero) {
        this.atrNumero = atrNumero;
    }

    public void setAtrDescripcion(String atrDescripcion) {
        this.atrDescripcion = atrDescripcion;
    }

    public void setAtrPrecio(int atrPrecio) {
        this.atrPrecio = atrPrecio;
    }
    
    
}
