package ru.avakyants.java.bball.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class BballServer {
    public static void main(String[] args) {
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        Server jettyServer = new Server(8181);
        jettyServer.setHandler(context);

        ServletHolder jerseyServlet  = context.addServlet(org.glassfish.jersey.servlet.ServletContainer.class,"/*");
        jerseyServlet.setInitOrder(0);

        jerseyServlet.setInitParameter("jersey.config.server.provider.packages","ru.avakyants.java.bball.restapi");
        jerseyServlet.setInitParameter("com.sun.jersey.api.json.POJOMappingFeature","true");

        try{
            jettyServer.start();
            jettyServer.join();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            jettyServer.destroy();
        }

    }
}
