package com.puppetlabs.sandbox.osgi.basic;

//import org.apache.felix.scr.annotations.Activate;
//import org.apache.felix.scr.annotations.Component;
//import org.apache.felix.scr.annotations.Reference;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class ServiceConsumer {
//    @Reference
    private HelloWorldService service;

    @Activate
    public void activate(ComponentContext cc) {
        System.out.println(this.service.helloWorld());
    }

    @Reference
    protected void bindHelloWorldService(HelloWorldService service) {
        this.service = service;
    }

    protected void unbindHelloWorldService(final HelloWorldService service) {
        this.service = null;
    }
}
