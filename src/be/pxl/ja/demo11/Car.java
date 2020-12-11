package be.pxl.ja.demo11;

public class Car {
    private Engine engine;
    private String fuel;

    public Car(String fuel) {
        engine = new Engine(fuel);
        this.fuel = fuel;
    }

    public void start(){
        engine.start();
    }
    public static class Engine{
        private String fuel;

        public Engine(String fuel) {
            this.fuel = fuel;
        }

        public void start(){
            System.out.println(" de motor is gestart en het soort brandstof " + fuel);
        }
    }
}
