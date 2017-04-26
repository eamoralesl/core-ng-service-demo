package app.core.demo.webservice;

import core.framework.api.web.service.GET;
import core.framework.api.web.service.Path;

/**
 * @author emorales
 */
public interface DemoWebService {
    @GET
    @Path("/publish")
    void publish();
}
