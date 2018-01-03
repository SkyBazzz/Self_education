package patterns.facade;

import patterns.facade.preparation_data.facade_computer.Computer;

public class FacadeDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.copy();
    }
}
