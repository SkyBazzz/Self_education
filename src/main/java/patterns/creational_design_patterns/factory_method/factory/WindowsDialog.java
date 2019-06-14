package patterns.creational_design_patterns.factory_method.factory;

import patterns.creational_design_patterns.factory_method.button.WindowsButton;
import patterns.creational_design_patterns.factory_method.button.Button;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
