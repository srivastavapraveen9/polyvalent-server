package com.org.polyvalent.application.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	 @Override
	    protected Class<?>[] getRootConfigClasses() {
	        return new Class[] { MvcConfig.class, SwaggerConfig.class };
	    }

	    @Override
	    protected Class<?>[] getServletConfigClasses() {
	        return null;
	    }

	    @Override
	    protected String[] getServletMappings() {
	        return new String[] { "/product.*" };
	    }
}
