package pl.project.Faktury2019.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SpringConfig {

    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }
}
