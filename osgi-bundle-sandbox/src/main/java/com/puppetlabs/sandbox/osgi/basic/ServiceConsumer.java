package com.puppetlabs.sandbox.osgi.basic;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.osgi.service.component.ComponentContext;

@Component
public class ServiceConsumer {
    @Reference
    private HelloWorldService service;

    @Activate
    public void activate(ComponentContext cc) {
        System.out.println(this.service.helloWorld());
    }

    public void bindService(HelloWorldService service) {
        this.service = service;
    }
}
