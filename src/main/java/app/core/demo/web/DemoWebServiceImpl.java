package app.core.demo.web;

import app.core.demo.service.ServiceDemo;
import app.core.demo.webservice.DemoWebService;

import javax.inject.Inject;

/**
 * @author emorales
 */
public class DemoWebServiceImpl implements DemoWebService {
    @Inject
    ServiceDemo serviceDemo;

    @Override
    public void publish() {
        serviceDemo.publish();
    }
}
