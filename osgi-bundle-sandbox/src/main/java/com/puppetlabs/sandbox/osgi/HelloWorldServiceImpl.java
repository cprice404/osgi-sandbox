package com.puppetlabs.sandbox.osgi;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.ConfigurationPolicy;
import org.apache.felix.scr.annotations.Service;

import java.util.Map;

@Component(policy = ConfigurationPolicy.REQUIRE)
@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String helloWorld() {
        return "hello world!";
    }

    @Activate
    public void activate(Map config) {
        System.out.println("HWSI activated!");
        System.out.println("config: '" + config + "'");
    }
}
