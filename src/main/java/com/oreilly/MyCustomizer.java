package com.oreilly;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class MyCustomizer{

	@Bean
	public EmbeddedServletContainerFactory factory(){

		TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory(  );

		factory.setContextPath( "/app3" );

		return factory;
	}
}
/*
@Component
public class MyCustomizer implements EmbeddedServletContainerCustomizer{

	@Override
	public void customize( ConfigurableEmbeddedServletContainer configurable ) {

		configurable.setContextPath( "/app2" );
	}
}
*/
