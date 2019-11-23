package com.ssu.config;

import org.springframework.lang.Nullable;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

//public class MvcConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
//    @Nullable
//    protected Class<?>[] getRootConfigClasses() {
//        return new Class[]{Configuration.class};
//    }
//
//    @Nullable
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class[0];
//    }
//
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//}

public class MvcConfig implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
        context.register(Configuration.class);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);

        ServletRegistration.Dynamic servlet=servletContext.addServlet("dispatcher",dispatcherServlet);
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);

    }
}
