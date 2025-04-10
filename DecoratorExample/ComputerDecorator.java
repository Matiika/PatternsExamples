package org.example.patterns.decorator;

public abstract class ComputerDecorator implements Computer {
    protected Computer decoratedComputer;

    public ComputerDecorator(Computer computer) {
        this.decoratedComputer = computer;
    }

    @Override
    public String getDescription() {
        return decoratedComputer.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedComputer.getCost();
    }
}
