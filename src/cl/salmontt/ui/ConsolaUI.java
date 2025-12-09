package cl.salmontt.ui;

/**
 * RESPONSABLE DE LA PRESENTACIÓN DEL ENCABEZADO, UTILIZA CÓDIGO DE ESCAPE ANSI PARA APLICAR COLOR AZUL
 * Y RESETEAR AL FINAL DE CADA LINEA
 */

public class ConsolaUI {

    public static void mostrarEncabezado() {

        String ANSI_AZUL = "\033[34m";
        String ANSI_RESET = "\033[0m";

        System.out.println(ANSI_AZUL + "===============================" + ANSI_RESET);
        System.out.println(ANSI_AZUL + "UNIDADES OPERATIVAS DE SALMONTT" + ANSI_RESET);
        System.out.println(ANSI_AZUL + "===============================" + ANSI_RESET);
    }
}
