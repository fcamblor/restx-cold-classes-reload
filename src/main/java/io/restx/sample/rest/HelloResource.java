package io.restx.sample.rest;

import io.restx.sample.App;
import restx.annotations.GET;
import restx.annotations.RestxResource;
import restx.factory.Component;
import restx.security.PermitAll;

@Component @RestxResource
public class HelloResource {

    @GET("/servletRootRealPath")
    @PermitAll
    public String retrieveServletRootRealPath() {
        return App.INSTANCE.getServletRootRealPath()!=null?App.INSTANCE.getServletRootRealPath():"null path";
    }
}
