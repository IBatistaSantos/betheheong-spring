package br.com.bethehero.bethehero.application.config;


import br.com.bethehero.bethehero.adapter.idGenerator.UUIDGenerator;
import br.com.bethehero.bethehero.adapter.passwordEncoder.DigestUtilsPasswordEncoder;
import br.com.bethehero.bethehero.usecase.ong.port.IdGenerator;
import br.com.bethehero.bethehero.usecase.ong.port.PasswordEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return  new DigestUtilsPasswordEncoder();
    }

    @Bean
    public IdGenerator idGenerator() {
        return new UUIDGenerator();
    }

}
