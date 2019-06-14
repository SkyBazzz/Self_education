package patterns.creational_design_patterns.factory_method;

import patterns.creational_design_patterns.factory_method.factory.HtmlDialog;
import patterns.creational_design_patterns.factory_method.factory.WindowsDialog;
import patterns.creational_design_patterns.factory_method.factory.Dialog;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
