public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto(4,120);
        System.out.println("Sitze: "+auto.getSeatCount()+"\n"
        + "Geschwindigkeit: " +auto.getGeschwindigkeit());
    }
}
