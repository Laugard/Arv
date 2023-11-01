import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Personvogn p1 = new Personvogn(1000, "AB12345", 160, 2.0, 150);
        Lastbil l1 = new Lastbil(2000, "CD67890", 300, 5000);
        Bus b1 = new Bus(1500, "EF45678", 40, 2);

        ArrayList<Koeretoej> tabel = new ArrayList<>();
        tabel.add(p1);
        tabel.add(l1);
        tabel.add(b1);


        for (int i = 0; i < tabel.size(); i++){
            tabel.get(i).udskriv();
        }
    }
}