package com.example.userservice.security;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.security.ConditionalOnDefaultWebSecurity;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
import org.springframework.boot.web.servlet.context.WebApplicationContextServletContextAwareProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.token.TokenService;
import org.springframework.security.web.SecurityFilterChain;

/**
 * https://velog.io/@pjh612/Deprecated%EB%90%9C-
 * WebSecurityConfigurerAdapter-%EC%96%B4%EB%96%BB%EA%B2%8C-
 * %EB%8C%80%EC%B2%98%ED%95%98%EC%A7%80
 */

@Configuration
@EnableWebSecurity
public class WebSecurity{
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.authorizeRequests().antMatchers("/user/**").permitAll();
//        http.headers().frameOptions().disable();
//    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws
            Exception{
        http.csrf().disable()
                .authorizeRequests().antMatchers("/user/**").permitAll();
        http.headers().frameOptions().disable();

        return http.build();
    }

}
