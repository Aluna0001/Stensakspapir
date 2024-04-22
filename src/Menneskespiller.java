import java.util.Scanner;
import java.util.Random;

public class Menneskespiller extends Spilleren {
    private Scanner scanner;
    public Menneskespiller(String navn) {
        super(navn);
        scanner = new Scanner(System.in);
    }

    @Override
    public Hand vælgHåndtegn() {
        System.out.println("Vælg et håndtegn (sten, saks eller papir): ");
        String valg = scanner.nextLine().toUpperCase();
        return Hand.valueOf(valg);
    }

}
