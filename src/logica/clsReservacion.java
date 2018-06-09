package logica;

import java.util.Date;

public class clsReservacion {
    long atrIdentificacionUsuario;
    String atrNombreEstablecimiento;
    Date atrFechaReserva;
    String atrDescripcion;
    boolean atrEstado;
    int numero;

    public clsReservacion(long atrIdentificacionUsuario, String atrNombreEstablecimiento, Date atrFechaReserva, String atrDescripcion, boolean atrEstado) {
        this.atrIdentificacionUsuario = atrIdentificacionUsuario;
        this.atrNombreEstablecimiento = atrNombreEstablecimiento;
        this.atrFechaReserva = atrFechaReserva;
        this.atrDescripcion = atrDescripcion;
        this.atrEstado = atrEstado;
    }

    public long getAtrIdentificacionUsuario() {
        return atrIdentificacionUsuario;
    }

    public String getAtrNombreEstablecimiento() {
        return atrNombreEstablecimiento;
    }

    public Date getAtrFechaReserva() {
        return atrFechaReserva;
    }

    public String getAtrDescripcion() {
        return atrDescripcion;
    }

    public boolean isAtrEstado() {
        return atrEstado;
    }

    public void setAtrIdentificacionUsuario(long atrIdentificacionUsuario) {
        this.atrIdentificacionUsuario = atrIdentificacionUsuario;
    }

    public void setAtrNombreEstablecimiento(String atrNombreEstablecimiento) {
        this.atrNombreEstablecimiento = atrNombreEstablecimiento;
    }

    public void setAtrFechaReserva(Date atrFechaReserva) {
        this.atrFechaReserva = atrFechaReserva;
    }

    public void setAtrDescripcion(String atrDescripcion) {
        this.atrDescripcion = atrDescripcion;
    }

    public void setAtrEstado(boolean atrEstado) {
        this.atrEstado = atrEstado;
    }
    
    
}
