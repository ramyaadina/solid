class Car {
    private Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    void startCar() {
        engine.start();
    }
}
