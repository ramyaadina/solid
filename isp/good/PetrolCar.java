public interface Driveable {
    void drive();
}

public interface Refuelable {
    void refuel();
}

public interface Chargeable {
    void chargeBattery();
}

class PetrolCar implements Driveable, Refuelable {
    public void drive() {
        System.out.println("Driving petrol car...");
    }

    public void refuel() {
        System.out.println("Refueling petrol car...");
    }
}
