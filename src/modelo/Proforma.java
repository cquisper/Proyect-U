package modelo;

public class Proforma {

    private String cliente, telefono, dni, fechaEmision, tipoVehiculo, marca, modelo, codigoProducto;
    private float[] caracteristicasMag = new float[5]; // tiempo, kilometraje, velocidad, velocidad instantenea, aceleracion

    public Proforma(String cliente, String telefono, String dni, String fechaEmision, String tipoVehiculo, String marca, String modelo, String codigoProducto, float[] caracteristicasMag) {
        this.cliente = cliente;
        this.telefono = telefono;
        this.dni = dni;
        this.fechaEmision = fechaEmision;
        this.tipoVehiculo = tipoVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.codigoProducto = codigoProducto;
        this.caracteristicasMag = caracteristicasMag;
    }

    public Proforma() {
    }

    public String[] getDatoCliente() {
        String[] datoCliente = {getCliente(), getTelefono(), getDni(), getFechaEmision()};
        return datoCliente;
    }

    public String[] getCaracteristicas() {
        String[] caracteristicas = {getTipoVehiculo(), getMarca(), getModelo(), getCodigoProducto()};
        return caracteristicas;
    }

    public String[] getCaracteristicasFisicas() {
        String[] caracteristicasFisicas = {String.valueOf(getIndiceMag(0)), String.valueOf(getIndiceMag(1)), String.valueOf(getIndiceMag(2)), String.valueOf(getIndiceMag(3)), String.valueOf(getIndiceMag(4))};
        return caracteristicasFisicas;
    }

    public float getIndiceMag(int i) {
        return caracteristicasMag[i];
    }

    public void setIndiceMag(int i, float valor) {
        this.caracteristicasMag[i] = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public float[] getCaracteristicasMag() {
        return caracteristicasMag;
    }

    public void setCaracteristicasMag(float[] caracteristicasMag) {
        this.caracteristicasMag = caracteristicasMag;
    }
}
