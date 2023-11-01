class Lastbil extends Koeretoej {
    protected int hestekraefter;
    protected int lastkapacitet;
    public Lastbil(int vaegtafgift, String registreringsnummer) {
        super(vaegtafgift, registreringsnummer);
    }
    public Lastbil(int hestekraefter, int lastkapacitet) {
        this.hestekraefter = hestekraefter;
        this.lastkapacitet = lastkapacitet;
    }
    public Lastbil(int vaegtafgift, String registreringsnummer, int hestekraefter, int lastkapacitet) {
        super(vaegtafgift, registreringsnummer);
        this.hestekraefter = hestekraefter;
        this.lastkapacitet = lastkapacitet;
    }
    public int getHestekraefter() {
        return hestekraefter;
    }
    public void setHestekraefter(int hestekraefter) {
        this.hestekraefter = hestekraefter;
    }
    public int getLastkapacitet() {
        return lastkapacitet;
    }
    public void setLastkapacitet(int lastkapacitet) {
        this.lastkapacitet = lastkapacitet;
    }
    public void udskriv(){
        super.udskriv();
        System.out.println("Antal hestekræfter: " + hestekraefter);
        System.out.println("lastkapacitet: " + lastkapacitet);
    }
}