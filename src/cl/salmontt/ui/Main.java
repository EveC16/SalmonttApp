package cl.salmontt.ui;

/**
 * CLASE PRINCIPAL RESPONSABLE DE INICIALIZAR LA APP DESDE LOS METODOS DE LAS CLASES "CONSOLA UI" Y "GESTOR UNIDADES"
 */

import cl.salmontt.data.GestorUnidades;

public class Main {

    public static void main(String[] args) {

        ConsolaUI.mostrarEncabezado();

        GestorUnidades gestorUnidades = new GestorUnidades();
        gestorUnidades.mostrarUnidades();

    }
}