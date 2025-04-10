package org.example.patterns.decorator;

public class SimpleComputer implements Computer{

    @Override
    public String getDescription() {
        return "Корпус";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
