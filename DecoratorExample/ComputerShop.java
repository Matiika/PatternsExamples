package org.example.patterns.decorator;

public class ComputerShop {
    public static void main(String[] args) {
        Computer computer = new SimpleComputer();
        System.out.println(computer.getDescription() + " —— " + computer.getCost());

        computer = new CpuDecorator(computer);
        computer = new GpuDecorator(computer);
        computer = new MemoryDecorator(computer);

        System.out.println(computer.getDescription() + " —— " + computer.getCost());
    }
}
