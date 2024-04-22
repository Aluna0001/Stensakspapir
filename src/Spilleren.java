public abstract class Spilleren {
    private String navn;
    private int points;

    public Spilleren(String navn) {
    }
    public String getNavn() {
        return navn;
    }
    public int getPoints() {
        return points;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public void tælPointOp() {
        points++;
    }
    public abstract Hand vælgHåndtegn();
}
