package logica;

import java.util.ArrayList;
import java.util.Date;

public class clsControlador {
    static clsControlador atrInstacia;
    clsPrincipal atrObjPrincipal;
    
    public static clsControlador getInstacia(){
        if(atrInstacia == null){
            atrInstacia = new clsControlador();
        }
        return atrInstacia;
    }
    public clsControlador(){
        this.atrObjPrincipal = new clsPrincipal();
    }
    //METODOS PARA USUARIO
    public clsPersona obtenerPersona(String parUsuario){
     return this.atrObjPrincipal.obtenerPersona(parUsuario);
    }
    public void crearUsuario(String parNombre, long parIdentificacion, int parTelefono, String parUsuario, String parContrasena){
        this.atrObjPrincipal.crearSocio(parNombre, parIdentificacion, parTelefono, parUsuario, parContrasena);
    }
    public void crearUsuario(String parNombre, long parIdentificacion, int parTelefono, String parUsuario, String parContrasena, String parPrivilegios){
        this.atrObjPrincipal.crearAdministrador(parNombre, parIdentificacion, parTelefono, parUsuario, parContrasena,parPrivilegios);
    }
    public void crearUsuario(String parNombre, long parIdentificacion, int parTelefono, String parUsuario, String parContrasena, char parGenero){
        this.atrObjPrincipal.crearUsuario(parNombre, parIdentificacion, parTelefono, parUsuario, parContrasena, parGenero);
    }
    public clsPersona inicioSesion(String parUsuario, String parContrasena){
        return this.atrObjPrincipal.iniciarSesion(parUsuario, parContrasena);
    }
    //METODOS PARA LUGAR
    public void agregarLugar(String parNombre, String parDireccion, String parDescripcion, String parCalificacion, String parTipo){
        this.atrObjPrincipal.agregarSitioTuristico(parNombre, parDireccion, parDescripcion, parCalificacion, parTipo);
    }
    public void agregarLugar(String parNombre, String parDireccion, String parDescripcion, String parCalificacion, int parTelefono, clsSocio parSocio, ArrayList parColMenu){
        this.atrObjPrincipal.agregarRestaurante(parNombre, parDireccion, parDescripcion, parCalificacion, parTelefono, parSocio, parColMenu);
    }
    public void agregarLugar(String parNombre, String parDireccion, String parDescripcion, String parCalificacion, int parTelefono, clsSocio parSocio, int parCantidadHabitaciones){
        this.atrObjPrincipal.agregarHotel(parNombre, parDireccion, parDescripcion, parCalificacion, parTelefono, parSocio, parCantidadHabitaciones);
    }
    public ArrayList buscarLugaresPorNombre(String parNombre){
        return this.atrObjPrincipal.obtenerLugaresPorNombre(parNombre);
    }
    public ArrayList obtenerTodosLosLugares(){
        return this.atrObjPrincipal.obtenerTodosLosLugares();
    }
    public ArrayList obtenerEstablecimientosDeSocio(long parIdsocio){
        return this.atrObjPrincipal.obtenerEstablecimientosDeSocio(parIdsocio);
    }
    public boolean calificarLugar(String parNombre, int parCalificacion){
        return this.atrObjPrincipal.calificarLugar(parNombre, parCalificacion);
    }
    
    //Metodos 
    public void agregarReserva(long parIdUsuario, String parNombreEst, Date parFechaReserva, String parDescripcion, boolean parEstado ){
        this.atrObjPrincipal.agregarReserva(parIdUsuario, parNombreEst, parFechaReserva, parDescripcion, parEstado );
    }
}