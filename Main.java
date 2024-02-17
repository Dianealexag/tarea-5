public class Main {

    private int x;
    private int y;

    public Main(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprimirResultados() {
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Suma: " + (x + y));
        System.out.println("Resta: " + (x - y));
        System.out.println("Multiplicación: " + (x * y));
        System.out.println("División: " + (x / y));
        System.out.println("Módulo: " + (x % y));
    }

    public static void main(String[] args) {
        Main operaciones = new Main(10, 5);
        operaciones.imprimirResultados();
    }
}