package metodosClase;

public class MetodosClase {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 20;
        cliente.nombre = "Juan";
        cliente.telefono = 123123123;
        cliente.credito = 1000;

        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    public int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    int salario;
}