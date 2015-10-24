package io.restx.sample;

import restx.classloader.Cold;

/**
 * @author fcamblor
 */
@Cold
public enum App {
    INSTANCE;

    private String servletRootRealPath;

    public void setServletRootRealPath(String servletRootRealPath) {
        this.servletRootRealPath = servletRootRealPath;
    }

    public String getServletRootRealPath() {
        return servletRootRealPath;
    }
}
