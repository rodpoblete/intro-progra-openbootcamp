package clases1;

public class Clases {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(30);
        persona1.setNombre("Juan");
        persona1.setTelefono(512565055);

        int edadPersona1 = persona1.getEdad();
        String nombrePersona1 = persona1.getNombre();
        int telefonoPersona1 = persona1.getTelefono();

        System.out.println(edadPersona1);
        System.out.println(nombrePersona1);
        System.out.println(telefonoPersona1);

    }

}
/*
Para practicar la encapsulación:
    Crear clase Persona.
    Crear variables las privadas edad, nombre y teléfono de la clase Persona.
    Crear gets y sets de cada propiedad.
    Crear un objeto persona en el main.
    Utiliza los gets y sets para darle valores a las propiedades edad, nombre y teléfono, por último muéstralas por consola.
*/
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }
}