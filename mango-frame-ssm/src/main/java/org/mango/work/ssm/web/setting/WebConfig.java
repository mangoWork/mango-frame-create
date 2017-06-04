package org.mango.work.ssm.web.setting;

import org.mango.work.ssm.web.utils.PropertiesUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

	private PropertiesUtil propertiesUtil = null;

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//			registry.addResourceHandler("**/webjar/jquery/").addResourceLocations("classpath:/META-INF/resources/webjars/jquery/3.0.0/")
//					.resourceChain(false)
//					.addResolver(new WebJarsResourceResolver())
//					.addResolver(new PathResourceResolver());

	}
}