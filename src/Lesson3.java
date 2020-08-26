import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta käsklus: summma, massiiv, faktoriaal, sordi, tagurpidi");
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
        } else if (kasklus.equalsIgnoreCase("sordi")){
            System.out.println("Siseta massivi suurus x (Vahemikus 2-10)");
            int a = scanner.nextInt();
            System.out.println("");
            int[] c = new int[a];
            System.out.println("Sisesta "+a+" numbrit.");
            for (int i = 0; i < c.length; i++){
                c[i] = scanner.nextInt();
            }
            System.out.println("");
            System.out.println("Numbrid reastatuna on:");
            System.out.print(sordi(c)+" ");
        } else if (kasklus.equalsIgnoreCase("tagurpidi")) {
            System.out.println("Sisestasid sõna");
            String sona = scanner.nextLine();
            System.out.println("");// "+\n"
            System.out.println("Sinu sõna tagurpidi on "+tagurpidi(sona));
        } else{
            System.out.println("Sisestasid vale käskluse");
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
        }
        return a;
    }

    public static int[] sordi(int[] a) {
        // TODO sorteeri massiiv suuruse järgi
        // Näiteks {2, 6, 8, 1}
        // Väljund {1, 2, 6, 8}
        for (int i = 0; i < a.length; i++) {
            if (a[i] >  a[i+1]){
                int ajutine = a[i];
                a[i] = a[i+1];
                a[i+1] = ajutine;
                i = -1; // Vajalik selleks, et ta hakkaks algusest peale järgmist loopi
            }
        }
        return a; // new int [0]
    }

    public static String tagurpidi(String a) {
        // TODO tagasta string tagurpidi
        // Näiteks:
        // a = "Test";
        // return tseT";
        return a; //" "
    }

    public static boolean isPrime(int x){
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
        return false;
    }

}