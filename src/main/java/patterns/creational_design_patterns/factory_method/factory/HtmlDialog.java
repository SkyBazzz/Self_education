package patterns.creational_design_patterns.factory_method.factory;

import patterns.creational_design_patterns.factory_method.button.HtmlButton;
import patterns.creational_design_patterns.factory_method.button.Button;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
