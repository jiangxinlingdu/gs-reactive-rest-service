package hello;

import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("hello")
@EnableConfigurationProperties({ServerProperties.class, ResourceProperties.class})
public class ConfigurationTest {

    @Bean("webHandler")
    public HandlerTest handlerTest(){
        return new HandlerTest();
    }
}
