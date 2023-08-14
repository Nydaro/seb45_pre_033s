package preproject.spring.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .antMatcher("/h2/**")
                .authorizeRequests()
                .anyRequest().permitAll()
                .and()
                .headers().frameOptions().disable()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();

        return http.build();

    }
}
