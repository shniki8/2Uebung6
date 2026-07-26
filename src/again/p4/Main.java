package again.p4;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("", 100, 10);
        Bike b = new Bike("", 40, true);
        c.accelerate(120);
        System.out.println(c.getCurrentSpeed());
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = c;
        vehicles[1] = b;
        for (Vehicle v : vehicles){
            if (v instanceof Bike){
                ((Bike) v).ringBell();
            } else if (v instanceof Car) {
                ((Car) v).accelerate(10);
            }
        }
    }
}
