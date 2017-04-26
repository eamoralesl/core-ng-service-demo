package app.core.demo;

import app.core.demo.queue.TestMessage;
import app.core.demo.queue.TestMessageHandler;
import app.core.demo.service.ServiceDemo;
import app.core.demo.web.DemoWebServiceImpl;
import app.core.demo.webservice.DemoWebService;
import core.framework.api.Module;

/**
 * @author emorales
 */
public class ModuleDemo extends Module {
    @Override
    protected void initialize() {
        queues();
        services();
        webservices();
    }

    private void webservices() {
        api().service(DemoWebService.class, bind(DemoWebServiceImpl.class));
    }

    private void services() {
        bind(ServiceDemo.class);
    }

    private void queues() {
        kafka().maxPoll(1, 3 * 1024 * 1024);
        kafka().subscribe("test-topic", TestMessage.class, bind(TestMessageHandler.class));
        kafka().publish("test-topic", TestMessage.class);
    }
}
