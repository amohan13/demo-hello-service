package com.demo.services.demohelloservice;

import java.io.FileReader;
import java.io.IOException;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
/*@EnableCircuitBreaker
@EnableHystrixDashboard*/
@SpringBootApplication
@EnableDiscoveryClient
public class DemoHelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoHelloServiceApplication.class, args);
	}
	
	@Bean
    public Docket api() throws IOException, XmlPullParserException {
    /*  MavenXpp3Reader reader = new MavenXpp3Reader();
       Model model = reader.read(new FileReader("pom.xml"));
       return new Docket(DocumentationType.SWAGGER_2)  
               .select()
               .apis(RequestHandlerSelectors.basePackage("com.demo.demo.zuul"))
               .paths(PathSelectors.any())                          
               .build().apiInfo(new ApiInfo("Product Service Api Documentation", "Documentation automatically generated", model.getParent().getVersion(), null, new Contact("vishruty mittal", null, "vishruty@gmail.com"), null, null));
    */
       return new Docket(DocumentationType.SWAGGER_2); 
       



		//return new Docket(DocumentationType.SWAGGER_2) ;
    }
}
