public class Auto extends Fahrzeug {
    private int seatCount;

    public Auto(int seaCount, int geschwindigkeit){
        //Konstruktor der Oberklasse aufrufen
        super(geschwindigkeit);
        this.seatCount = seaCount;
        System.out.println("Konstruktor aus Auto");
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seaCount) {
        this.seatCount = seaCount;
    }
}
