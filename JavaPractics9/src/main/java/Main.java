import Transports.Tesla;

public class Main {

    public static void main(String[] args) {
        Tesla x1 = new Tesla(4, "Тесла x1", 2, 800,300);

//        x1.startEngine();
//        x1.turnLightsOn();
        x1.chooseChargeStation();
        x1.checkCharge();
    }
}
