package logica;

public abstract class clsDecorador {
    private clsHabitacion objHabitacion;

    public clsDecorador(clsHabitacion objHabitacion) {
        this.objHabitacion = objHabitacion;
    }
    
    public clsHabitacion getObjHabitacion() {
        return objHabitacion;
    }

    public void setObjHabitacion(clsHabitacion objHabitacion) {
        this.objHabitacion = objHabitacion;
    }
    
    public abstract String getDescipcion();
    public abstract int getPrecio();
    
}
