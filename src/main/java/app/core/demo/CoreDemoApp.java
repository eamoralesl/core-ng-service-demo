package app.core.demo;


import core.framework.api.App;
import core.framework.api.module.SystemModule;

/**
 * @author emorales
 */
public class CoreDemoApp extends App {
    @Override
    protected void initialize() {
        load(new SystemModule("sys.properties"));
        loadProperties("app.properties");
        load(new ModuleDemo());
    }
}
