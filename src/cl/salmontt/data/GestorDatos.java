package cl.salmontt.data;

import cl.salmontt.model.CentroCultivo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;

public class GestorDatos {

    public List<CentroCultivo> cargarCentros (String nombreResources){

        List<CentroCultivo> listaCentros = new ArrayList<>();

        // CARGA EL ARCHIVO DESDE EL CLASSPATH

        ClassLoader classLoader = getClass().getClassLoader();

        try {
            InputStream resource = classLoader.getResourceAsStream(nombreResources);

            if (resource == null) {
                System.err.println("No se pudo obtener el archivo " + nombreResources);
                return listaCentros;
            }

            // USA EL BUFFERED READER
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resource));
                String linea;
                int numeroLinea = 0;

                while ((linea = bufferedReader.readLine()) != null) {
                    numeroLinea++;
                    if (linea.trim().isEmpty()) continue;

                    // SEPARA POR ;
                    String[] partes = linea.split(";");
                    if (partes.length != 3) {
                        System.err.println("Linea " + numeroLinea + " no valida");
                        continue;
                    }

                    String nombre = partes[0].trim();
                    String comuna = partes[1].trim();
                    String toneladasProducida = partes[2].trim();

                    try {
                        int toneladasProducidas = Integer.parseInt(toneladasProducida);
                        CentroCultivo centroCultivo = new CentroCultivo();
                        centroCultivo.setNombre(nombre);
                        centroCultivo.setComuna(comuna);
                        centroCultivo.setToneladasProducidas(toneladasProducidas);
                        listaCentros.add(centroCultivo);
                    }catch(NumberFormatException e){
                        System.err.println("Error de formato numerico " + numeroLinea +  " no es un numero entero");
                    }
                }
            } catch (Exception e) {
                System.err.println("Ocurrio un error");
            }
        } catch (NullPointerException e){
        }
        return listaCentros;
    }
}
