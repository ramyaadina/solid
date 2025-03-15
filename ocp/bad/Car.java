class Car {
    public void startEngine(String type) {
        if (type.equals("Petrol")) {
            System.out.println("Starting petrol engine...");
        } else if (type.equals("Electric")) {
            System.out.println("Starting electric engine...");
        }
    }
}
