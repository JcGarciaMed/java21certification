package basics.arrays;

public class Ejemplo {
    static int[] x = new int[5];

    static {
        x[0] = 10;
        System.out.println("Bloque estático ejecutado");
    }

    public Ejemplo() {

    }

    public void doSomething() {
        System.out.println("doSomething " + x[0]);
    }
}
