package rca.ne.prep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableJpaRepositories
@EnableSwagger2
@ComponentScan("rca.ne.prep.v1")
public class NationalprepApplication {

	public static void main(String[] args) {
		SpringApplication.run(NationalprepApplication.class, args);
	}

}
