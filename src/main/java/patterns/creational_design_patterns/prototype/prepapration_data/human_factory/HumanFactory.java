package patterns.creational_design_patterns.prototype.prepapration_data.human_factory;

import patterns.creational_design_patterns.prototype.prepapration_data.Human;

public class HumanFactory {
    Human human;

    public HumanFactory(Human human) {
        setPrototype(human);
    }

    private void setPrototype(Human human) {
        this.human = human;
    }

    public Human makeCopy(){
        return (Human) human.copy();
    }


}
