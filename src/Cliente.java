public class Cliente {
    private String nombre;
    private String apellido;

    //==========CONSTRUCTOR==========//
    public Cliente(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //==========CONSTRUCTOR==========//


    //==========GETTER==========//

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    //==========GETTER==========//

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
