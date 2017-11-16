package com.cloud.disk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

/**
 * it is negligible because spring-boot has configured
 */
@Configuration
public class ThymeleafConfig {
    @Bean
    public TemplateResolver springThymeleafTemplateResolver() {
        SpringResourceTemplateResolver resolver =new SpringResourceTemplateResolver();
        resolver.setPrefix("classpath:/templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML5");
        return resolver;
    }
}
