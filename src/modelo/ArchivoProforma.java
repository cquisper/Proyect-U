package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoProforma {

    private File archivoProforma;
    private String direccionPro = "Documents\\repertorioProforma.txt";
    private float[] caracteristicasMag = new float[5];
    private FileWriter escribir;

    public void crearArchivo() {
        archivoProforma = new File(direccionPro);
        try {
            if (archivoProforma.createNewFile()) {
                //archivo creado
            }
        } catch (IOException ex) {
            //System.out.println("Error : " + ex);
        }
    }

    public void escribirTexto(Proforma proforma) {
        try {
            escribir = new FileWriter(archivoProforma, true);
            caracteristicasMag = proforma.getCaracteristicasMag();
            escribir.write(proforma.getCliente() + "%" + proforma.getTelefono() + "%" + proforma.getDni() + "%"
                    + proforma.getFechaEmision() + "%" + proforma.getTipoVehiculo() + "%"
                    + proforma.getMarca() + "%" + proforma.getModelo() + "%" + proforma.getCodigoProducto() + "%"
                    + caracteristicasMag[0] + "%" + caracteristicasMag[1] + "%" + caracteristicasMag[2] + "%" + caracteristicasMag[3] + "%" + caracteristicasMag[4] + "\r\n");
            escribir.close();

        } catch (IOException ex) {
            //System.out.println("Error : " + ex);
        }
    }

    public ArrayList<Proforma> generarArrayListCliente() {
        ArrayList<Proforma> datosCliente = new ArrayList<>();
        Proforma proforma;
        String cadena, fila[];
        String[] caracteristicasFisicas = new String[5];
        try {
            FileReader lector = new FileReader(direccionPro);
            BufferedReader lectura = new BufferedReader(lector);

            cadena = lectura.readLine();
            while (cadena != null) {
                fila = cadena.split("%");
                //Datos DEL Cliente
                proforma = new Proforma();
                proforma.setCliente(fila[0]);
                proforma.setTelefono(fila[1]);
                proforma.setDni(fila[2]);
                proforma.setFechaEmision(fila[3]);
                //Caracteristicas del vehiculo
                proforma.setTipoVehiculo(fila[4]);
                proforma.setMarca(fila[5]);
                proforma.setModelo(fila[6]);
                proforma.setCodigoProducto(fila[7]);
                //Caracteristicas fisicas del vehiculo 
                proforma.setIndiceMag(0, Float.parseFloat(fila[8]));
                proforma.setIndiceMag(1, Float.parseFloat(fila[9]));
                proforma.setIndiceMag(2, Float.parseFloat(fila[10]));
                proforma.setIndiceMag(3, Float.parseFloat(fila[11]));
                proforma.setIndiceMag(4, Float.parseFloat(fila[12]));
                datosCliente.add(proforma);
                cadena = lectura.readLine();
            }

            lector.close();

        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        return datosCliente;
    }

    public void actualizarRegistro(ArrayList<Proforma> proforma) throws IOException {
        crearArchivo();
        escribir = new FileWriter(archivoProforma, true);
        escribir.close();
        archivoProforma.delete();

        crearArchivo();
        if (!archivoProforma.exists()) {
            try {
                archivoProforma.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        for(Proforma pro: proforma){
            escribirTexto(pro);
        }
    }
}
