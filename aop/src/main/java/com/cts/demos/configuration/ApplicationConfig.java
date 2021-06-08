package com.cts.demos.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration // Configuration class
@EnableAspectJAutoProxy // Let us enable auto proxy 
@ComponentScan("com.cts.demos")
public class ApplicationConfig {

}
