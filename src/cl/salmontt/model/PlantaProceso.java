package cl.salmontt.model;

/**
 * REPRESENTA UNA PLANTA DE PROCESO Y EXTIENDE DE LA CLASE UNIDAD OPERATIVA, HEREDA SUS ATRIBUTOS "NOMBRE Y COMUNA"
 *  Y TIENE COMO UNICO ATRIBUTO PROPIO "TONELADAS PRODUCCIÓN"
 * SOBREESCRIBE EL METODO MOSTRAR INFORMACIÓN DE LA CLASE SUPER
 */

public class PlantaProceso extends UnidadOperativa{

    private int toneladasProduccion;

    public PlantaProceso(String nombre, String comuna, int toneladasProduccion) {
        super(nombre, comuna);
        this.toneladasProduccion = toneladasProduccion;
    }

    public int getToneladasProduccion() {
        return toneladasProduccion;
    }

    public void setToneladasProduccion(int toneladasProduccion){
        this.toneladasProduccion = toneladasProduccion;
    }

    // SOBREESCRITURA DE METODO DE SUPER
    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre: " + getNombre() + ", comuna: " + getComuna() +
                ", toneladas de producción:  " + toneladasProduccion);
    }
}
