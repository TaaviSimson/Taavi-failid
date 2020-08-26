import java.util.Random;
import java.util.Scanner;

// Enne kui seda tegema hakkad tee ära Lesson 2 (välja arvatud ülesanded 6, 8, 9)
public class Lesson3Hard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisestka käsklus: evenFibonacci");
        String kasklus = scanner.nextLine();
        System.out.println("");
        if (kasklus.equalsIgnoreCase("evenFibonacci")){
            System.out.println("Sisesta number milleni soovid Fibonacci jada paaris arvud liita");
            int a = scanner.nextInt();
            System.out.println("\n"+"Arvuni "+a+" on Fibonacci jada paaris numbrite summa on "+evenFibonacci(a));
        } else{
            System.out.println("Sisestasid tundmatu käskluse");
        }
    }

    public static int evenFibonacci(int x){
        // TODO liida kokku kõik paaris fibonacci arvud kuni numbrini x

        return 0;
    }

    public static void randomGame(){
        // TODO kirjuta mäng mis võtab suvalise numbri 0-100, mille kasutaja peab ära arvama
        // iga kord pärast kasutaja sisestatud täis arvu peab programm ütlema kas number oli suurem või väiksem
        // ja kasutaja peab saama uuesti arvata
        // numbri ära aramise korral peab programm välja trükkima mitu katset läks numbri ära arvamiseks
        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println(i);
    }

    public static String morseCode(String text){
        // TODO kirjuta programm, mis tagastab sisestatud teksti morse koodis (https://en.wikipedia.org/wiki/Morse_code)
        // Kasuta sümboleid . ja -
        return "";
    }
}