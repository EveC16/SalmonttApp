package cl.salmontt.ui;

import cl.salmontt.data.GestorDatos;
import cl.salmontt.model.CentroCultivo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestorDatos = new GestorDatos();

        List<CentroCultivo> listaCentros = gestorDatos.cargarCentros("centros.txt");

        System.out.println("===========SUCURSALES===========");
        for(CentroCultivo centroCultivo : listaCentros){
            System.out.println(centroCultivo);
        }
    }
}