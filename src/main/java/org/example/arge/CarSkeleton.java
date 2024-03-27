package org.example.arge;

public class CarSkeleton {

    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public void startEngine() {

    }

    protected void runEngine(CarSkeleton carSkeleton) {
        if (carSkeleton instanceof GasPoweredCar) {
            ((GasPoweredCar) carSkeleton).runEngine();
        } else if (carSkeleton instanceof ElectricCar) {
            ((ElectricCar) carSkeleton).runEngine();
        } else if (carSkeleton instanceof HybridCar) {
            ((HybridCar) carSkeleton).runEngine();
        }
    }

    public void drive() {
        runEngine(this);

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
