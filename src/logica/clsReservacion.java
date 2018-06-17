package logica;

import java.util.Date;

public class clsReservacion {
    String atrUsuario;
    String atrNombreEstablecimiento;
    String atrFechaReserva;
    String atrDescripcion;
    boolean atrEstado;
    int numero;

    public clsReservacion(String atrIdentificacionUsuario, String atrNombreEstablecimiento, String atrFechaReserva, String atrDescripcion, boolean atrEstado) {
        
        this.atrUsuario = atrIdentificacionUsuario;
        this.atrNombreEstablecimiento = atrNombreEstablecimiento;
        this.atrFechaReserva = atrFechaReserva;
        this.atrDescripcion = atrDescripcion;
        this.atrEstado = atrEstado;
    }

    public String getAtrUsuario() {
        return atrUsuario;
    }

    public String getAtrNombreEstablecimiento() {
        return atrNombreEstablecimiento;
    }

    public String getAtrFechaReserva() {
        return atrFechaReserva;
    }

    public String getAtrDescripcion() {
        return atrDescripcion;
    }

    public boolean isAtrEstado() {
        return atrEstado;
    }

    public void setAtrIdentificacionUsuario(String atrUsuario) {
        this.atrUsuario = atrUsuario;
    }

    public void setAtrNombreEstablecimiento(String atrNombreEstablecimiento) {
        this.atrNombreEstablecimiento = atrNombreEstablecimiento;
    }

    public void setAtrFechaReserva(String atrFechaReserva) {
        this.atrFechaReserva = atrFechaReserva;
    }

    public void setAtrDescripcion(String atrDescripcion) {
        this.atrDescripcion = atrDescripcion;
    }

    public void setAtrEstado(boolean atrEstado) {
        this.atrEstado = atrEstado;
    }
    
    
}
