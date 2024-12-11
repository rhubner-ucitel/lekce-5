public class GlobalniPromenne {

    public static int a = 10;


    public static void main(String[] args) {
        System.out.println("hodnota globalniho a: " + a);
        secti(5, 17);
        System.out.println("hodnota globalniho a: " + a);

        int t = 5;

        umocniAUlozDoA(t);
        System.out.println("hodnota t: " + t);
        System.out.println("hodnota globalniho a: " + a);
    }

    public static void umocniAUlozDoA(int a) {
        GlobalniPromenne.a = a * a;
        a = a * a;
    }

    public static void secti(long a, long b) {
        System.out.println("hodnota a: " + a);
        System.out.println("hodnota globalni a: " + GlobalniPromenne.a);
        System.out.print("Vysledek souctu je : ");
        System.out.println(a + b);
    }





}
