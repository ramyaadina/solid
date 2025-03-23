interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Starting petrol engine...");
    }
}

class ElectricEngine implements Engine {
    public void start() {
        System.out.println("Starting electric engine...");
    }
}

class Car {
    private Engine engine;

    Car(Engine engine) { // Dependency Injection
        this.engine = engine;
    }

    void startCar() {
        engine.start();
    }
}

// Usage
Car petrolCar = new Car(new PetrolEngine());
Car electricCar = new Car(new ElectricEngine());

petrolCar.startCar();
electricCar.startCar();
