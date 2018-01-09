package patterns.creational_design_patterns.abstract_factory.factories;

import patterns.creational_design_patterns.abstract_factory.buttons.Button;
import patterns.creational_design_patterns.abstract_factory.buttons.MacOSButton;
import patterns.creational_design_patterns.abstract_factory.checkboxes.Checkbox;
import patterns.creational_design_patterns.abstract_factory.checkboxes.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
