package rca.ne.prep.v1.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.paths.RelativePathProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.ServletContext;
import java.time.LocalDate;
import java.util.Date;

@Configuration
@EnableSwagger2
public class SwaggerConfig implements WebMvcConfigurer {

    @Value("${server.host}")
    private String host;
    @Value("${swagger.app_name}")
    private String appName;
    @Value("${swagger.app_description}")
    private String appDescription;
    @Value("${swagger.end_point}")
    private String swaggerEndpoint;
    @Value("${swagger.base_controller_path}")
    private String baseControllerPath;

    @Autowired
    private ServletContext servletContext;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(swaggerEndpoint).addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .directModelSubstitute(LocalDate.class, Date.class)
                .pathProvider(new RelativePathProvider(null) {
                    // Override necessary methods if needed
                })
                .select()
                .apis(RequestHandlerSelectors.basePackage(baseControllerPath))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(appName)
                .description(appDescription)
                .termsOfServiceUrl("http://www.rca.ac.rw/")
                .version("1.0")
                .build();
    }
}