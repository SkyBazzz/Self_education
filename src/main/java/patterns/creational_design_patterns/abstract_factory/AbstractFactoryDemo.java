package patterns.creational_design_patterns.abstract_factory;

import patterns.creational_design_patterns.abstract_factory.app.Application;
import patterns.creational_design_patterns.abstract_factory.factories.GUIFactory;
import patterns.creational_design_patterns.abstract_factory.factories.MacOSFactory;
import patterns.creational_design_patterns.abstract_factory.factories.WindowsFactory;

public class AbstractFactoryDemo {

       private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
