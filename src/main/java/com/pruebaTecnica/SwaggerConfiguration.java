/**
 * 
 */
package com.pruebaTecnica;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author fobregon
 *
 */

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	
	/**
     * Publicar un bean para generar endpoints swagger2
     * @return a swagger configuration bean
     */
    @Bean
    public Docket usersApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(usersApiInfo())
                .select()
                .paths(PathSelectors.regex("/v1/usuario/ms.*"))
                .apis(RequestHandlerSelectors.any())
                .build()
                .useDefaultResponseMessages(false);
    }


    /**
     * Api info
     * @return ApiInfo
     */
    private ApiInfo usersApiInfo() {
        return new ApiInfoBuilder()
                .title("Persona Entity Service")
                .contact(new Contact("Iguana Digital", "https://www.iguanadigital.com/", "api@iguanadigital.com.ec"))
                .description("API REST para dar matenimiento a la entidad Persona")
                .version("2.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.gnu.org/licenses/gpl-3.0.html")
                .build();

    }

}
