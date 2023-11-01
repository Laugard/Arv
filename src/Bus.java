class Bus extends Koeretoej {
    protected int antalpassagerer;
    protected int antaldoere;
    public Bus(int vaegtafgift, String registreringsnummer) {
        super(vaegtafgift, registreringsnummer);
    }
    public Bus(int antalpassagerer, int antaldoere) {
        this.antalpassagerer = antalpassagerer;
        this.antaldoere = antaldoere;
    }
    public Bus(int vaegtafgift, String registreringsnummer, int antalpassagerer, int antaldoere) {
        super(vaegtafgift, registreringsnummer);
        this.antalpassagerer = antalpassagerer;
        this.antaldoere = antaldoere;
    }
    public int getAntalpassagerer() {
        return antalpassagerer;
    }
    public void setAntalpassagerer(int antalpassagerer) {
        this.antalpassagerer = antalpassagerer;
    }
    public int getAntaldoere() {
        return antaldoere;
    }
    public void setAntaldoere(int antaldoere) {
        this.antaldoere = antaldoere;
    }
    public void udskriv() {
        super.udskriv();
        System.out.println("Antal passagerer: " + antalpassagerer);
        System.out.println("Antal døre: " + antaldoere);
    }
}