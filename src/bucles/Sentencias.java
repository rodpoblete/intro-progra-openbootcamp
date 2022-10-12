package bucles;

public class Sentencias {
    public static void main(String[] args) {
        compararNumero();
        bucleWhile();
        doWhile();
        bucleFor();
        bucleSwitch();
    }
    
    public static void compararNumero() {
        // Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        int numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }
    }

    public static void bucleWhile() {
        // Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        // el bloque de código que tendrá el bucle deberá:
        //            Incrementar el valor de la variable en uno cada vez que se ejecute.
        //            Mostrarlo por pantalla cada vez que se ejecute..
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
    }

    public static void doWhile() {
        // Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 3);
    }

    public static void bucleFor() {
        // Crea un bucle For, este bucle tendrá que tener como condición que la variable numeroFor sea inferior a 3,
        // el bloque de código que tendrá el bucle deberá:
        //            Incrementar el valor de la variable en uno cada vez que se ejecute.
        //            Mostrarlo por pantalla cada vez que se ejecute.
        for (int numeroFor = 0; numeroFor < 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    public static void bucleSwitch() {
        // Por último, para el Switch, deberás crear la variable estación, y distintos case para las cuatro estaciones del año.
        // Dependiendo del valor de la variable estación se deberá mandar un mensaje por consola informando de la estación en la que está. 
        // También habrá que poner un default para cuando el valor de la variable no sea una estación.
        String estacion = "Verano";
        switch (estacion) {
            case "Primavera":
                System.out.println("Estamos en primavera");
                break;
            case "Verano":
                System.out.println("Estamos en verano");
                break;
            case "Otoño":
                System.out.println("Estamos en otoño");
                break;
            case "Invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("No es una estación");
                break;
        }
    }
}
