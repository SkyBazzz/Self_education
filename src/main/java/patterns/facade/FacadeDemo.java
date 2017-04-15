package patterns.facade;

import patterns.facade.facadeComputer.Computer;

public class FacadeDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.copy();
    }
}
