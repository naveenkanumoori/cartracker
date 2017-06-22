package com.naveen.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by naveenkumar on 6/17/17.
 */
public class Servletinitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // TODO Auto-generated method stub
        return new Class[]{WebConfig.class,JPAConfig.class, SwaggerConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        // TODO Auto-generated method stub
        //return new String[]{"/swagger-ui.html","/vehicles/*","/readings","/readings/alerts"};
        return new String[]{"/*"};

    }
}
