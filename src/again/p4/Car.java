package again.p4;

public class Car extends Vehicle{
    private int fuel;
    public Car(String brand, int maxSpeed, int fuel){
        super(brand, maxSpeed);
        this.fuel = fuel;
    }

    @Override
    public void accelerate(int value) {
        if (fuel>0){
            super.accelerate(value);
            fuel--;
        }
    }

    @Override
    public String toString() {
        return getBrand() + " " + getMaxSpeed() +" " + fuel;
    }
}
