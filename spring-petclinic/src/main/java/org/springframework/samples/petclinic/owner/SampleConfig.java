package org.springframework.samples.petclinic.owner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Park Sangwon
 * 2018. 7. 26.
 */
@Configuration
public class SampleConfig {

    @Bean
    public String sangwon() {
        return "sangwon";
    }
}
