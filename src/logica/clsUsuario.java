package logica;

import java.util.ArrayList;

public class clsUsuario extends clsPersona{
    private char atrGenero;
    ArrayList atrColReservas = new ArrayList();

    public clsUsuario(String atrNombre, long atrIdentificacion, int atrTelefono, String atrUsuario, String atrContrasena, char atrGenero) {
        super(atrNombre, atrIdentificacion, atrTelefono, atrUsuario, atrContrasena);
        this.atrGenero = atrGenero;
    }

    public char getAtrGenero() {
        return atrGenero;
    }

    public void setAtrGenero(char atrGenero) {
        this.atrGenero = atrGenero;
    }
    
    
    private void buscarLugar(){
        //TODO
    }
    private void reservar(){
        //TODO
    }
    private void calificar(){
        //TODO
    }
    private void modificarPerfil(){
        //TODO
    }
    private void cancelarReserva(){
        //TODO
    }
    private void localizarTuristas(){
        //TODO
    }
    private void modificarDatos(){
        //TODO
    }
}
