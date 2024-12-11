


public class Metody {



    public static void main(String[] args) {
        double vysledek = sectiCisla(1, 2);
        System.out.println(vysledek);

        sayHello();

        vynasobCisla(10, 20);

        double vysledek2 = sectiCisla(10, 20);
    }

    public static void publicMetoda() {
        System.out.println("Public metoda");
    }

    private static void privateMetoda() {
        System.out.println("Public metoda");
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void vynasobCisla(int a, int b) {
        int vysledek = a * b;

        System.out.print("Vysledek nasobeni : ");
        System.out.println(vysledek);
    }

    static double sectiCisla(double a, double b) {
        if (a < 10) {
            System.out.println("Umim scitat pouze cisla vetsi nez 10");
            return 0;
        }
        return a + b;
    }



}
