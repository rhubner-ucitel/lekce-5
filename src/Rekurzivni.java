public class Rekurzivni {


    public static void main(String[] args) {
        System.out.println("vypocet factorialu");

        long vysledek = factorial(15000);

        System.out.print("vysledek : ");
        System.out.println(vysledek);
    }

    public static long factorial(long n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }




}
