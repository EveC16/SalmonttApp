package cl.salmontt.model;

/**
 *  REPRESENTA UNA UNIDAD OPERATIVA CON ATRIBUTOS COMUNES "NOMBRE" Y "COMUNA"
 *  TIENE UNA RELACION DE HERENCIA "MULTIPLE" CON LAS CLASES "CENTRO CULTIVO" Y "PLANTA PROCESO"
 *  IMPLEMENTA EL METODO "MOSTRAR INFORMACIÓN"
 */

public class UnidadOperativa {

    private String nombre;
    private String comuna;

    public UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
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

    public void mostrarInformacion(){
        System.out.println("Nombre de la unidad: " + nombre + ", comuna: " + comuna);
    }
}
