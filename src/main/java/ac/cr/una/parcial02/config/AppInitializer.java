package ac.cr.una.parcial02.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppRootConfig.class,
                AppSecurityConfig.class, AppThreadPoolTaskSchedulerConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppWebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
