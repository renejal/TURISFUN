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
    public Object obtenerSocio(String parUsuario){
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
    public void agregarEstablecimientoSocio(String using,String parNombre, String parDireccion, String parDescripcion, String parCalificacion, int parTelefono,int parCantidadHabitaciones){
        Object persona= this.obtenerPersona(using);
        this.agregarLugar(parNombre, parDireccion, parDescripcion, parCalificacion, parTelefono, (clsPersona) persona, parCantidadHabitaciones);
       
    }
    public Object obtenerPersona(String parUsing){
        
        for (int i = 0; i < this.atrObjPrincipal.getAtrColUsuarios().size(); i++) {
            if (this.atrObjPrincipal.getAtrColUsuarios().get(i).getAtrUsuario().equals(parUsing)) {
                return this.atrObjPrincipal.getAtrColUsuarios().get(i);
            }
        }
        return null;
     
    }
    public String agregarServiciosLugar(String parNombreLugar,ArrayList<String> parServicios){
        String varResultado = "No existe un establecimiento";
        if(obtenerlugarConNombre(parNombreLugar) != null){
        this.obtenerlugarConNombre(parNombreLugar).setAtrColServicios(parServicios);
         varResultado = "se han agreado los servicios";
        }
        return varResultado;
        
    }
    public clsLugar obtenerlugarConNombre(String parNombreLugar){
        ArrayList varColLugares = this.obtenerlistadoEstablecimientos();
        for (int i = 0; i < varColLugares.size(); i++) {
            if(((clsLugar)varColLugares.get(i)).getAtrNombre().equals(parNombreLugar)){
                return (clsLugar)varColLugares.get(i);
            }
        
    }
        return null;
    }
    //METODOS PARA LUGAR
    public void agregarLugar(String parNombre, String parDireccion, String parDescripcion, String parCalificacion, String parTipo){
        this.atrObjPrincipal.agregarSitioTuristico(parNombre, parDireccion, parDescripcion, parCalificacion, parTipo);
    }
    public void agregarLugar(String parNombre, String parDireccion, String parDescripcion, String parCalificacion, int parTelefono, clsSocio parSocio, ArrayList parColMenu){
        this.atrObjPrincipal.agregarRestaurante(parNombre, parDireccion, parDescripcion, parCalificacion, parTelefono, parSocio, parColMenu);
    }
    public void agregarLugar(String parNombre, String parDireccion, String parDescripcion, String parCalificacion, int parTelefono, clsPersona parSocio, int parCantidadHabitaciones){
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
    public String crudEliminarEstablecimiento(String parNombre){
        return this.atrObjPrincipal.crudEliminarEstablecimiento(parNombre);
    }
    //Metodos 
    public void agregarReserva(String parIdUsuario, String parNombreEst, String parFechaReserva, String parDescripcion, boolean parEstado ){
        this.atrObjPrincipal.agregarReserva(parIdUsuario, parNombreEst, parFechaReserva, parDescripcion, parEstado );
    }
    public ArrayList<clsLugar> obtenerlistadoEstablecimientos(){
        ArrayList<clsLugar> varEstablecimiento = new ArrayList();
        ArrayList<clsLugar> varColLugares=this.obtenerTodosLosLugares();
        for (int i = 0; i < varColLugares.size(); i++) {
            boolean esHotel=varColLugares.get(i).getClass().getSimpleName().equals("clsHotel");
            boolean esRestaubrante = varColLugares.get(i).getClass().getSimpleName().equals("clsRestaubrante");
            boolean esEstablecimiento = varColLugares.get(i).getClass().getSimpleName().equals("clsEstablecimiento");
            if(esHotel || esEstablecimiento || esRestaubrante){
                varEstablecimiento.add(varColLugares.get(i));
            }
            
        }
        return varEstablecimiento;
    }
}