package io.restx.sample.servlet; /**
 * @author fcamblor
 */

import io.restx.sample.App;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class ContainerListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        App.INSTANCE.setServletRootRealPath(sce.getServletContext().getRealPath("/"));
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
