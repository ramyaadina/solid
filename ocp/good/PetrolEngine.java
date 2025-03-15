interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Starting petrol engine...");
    }
}
