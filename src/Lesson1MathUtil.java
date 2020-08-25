import java.util.Scanner;

public class Lesson1MathUtil {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String rida = scanner.nextLine();
        System.out.println("Min: "+min(45,35));
        System.out.println("Max: "+max(69,75));
        System.out.println("Absoluutväärtus: "+abs(-65));
        System.out.println("Kas paaris? "+isEven(46));
        System.out.println(min(36,45,21));
        System.out.println(max(84,96,71));
    }


    public static int min(int a, int b) {
        // TODO tagasta a ja b väikseim väärtus
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }


    public static int max(int a, int b){
        // TODO tagasta a ja b suurim väärtus
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int abs(int a){
        // TODO tagasta a absoluut arv
        // abs(a) korral viskab erroreid
        if (a > 0) {
            return a;
        } else {
            return -a;
        }
    }

    public static boolean isEven(int a){
        // TODO tagasta true, kui a on paaris arv
        if (a % 2 == 0){
            return true;
        } else {
            // tagasta false kui a on paaritu arv
            return false;
        }
    }

    public static int min(int a, int b, int c){
        // TODO tagasta a, b ja c väikseim väärtus
        if (a < b && a < c) {
            return a;
        } else if (b < c){
            return b;
        } else {
            return c;
        }
    }

    public static int max(int a, int b, int c){
        // TODO tagasta a, b ja c suurim väärtus
        if (a > b && a > c) {
            return a;
        } else if (b > c){
            return b;
        } else {
            return c;
        }
    }

}
