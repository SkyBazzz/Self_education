package patterns.creational_design_patterns.prototype;

import patterns.creational_design_patterns.prototype.prepapration_data.Human;
import patterns.creational_design_patterns.prototype.prepapration_data.human_factory.HumanFactory;

/**
 * Паттерн прототоип рекомендуется применять в тех случаях, когда необходимо создать объект, являющийся копией самого себя.
 * примером данного использования является реализация интерфейса Cloneable
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        Human original = new Human(19, "Yulia");
        System.out.println(original);
        Human copy = (Human) original.copy();
        System.out.println(copy);
        Human bestHuman = new HumanFactory(original).makeCopy();
        System.out.println(bestHuman);

    }
}
