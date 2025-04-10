package org.example.patterns.decorator;

public class CpuDecorator extends ComputerDecorator{

    public CpuDecorator(Computer computer) {
        super(computer);
    }

    @Override
    public double getCost() {
        return decoratedComputer.getCost() + 100;
    }

    @Override
    public String getDescription() {
        return decoratedComputer.getDescription() + ", Процессор";
    }
}
