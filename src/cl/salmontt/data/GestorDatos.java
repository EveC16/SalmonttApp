package cl.salmontt.data;

/**
 * CONTIENE UNA LISTA DE 5 UNIDADES OPERATIVAS DE TIPO "CENTRO CULTIVO" Y "PLANTA PROCESO"
 */

import cl.salmontt.model.CentroCultivo;
import cl.salmontt.model.PlantaProceso;
import cl.salmontt.model.UnidadOperativa;

import java.util.ArrayList;
import java.util.List;

public class GestorDatos {

    private List<UnidadOperativa> listaUnidades = new ArrayList<>();

    public List<UnidadOperativa> getListaUnidades() {

        listaUnidades.add(new PlantaProceso("Virgo", "Puerto Montt", 8000));
        listaUnidades.add(new CentroCultivo("Escorpio", "Río Negro", "Del Mar Negro"));
        listaUnidades.add(new PlantaProceso("Libra", "San Pablo", 5600));
        listaUnidades.add(new CentroCultivo("Capricornio", "Frutillar", "Rosado"));
        listaUnidades.add(new CentroCultivo("Acuario", "Fresia", "Oncorhynchus Masou"));

    return listaUnidades;
    }
}
