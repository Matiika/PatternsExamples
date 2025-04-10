package org.example.patterns.decorator;

public class GpuDecorator extends ComputerDecorator {

    public GpuDecorator(Computer computer) {
        super(computer);
    }

    @Override
    public double getCost() {
        return decoratedComputer.getCost() + 200;
    }

    @Override
    public String getDescription() {
        return decoratedComputer.getDescription() + ", Видеокарта";
    }
}
