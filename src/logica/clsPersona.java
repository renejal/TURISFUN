package logica;

public class clsPersona {
    private String atrNombre;
    private long atrIdentificacion;
    private int atrTelefono;
    private String atrUsuario;
    private String atrContrasena;

    public clsPersona(String atrNombre, long atrIdentificacion, int atrTelefono, String atrUsuario, String atrContrasena) {
        this.atrNombre = atrNombre;
        this.atrIdentificacion = atrIdentificacion;
        this.atrTelefono = atrTelefono;
        this.atrUsuario = atrUsuario;
        this.atrContrasena = atrContrasena;
    }

    public String getAtrNombre() {
        return atrNombre;
    }

    public long getAtrIdentificacion() {
        return atrIdentificacion;
    }

    public int getAtrTelefono() {
        return atrTelefono;
    }

    public String getAtrUsuario() {
        return atrUsuario;
    }

    public String getAtrContrasena() {
        return atrContrasena;
    }

    public void setAtrNombre(String atrNombre) {
        this.atrNombre = atrNombre;
    }

    public void setAtrIdentificacion(long atrIdentificacion) {
        this.atrIdentificacion = atrIdentificacion;
    }

    public void setAtrTelefono(int atrTelefono) {
        this.atrTelefono = atrTelefono;
    }

    public void setAtrUsuario(String atrUsuario) {
        this.atrUsuario = atrUsuario;
    }

    public void setAtrContrasena(String atrContrasena) {
        this.atrContrasena = atrContrasena;
    }
    
    private void modificarDatos(){
        //Desplazarse
    }
}
