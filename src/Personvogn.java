class Personvogn extends Koeretoej {
    protected int hastighed;
    protected double motorstoerrelse;
    protected int hestekraefter;
    public Personvogn(int vaegtafgift, String registreringsnummer) {
        super(vaegtafgift, registreringsnummer);
    }
    public Personvogn(int hastighed, double motorstoerrelse, int hestekraefter) {
        this.hastighed = hastighed;
        this.motorstoerrelse = motorstoerrelse;
        this.hestekraefter = hestekraefter;
    }
    public Personvogn(int vaegtafgift, String registreringsnummer, int hastighed, double motorstoerrelse, int hestekraefter) {
        super(vaegtafgift, registreringsnummer);
        this.hastighed = hastighed;
        this.motorstoerrelse = motorstoerrelse;
        this.hestekraefter = hestekraefter;
    }
    public int getHastighed() {
        return hastighed;
    }
    public void setHastighed(int hastighed) {
        this.hastighed = hastighed;
    }
    public double getMotorstoerrelse() {
        return motorstoerrelse;
    }
    public void setMotorstoerrelse(double motorstoerrelse) {
        this.motorstoerrelse = motorstoerrelse;
    }
    public int getHestekraefter() {
        return hestekraefter;
    }
    public void setHestekraefter(int hestekraefter) {
        this.hestekraefter = hestekraefter;
    }
    public void udskriv(){
        super.udskriv();
        System.out.println("Hastighed: " + hastighed);
        System.out.println("Motorstørrelse: " + motorstoerrelse);
        System.out.println("Antal hestekræfter: " + hestekraefter);
    }
}