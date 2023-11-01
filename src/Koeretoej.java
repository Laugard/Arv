public class Koeretoej {
    protected int vaegtafgift;
    protected String registreringsnummer;
    public Koeretoej() {
    }
    public Koeretoej(int vaegtafgift, String registreringsnummer) {
        this.vaegtafgift = vaegtafgift;
        this.registreringsnummer = registreringsnummer;
    }
    public void udskriv() {
        System.out.println("Registreringsnummer: " + registreringsnummer);
        System.out.println("Vægtafgift: " + vaegtafgift);
    }
}