package com.springBootCSV.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.PageableHandlerMethodArgumentResolverCustomizer;

//
//import java.util.List;
//
//import org.springframework.context.annotation.Bean;
//
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Contact;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.servers.Server;
//
@Configuration
public class SwaggerConfig {
//
//	  @Bean
//		OpenAPI defineOpenApi() {
//			 
//		       Server server = new Server();
//		       server.setUrl("http://localhost:8080");
//		       server.setDescription("Development");
//
//		       Contact myContact = new Contact();
//		       myContact.setName("CSV formatting");
//		       myContact.setEmail("csv.email@gmail.com");
//
//		       Info information = new Info()
//		               .title("Csv formatting ")
//		               .version("1.0")
//		               .description("This API exposes endpoints to manage csv file.")
//		               .contact(myContact);
//		       return new OpenAPI().info(information).servers(List.of(server));
//		   }
	
	
	@Bean
	 PageableHandlerMethodArgumentResolverCustomizer paginationCustomizer() {
	  return (pageableResolver -> {
	     pageableResolver.setOneIndexedParameters(true); //default is false, starts with 0
	  });
	}
	
}
