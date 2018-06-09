package logica;

public class clsAdministrador extends clsPersona{
    private String atrPrivilegios;
    public clsAdministrador(String atrNombre, long atrIdentificacion, int atrTelefono, String atrUsuario, String atrContrasena, String parPrivilegios) {
        super(atrNombre, atrIdentificacion, atrTelefono, atrUsuario, atrContrasena);
        this.atrPrivilegios = parPrivilegios;
    }
    
    private void bloquearCuentas(){
        //TODO
    }
    private void modificarDatos(){
        //TODO
    }
    
}
