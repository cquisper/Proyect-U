package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoVendedor {

    private File archivoVendedor;
    private String direccion = "Documents\\repertorioVendedores.txt";

    public void crearArchivo() {
        archivoVendedor = new File(direccion);

        try {
            if (archivoVendedor.createNewFile()) {
                //archivo creado
            }
        } catch (IOException ex) {
            //System.out.println("Error : " + ex);
        }
    }

    public void escribirTexto(Vendedor vendedor) {
        try {
            FileWriter escribir = new FileWriter(archivoVendedor, true);
            escribir.write(vendedor.getUsuario() + "%" + vendedor.getDni() + "%" + vendedor.getTelefono() + "%" + vendedor.getContraseña() + "\r\n");
            escribir.close();

        } catch (IOException ex) {
            //System.out.println("Error : " + ex);
        }
    }

    public ArrayList<Vendedor> generarArrayListConArchivo() {
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        Vendedor vendedor;
        String cadena, fila[];
        try {
            FileReader lector = new FileReader(direccion);
            BufferedReader lectura = new BufferedReader(lector);

            cadena = lectura.readLine();
            while (cadena != null) {
                fila = cadena.split("%");
                vendedor = new Vendedor();
                vendedor.setUsuario(fila[0]); // 3
                vendedor.setDni(fila[1]);
                vendedor.setTelefono(fila[2]);
                vendedor.setContraseña(fila[3]);
                //añade el vendedor al arreglo dinamico
                vendedores.add(vendedor);
                //lee la siguiente fila
                cadena = lectura.readLine();
            }
            
            lector.close();

        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        return vendedores;
    }
}