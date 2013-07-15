package com.puppetlabs.sandbox.osgi.basic;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.ConfigurationPolicy;
import org.apache.felix.scr.annotations.Service;
import org.osgi.service.component.ComponentContext;

import java.util.Map;

//@Component(policy = ConfigurationPolicy.REQUIRE)
@Component
@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String helloWorld() {
        return "hello world!";
    }


    @Activate
//    public void activate(Map config) {
    public void activate() {
        System.out.println("HWSI activated!");
//        System.out.println("config: '" + config + "'");
    }
}
