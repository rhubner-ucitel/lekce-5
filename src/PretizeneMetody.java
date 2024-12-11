public class PretizeneMetody {


    public static void main(String[] args) {
        System.out.println("Pretizene metody");

        long vysledek = secti(10, 30);
        System.out.print("Vysledek : ");
        System.out.println(vysledek);


        double vysledek2 = secti(15.3f, 18.5f);
        System.out.print("Vysledek2 : ");
        System.out.println(vysledek2);

        long vysledek3 = secti(10);
        System.out.print("Vysledek3 : ");
        System.out.println(vysledek3);

    }

    public static long secti(long a) {
        return secti(a, 10);
    }

    public static long secti(long a, long b) {
        System.out.println("scitame long");
        return a + b;
    }

    public static double secti(float a, double b) {
        System.out.println("scitame double");
        return a + b;
    }


}
