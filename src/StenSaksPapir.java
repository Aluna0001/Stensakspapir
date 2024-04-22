public class StenSaksPapir {
    private String spiller1;
    private String spiller2;

    public StenSaksPapir(String spiller1, String spiller2) {
        this.spiller1 = spiller1;
        this.spiller2 = spiller2;
    }
    public void start() {
        System.out.println("Velkommen til Sten, Saks, Papir!");

        int runder = 0;
        while (runder < 3) {
            Hand håndtegnSpiller1 = spiller1.vælgHåndtegn();
            Hand håndtegnSpiller2 = spiller2.vælgHåndtegn();

            System.out.println(spiller1.getNavn() + " valgte: " + håndtegnSpiller1);
            System.out.println(spiller2.getNavn() + " valgte: " + håndtegnSpiller2);

            int resultat = håndtegnSpiller1.compareTo(håndtegnSpiller2);

            if (resultat == 0) {
                System.out.println("Uafgjort!");
            } else if (resultat == 1 || resultat == -2) {
                System.out.println(spiller1.getNavn() + " vinder!");
                spiller1.tælPointOp();
            } else {
                System.out.println(spiller2.getNavn() + " vinder!");
                spiller2.tælPointOp();
            }

            runder++;
        }

        System.out.println("Spillet er slut!");
        System.out.println("Resultat:");
        System.out.println(spiller1.getNavn() + ": " + spiller1.getPoints() + " point");
        System.out.println(spiller2.getNavn() + ": " + spiller2.getPoints() + " point");

        if (spiller1.getPoints() > spiller2.getPoints()) {
            System.out.println(spiller1.getNavn() + " vinder!");
        } else if (spiller1.getPoints() < spiller2.getPoints()) {
            System.out.println(spiller2.getNavn() + " vinder!");
        } else {
            System.out.println("Det er uafgjort!");
        }
    }

    public static void main(String[] args) {
        String spiller1 = new Menneskespiller("Spiller 1");
        String spiller2 = new Computerspiller("Computer");

        StenSaksPapir spil = new StenSaksPapir(spiller1, spiller2);
        spil.start();
    }
}