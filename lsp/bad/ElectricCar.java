class ElectricCar extends Car {
    @Override
    void refuel() {
        throw new UnsupportedOperationException("Electric cars don't use fuel!");
    }
}
