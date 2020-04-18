
package data;


public class Usuario {
    private String nombre;
    private int id;
    private String usuario;
    private String contraseña;
    private int cuenta;

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
}
