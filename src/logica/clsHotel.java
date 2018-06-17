package logica;

import java.util.ArrayList;

public class clsHotel extends clsEstablecimiento{
    private int atrCantidadHabitaciones;
    ArrayList<clsHabitacion> atrColHabitaciones = new ArrayList();
            
    public clsHotel(String atrNombre, String atrDireccion, String atrDescripcion, int atrCalificacion, int atrTelefono, clsPersona atrSocio, int parCantidadHabitaciones) {
        super(atrNombre, atrDireccion, atrDescripcion, atrCalificacion, atrTelefono, atrSocio);
        this.atrCantidadHabitaciones = parCantidadHabitaciones;
        
    }

    public int getAtrCantidadHabitaciones() {
        return atrCantidadHabitaciones;
    }

    public void setAtrCantidadHabitaciones(int atrCantidadHabitaciones) {
        this.atrCantidadHabitaciones = atrCantidadHabitaciones;
    }
    
}