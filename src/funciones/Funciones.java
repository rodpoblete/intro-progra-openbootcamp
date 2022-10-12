package funciones;

public class Funciones {
    public static void main(String[] args) {
        // Primera parte
        System.out.println(suma(2, 4, 8));

        // Segunda parte
        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();

        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        int result;
        return result = a + b +c;
    }
}

class Coche {
    public int puertas = 4;

    public void IncrementarPuertas() {
        this.puertas++;
    }
}