import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {
        //exercise1();
        //exercise2(4);
        //exercise3(2, 5);
        //fibonacci(5);
        //exercise5();
        //exercise7();
        exercise8();
    }

    public static void exercise1() {
        // TODO loo 10 elemendile täisarvude massiv
        int[] m = new int[10];//Uue massiivi tegemine

        // TODO loe sisse konsoolist 10 täisarvu
        System.out.println("Sisesta 10 täisarvu");
        for (int i = 0; i < m.length; i++) {
            Scanner scanner = new Scanner(System.in); //loob uue skänneri
            m[i] = scanner.nextInt();// Annab numbrile m kohal i väärtuse
        }
        System.out.println("");
        // TODO trüki arvud välja vastupidises järiekorras
        for (int i = m.length - 1; i >= 0; i--) {
            System.out.print(m[i] + " ");
        }
    }

    public static void exercise2(int x) {
        // TODO prindi välja x esimest paaris arvu
        // Näide:
        System.out.println("");
        System.out.println("Sisesta number mitut järjestiku paariarvu soovid näha");
        Scanner scanner = new Scanner(System.in); //loob uue skänneri
        int a = scanner.nextInt();
        System.out.println("");
        for (int i = 1; i <= a; i++) {
            System.out.println(2 * i);
        }
        // Sisend 5
        // Väljund 2 4 6 8 10
    }

    public static void exercise3(int x, int y) {
        // TODO trüki välja korrutustabel mis on x ühikut lai ja y ühikut kõrge
        // TODO näiteks x = 3 y = 3
        System.out.println("Sisesta tabeli korrutustabeli laius ja kõrgus x1 ja y1");
        Scanner scanner = new Scanner(System.in); //loob uue skänneri
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("");
        for (int i = 1; i <= x1; i++) {
            for (int j = 1; j <= y1; j++) {
                System.out.print(i * j + " ");//print println asemel jätab ühele reale
            }
            System.out.println();//Tekitab uue rea kui i on iga j-ga läbi korrutatud
        }
        // TODO väljund
        // 1 2 3
        // 2 4 6
        // 3 6 9
    }

    public static int fibonacci(int n) {
        // TODO
        // Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);
        // 0, 1, 1, 2, 3, 5, 8, 13, 21
        System.out.println("Mitmendat Fibonacci jada elementi otsid?");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        System.out.println("");
        int fib1 = 0;
        int fib2 = 1;
        int fibn = 0;
        for (int i = 0; i < n1 - 2; i++) {
            fibn = fib1 + fib2;// fibn = fib1+ fib2 = 0 + 1 = 1
            //fibn vastab fib3 (kolmas number jadas), seepärast n1-2
            fib1 = fib2; // fib1 = 1
            fib2 = fibn; // fib2 = 1
        }
        System.out.println("Vastus:");
        System.out.println(fibn);

        // Tagasta fibonacci jada n element
        return 0;
    }

    public static void exercise5() {
        // https://onlinejudge.org/index.php?option=onlinejudge&Itemid=8&page=show_problem&problem=36
        System.out.println("Sisesta 2 numbrit 1 ja 10 000 vahel");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt(); // 1. arv
        int j = scanner.nextInt(); // 2. arv
        int maxpikkus = 0;// maksimaalne jada pikkus
        for (int k = i; k <= j; k++) {
            int pikkus = 1;// Jada pikkus 1-ni jõudmiseks arvu k puhul
            int k1 = k; //Annab k1-le väärtuse k, ehk number mida vaatleme
            while (k1 != 1) {

                if (k1 % 2 != 0) {
                    k1 = 3 * k1 + 1;
                } else {
                    k1 = k1 / 2;
                }
                pikkus++;//Suurendab k1 jada pikkuse lugerit
            }
            if (maxpikkus < pikkus) { //Võrleb hetkel olevat maksimumpikkust leitud pikkusega
                maxpikkus = pikkus; //Seab maksimumpikkuse leitud suuriima pikkusega võrdseks
            }
        }
        System.out.println("\n" + "Vastus:");
        System.out.println(i + " " + j + " " + maxpikkus);
    }

    public static void exercise6() {
        /*
            Kirjutada Java programm, mis loeb failist visits.txt sisse looduspargi külastajad erinevatel jaanuari päevadel ning
            a) sorteerib külastuspäevad külastajate arvu järgi kasvavalt ning prindib tulemuse konsoolile;
            b) prindib konsoolile päeva, mil külastajaid oli kõige rohkem.
            Faili asukoht tuleb programmile ette anda käsurea parameetrina.
         */
    }

    public static void exercise7() {
        // TODO arvuta kasutades BigDecimali 1.89 * ((394486820340 / 15 ) - 4 )
        BigDecimal a = new BigDecimal(1.89);
        BigDecimal b = new BigDecimal("394486820345");
        BigDecimal c = new BigDecimal("15");
        BigDecimal d = new BigDecimal("4");
        BigDecimal vastus = b.divide(c, 2, RoundingMode.HALF_UP); // RoundingMode.HALF_UP, 2. kohta peale koma
        vastus = vastus.subtract(d);
        a = a.round(new MathContext(3)); //new MathContext, kui varem pole kasutanud
        vastus = a.multiply(vastus);//Multiply korral round ei saa kasutada
        System.out.println(vastus);
    }

    public static void exercise8() {
        /*
        Failis nums.txt on üksteise all 150 60-kohalist numbrit.

        Kirjuta programm, mis loeks antud numbrid failist sisse ja liidaks need arvud kokku ning kuvaks ekraanil summa.
        Faili nimi tuleb programmile ette anda käsurea parameetrina.

        VASTUS:
        Õige summa: 77378062799264987173249634924670947389130820063105651135266574
         */
        Scanner scanner = new Scanner(System.in);

        BigInteger vastus = new BigInteger("0");

        vastus = vastus +j;
        System.out.println("Vastus on: ");
    }


    public static void exercise9() {
        /* TODO
        Sama mis eelmises ülesandes aga ära kasuta BigInt ega BigDecimal klassi
         */
    }

}