package org.example.patterns.decorator;

public class MemoryDecorator extends ComputerDecorator{

    public MemoryDecorator(Computer computer) {
        super(computer);
    }

    @Override
    public double getCost() {
        return decoratedComputer.getCost() + 100;
    }

    @Override
    public String getDescription() {
        return decoratedComputer.getDescription() + ", Память";
    }

}
