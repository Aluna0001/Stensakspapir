import java.util.Random;

public class Computerspiller extends Spilleren {
    private Random random;
    public Computerspiller(String navn);
    super();
    random = new Random();


    @Override
    public Hand vælgHåndtegn() {
        int valg = random.nextInt(3);
        return Hand.values()[valg];
    }
}
