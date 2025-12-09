package cl.salmontt.data;

/**
 * RECORRE LA LISTA DE UNIDADES OPERATIVAS Y TRATA CADA UNIDAD COMO "CENTRO CULTIVO" O "PLANTA PROCESO"
 * SEGUN CORRESPONDA USANDO EL OPERADOR INSTACEOF
 */

import cl.salmontt.model.CentroCultivo;
import cl.salmontt.model.UnidadOperativa;

import java.util.List;

public class GestorUnidades {

    GestorDatos gestorDatos = new GestorDatos();

    public void mostrarUnidades(){

        List<UnidadOperativa> recorrerLista = gestorDatos.getListaUnidades();
        for (UnidadOperativa unidades : recorrerLista){
            if(unidades instanceof CentroCultivo){
                CentroCultivo centro = (CentroCultivo) unidades;
                System.out.println("-> Centro cultivo");
                centro.mostrarInformacion();
            } else {
                System.out.println("-> Planta proceso");
                unidades.mostrarInformacion();
            }
        } // AQUI CIERRA EL FOR PORQUE YA ESTO SE ESTA DESCONTROLANDO
    }
}
