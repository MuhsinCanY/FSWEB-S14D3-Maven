package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return this.getName() + super.startEngine();
    }

    @Override
    public String accelerate() {
        return this.getName() + super.accelerate();
    }

    @Override
    public String brake() {
        return this.getName() + super.brake();
    }
}
