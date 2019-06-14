package patterns.creational_design_patterns.abstract_factory.factories;

import patterns.creational_design_patterns.abstract_factory.buttons.Button;
import patterns.creational_design_patterns.abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
