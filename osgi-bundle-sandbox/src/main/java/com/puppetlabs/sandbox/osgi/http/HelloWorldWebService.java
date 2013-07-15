package com.puppetlabs.sandbox.osgi.http;

import org.apache.felix.scr.annotations.*;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component(immediate = true)
@Service(value = Servlet.class)
@Properties({
        @Property(name = "alias", value = "/hello2")
})
public class HelloWorldWebService extends HttpServlet {

//    @Reference
//    private HttpService httpService;

    public void HelloWorldWebService() {
        System.out.println("HELLO WORLD WEB SERVICE: INITIALIZING");
    }

    @Activate
    public void activate() {
        System.out.println("HWWS activated!");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getWriter().write("Hello World");
    }
//
//    protected void bindHttpService(HttpService service) throws ServletException, NamespaceException {
//        System.out.println("BINDING HTTP SERVICE");
//        this.httpService = service;
//
//
//        this.httpService.registerServlet("/hello",
//                this, null, null);
//    }
//
//    protected void unbindHttpService(HttpService service) {
//        System.out.println("UNBINDING HTTP SERVICE");
//        service.unregister("/hello");
//        this.httpService = null;
//    }
}
