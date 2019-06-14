package patterns.creational_design_patterns.abstract_factory.factories;

import patterns.creational_design_patterns.abstract_factory.buttons.Button;
import patterns.creational_design_patterns.abstract_factory.buttons.WindowsButton;
import patterns.creational_design_patterns.abstract_factory.checkboxes.Checkbox;
import patterns.creational_design_patterns.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
