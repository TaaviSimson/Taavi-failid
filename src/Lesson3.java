import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta käsklus: summma, massiiv, faktoriaal");
        String kasklus = scanner.nextLine();
        System.out.println("");

        if (kasklus.equalsIgnoreCase("summa")){
            System.out.println("Sisesta liidetavad arvud a ja b");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("");
            System.out.println("Arvude a ja b summa on "+summa(a,b));
        } else if (kasklus.equalsIgnoreCase("massiiv")){
            System.out.println("Siseta massivi suurus x (Vahemikus 2-10)");
            int a = scanner.nextInt();
            System.out.println("");
            int[] c = new int[a];
            System.out.println("Sisesta "+a+" numbrit.");
            for (int i = 0; i < c.length; i++){
                c[i] = scanner.nextInt();
            }
            System.out.println("");
            System.out.println("Massiivis olevate numbrite summa on "+massiiv(c));
        } else if (kasklus.equalsIgnoreCase("faktoriaal")){
            System.out.println("Millise numbri faktoriaali otsid?");
            int a = scanner.nextInt();
            System.out.println("");
            System.out.println("Arvu "+a+" faktoriaal on:"+faktoriaal(a));
        } else {
            System.out.println("");
        }

    }

    public static int summa(int x, int y) {
        // TODO liida kokku ja tagasta x ja y väärtus
        int a = x+y;
        return a;
    }

    public static int massiiv(int[] x){
        // Todo liida kokku kõik numbrid massivis x
        int sum = 0;
        for (int i =0; i < x.length; i++){ //Massiivi pikkuse sisendamine. x.length
            sum += x[i];
        }
        int c = sum;
        return c;
    }

    public static int faktoriaal(int x) {
        // TODO tagasta x faktoriaal.
        // Näiteks
        // x = 5
        // return 4*3*2*1 = 24
        int a = 1; //Siin peab olema 1, muidu vastus pidevalt 0
        for (int i = 1; i <= x; i++){
            a *= i;
        };
        return a;
    }

    public static int[] sort(int[] a) {
        // TODO sorteeri massiiv suuruse järgi
        // Näiteks {2, 6, 8, 1}
        // Väljund {1, 2, 6, 8}
        return new int[0];
    }

    public static String reverseString(String a) {
        // TODO tagasta string tagurpidi
        // Näiteks:
        // a = "Test";
        // return tseT";
        return "";
    }

    public static boolean isPrime(int x){
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
        return false;
    }

}