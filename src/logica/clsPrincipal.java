package logica;

import java.util.ArrayList;
import java.util.Date;

public class clsPrincipal {
    
    ArrayList<clsPersona> atrColUsuarios = new ArrayList();
    ArrayList<clsLugar> atrColLugares = new ArrayList();
    
    public void crearSocio(String parNombre, long parIdentificacion, int parTelefono, String parUsuario, String parContrasena){
        clsPersona objSocio = new clsSocio(parNombre, parIdentificacion, parTelefono, parUsuario, parContrasena);
        this.atrColUsuarios.add(objSocio);
    }
    public void crearAdministrador(String parNombre, long parIdentificacion, int parTelefono, String parUsuario, String parContrasena, String parPrivilegios){
        clsPersona objAdmin = new clsAdministrador(parNombre, parIdentificacion, parTelefono, parUsuario, parContrasena,parPrivilegios);
        this.atrColUsuarios.add(objAdmin);
    }
    public void crearUsuario(String parNombre, long parIdentificacion, int parTelefono, String parUsuario, String parContrasena, char parGenero){
        clsPersona objUsuario = new clsUsuario(parNombre, parIdentificacion, parTelefono, parUsuario, parContrasena, parGenero);
        this.atrColUsuarios.add(objUsuario);
    }
    public clsPersona obtenerPersona(String parUsuario){
        clsPersona objPersona = null;
        for (int varIterador = 0; varIterador < this.atrColUsuarios.size(); varIterador++) {
            if((this.atrColUsuarios.get(varIterador).getAtrUsuario()).equals(parUsuario)){
                objPersona = this.atrColUsuarios.get(varIterador);
                break;
            }
        }
        return objPersona;
    }
    
    public clsPersona iniciarSesion(String parUsuario, String parContrasena){
        clsPersona objPersona = null;
        for (int varIterador = 0; varIterador < this.atrColUsuarios.size(); varIterador++) {
            if((this.atrColUsuarios.get(varIterador).getAtrUsuario()).equalsIgnoreCase(parUsuario)){
                if((this.atrColUsuarios.get(varIterador).getAtrContrasena()).equals(parContrasena)){
                    objPersona = this.atrColUsuarios.get(varIterador);
                }
            }
        }
        return objPersona;
    }
    
    public void agregarSitioTuristico(String parNombre, String parDireccion, String parDescripcion, String parCalificacion, String parTipo){
        clsLugar objLugar = new clsSitioTuristico(parNombre, parDireccion, parDescripcion, 0, parTipo);
        this.atrColLugares.add(objLugar);
    }
    public void agregarRestaurante(String parNombre, String parDireccion, String parDescripcion, String parCalificacion, int parTelefono, clsSocio parSocio, ArrayList parColMenu){
        clsLugar objLugar = new clsRestaurante(parNombre, parDireccion, parDescripcion, parTelefono, parTelefono, parSocio, parColMenu);
        this.atrColLugares.add(objLugar);
    }
    public void agregarHotel(String parNombre, String parDireccion, String parDescripcion, String parCalificacion, int parTelefono, clsSocio parSocio, int parCantidadHabitaciones){
        clsLugar objLugar = new clsHotel(parNombre, parDireccion, parDescripcion, parTelefono, parTelefono, parSocio, parCantidadHabitaciones);
        for (int varIterador = 0; varIterador < parCantidadHabitaciones; varIterador++) {
            clsHabitacion objHabitacion = new clsHabitacion(varIterador,"Sencilla",200000);
            ((clsHotel)objLugar).atrColHabitaciones.add(objHabitacion);
        }
        this.atrColLugares.add(objLugar);
    }
    
