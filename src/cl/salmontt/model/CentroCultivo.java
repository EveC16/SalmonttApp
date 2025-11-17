package cl.salmontt.model;

/**
 * REPRESENTA UN CENTRO CULTIVO CON ATRIBUTOS COMO NOMBRE, COMUNA Y TONELADAS PRODUCIDAS
 */

public class CentroCultivo {

    String nombre;
    String comuna;
    int toneladasProducidas;

    public CentroCultivo() {
    }

    public CentroCultivo(String nombre, String comuna, int toneladasProducidas) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.toneladasProducidas = toneladasProducidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public double getToneladasProducidas() {
        return toneladasProducidas;
    }

    public void setToneladasProducidas(int toneladasProducidas) {
        this.toneladasProducidas = toneladasProducidas;
    }

    @Override
    public String toString() {
        return "CentroCultivo{" +
                "Nombre del Centro: '" + nombre + '\'' +
                ", Comuna: '" + comuna + '\'' +
                ", Toneladas Producidas: '" + toneladasProducidas +
                '}';
    }
}
