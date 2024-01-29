package rca.ne.prep.v1.configuration;

import jakarta.servlet.ServletContext;
import lombok.Value;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.paths.RelativePathProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
import java.util.Date;

@EnableSwagger2
public class SwaggerConfig {
    public final ServletContext servletContext;
    @Value("${server.host}")
    private String host;

    @Value("${swagger.app_name}")
    private String appName;

    @Value("${swagger.app_description}")
    private String appDescription;

    @Value("    ${swagger.end_point}")
    private String swaggerEndpoint;

    @Value("${swagger.base_controller_path}")
    private String baseControllerPath;

    public SwaggerConfig(ServletContext servletContext) {

        this.servletContext = servletContext;
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).directModelSubstitute(LocalDate.class, Date.class)
                .pathProvider(new RelativePathProvider(servletContext) {
                }).select().apis(RequestHandlerSelectors.basePackage(baseControllerPath))
                .paths(PathSelectors.any()).build().apiInfo(apiInfo());
    }
}