    public ArrayList obtenerLugaresPorNombre(String parNombre){
        ArrayList colLugares = new ArrayList();
        for (int varIterador = 0; varIterador < this.atrColLugares.size(); varIterador++) {
            if((this.atrColLugares.get(varIterador).getAtrNombre()).equals(parNombre)){
                colLugares.add(this.atrColLugares.get(varIterador));
            }
        }
        return colLugares;
    }
    public ArrayList obtenerTodosLosLugares(){
        return this.atrColLugares;
    }
    public clsLugar obtenerLugar(String parNombre){
        clsLugar objLugar = null;
        for (int varIterador = 0; varIterador < this.atrColLugares.size(); varIterador++) {
            if((this.atrColLugares.get(varIterador).getAtrNombre()).equals(parNombre)){
                objLugar = this.atrColLugares.get(varIterador);
                break;
            }
        }
        return objLugar;
    }
    public boolean calificarLugar(String parNombre, int parCalificacion){
        clsLugar objLugar = obtenerLugar(parNombre);
        boolean varResultado = false;
        if(objLugar != null){
            objLugar.setAtrCalificacion(parCalificacion);
            varResultado = true;
        }
        return varResultado;
    }
    public ArrayList<clsEstablecimiento> obtenerEstablecimientosDeSocio(long parIdSocio){
        ArrayList<clsEstablecimiento> colLugaresSocio = new ArrayList();
        clsSocio objSocio;
        for (int varIterador = 0; varIterador < this.atrColLugares.size(); varIterador++) {
            objSocio = ((clsEstablecimiento)this.atrColLugares.get(varIterador)).getAtrSocio();
            if((objSocio.getAtrIdentificacion()) == parIdSocio){
                colLugaresSocio.add((clsEstablecimiento)this.atrColLugares.get(varIterador));
            }
        }
        return colLugaresSocio;
    }
    
    public clsReservacion agregarReserva(long parIdUsuario, String parNombreEst, Date parFechaReserva, String parDescripcion, boolean parEstado ){
        clsReservacion objReserva = null;
        for (int varIterador = 0; varIterador < atrColUsuarios.size(); varIterador++) {
            if(this.atrColUsuarios.get(varIterador).getAtrIdentificacion() == parIdUsuario){
                objReserva = new clsReservacion(parIdUsuario, parNombreEst, parFechaReserva, parDescripcion, parEstado);
                ((clsUsuario)this.atrColUsuarios.get(varIterador)).atrColReservas.add(objReserva);
            }
        }
        if(objReserva != null){
            for (int varIterador = 0; varIterador < atrColLugares.size(); varIterador++) {
                if((this.atrColLugares.get(varIterador).getAtrNombre()).equals(parNombreEst)){
                    ((clsEstablecimiento)this.atrColLugares.get(varIterador)).atrColReservas.add(objReserva);
                }
            }
        }
        return objReserva;
    }
    public clsReservacion agregarReserva(long parIdUsuario, String parNombreEst, Date parFechaReserva, String parDescripcion, boolean parEstado, int parNumHabitacion, int parPrincipal){
        clsReservacion objReserva = null;
        for (int varIterador = 0; varIterador < atrColUsuarios.size(); varIterador++) {
            if(this.atrColUsuarios.get(varIterador).getAtrIdentificacion() == parIdUsuario){
                objReserva = new clsReservacion(parIdUsuario, parNombreEst, parFechaReserva, parDescripcion, parEstado);
                ((clsUsuario)this.atrColUsuarios.get(varIterador)).atrColReservas.add(objReserva);
            }
        }
        if(objReserva != null){
            for (int varIterador = 0; varIterador < atrColLugares.size(); varIterador++) {
                if((this.atrColLugares.get(varIterador).getAtrNombre()).equals(parNombreEst)){
                    ((clsEstablecimiento)this.atrColLugares.get(varIterador)).atrColReservas.add(objReserva);
                }
            }
        }   
        return objReserva;
    }
    /*private void generarReserva(long parIdHotel){
        ArrayList<clsHabitacion> objHabitaciones = new ArrayList();
        
        for (int varIterador = 0; varIterador < this.atrColLugares.size(); varIterador++) {
            if((this.atrColLugares.get(varIterador).getClass().getSimpleName()).equals(clsHotel)){
                
            }
        }
    }*/
}
