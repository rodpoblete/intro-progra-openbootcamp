package clases2;

public class Abstraccion {

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setSonido("BRRR");
        System.out.println(coche.getSonido());
    }
}

abstract class Vehiculo {
    int velocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo() {
        System.out.println("estoy en el constructor de Vehiculo");
    }

    abstract public String getSonido();
    abstract public void setSonido(String sonido);

}

class Coche extends Vehiculo {
    public String getSonido() {
        return "Soy un supersonido: " + this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}

class moto extends Vehiculo {
    public String getSonido() {
        return "Soy un sonidillo de moto: " + this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}