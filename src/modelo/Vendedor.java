package modelo;

public class Vendedor {

    private String usuario;
    private String dni;
    private String telefono;
    private String contraseña;

    public Vendedor() {
    }

    public Vendedor(String usuario, String dni, String telefono, String contraseña) {
        this.usuario = usuario;
        this.dni = dni;
        this.telefono = telefono;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
