package cl.salmontt.model;

/**
 * REPRESENTA UN CENTRO CULTIVO Y EXTIENDE DE LA CLASE UNIDAD OPERATIVA, HEREDA SUS ATRIBUTOS "NOMBRE Y COMUNA"
 *  Y TIENE COMO UNICO ATRIBUTO PROPIO "ESPECIE"
 * SOBREESCRIBE EL METODO MOSTRAR INFORMACIÓN DE LA CLASE SUPER
 */

public class CentroCultivo extends UnidadOperativa{

    private String especie;

    public CentroCultivo(String nombre, String comuna, String especie) {
        super(nombre, comuna);
        this.especie = especie;
    }

    public String getespecie() {
        return especie;
    }

    public void setespecie(String especie) {
        this.especie = especie;
    }

    // SOBREESCRITURA DE METODO DE SUPER
    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre: " + getNombre() + ", comuna: " + getComuna() +
                ", especide de salmón:  " + especie);
    }
}
