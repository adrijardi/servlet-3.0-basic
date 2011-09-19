/*
 * Copyright 2010 Oracle and/or its affiliates.
 * All rights reserved.  You may not modify, use,
 * reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://developer.sun.com/berkeley_license.html
 */


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mood.web;

import java.util.logging.Logger;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


/**
 * Web application lifecycle listener.
 * @author ian
 */
@WebListener()
public class SimpleServletListener implements ServletContextListener,
    ServletContextAttributeListener {
    static Logger log = Logger.getLogger("mood.web.SimpleServletListener");

    public void contextInitialized(ServletContextEvent sce) {
        log.info("Context initiallized");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        log.info("Context destroyed");
    }

    public void attributeAdded(ServletContextAttributeEvent event) {
        log.info(
                "Attribute " + event.getName()
                + " has been added, with value: " + event.getValue());
    }

    public void attributeRemoved(ServletContextAttributeEvent event) {
        log.info("Attribute " + event.getName() + " has been removed");
    }

    public void attributeReplaced(ServletContextAttributeEvent event) {
        log.info(
                "Attribute " + event.getName()
                + " has been replaced, with value: " + event.getValue());
    }
}
