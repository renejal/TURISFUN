
package presentacion;

public class clsFabrica {
  public clsInterfaz fabricarInterfaz(String tipo){
      clsInterfaz interfaz = null;
      if(tipo.equals("clsSocio")){
          interfaz = new interfazSocio();   
      }
      else if(tipo.equals("clsUsuario")){
          interfaz = new InterfazUsuario();
      }
      else if(tipo.equals("clsAdministrador")){
          interfaz = new interfazAdministrador();
      }
      
      return interfaz;
  }  
}
