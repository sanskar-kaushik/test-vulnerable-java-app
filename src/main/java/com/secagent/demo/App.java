package com.secagent.demo;

import org.apache.commons.text.StringEscapeUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class);

    private App() {}

    public static String escapeHtml(String value) {
        return StringEscapeUtils.escapeHtml4(value);
    }

    public static void main(String[] args) {
        LOGGER.info("SecAgent Java Maven test app started");
        System.out.println(escapeHtml("Hello <Java> & SecAgent"));
    }
}
