package rca.ne.prep.v1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable().cors().configurationSource(request -> {
                    CorsConfiguration cors = new CorsConfiguration();
                    cors.addAllowedOrigin("*");
                    cors.addAllowedMethod("*");
                    cors.addAllowedHeader("*");
                    return cors;
                }).and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST,"/api/user/register").permitAll()
                .antMatchers("/api/products").permitAll()
                .antMatchers("/api/purchase").permitAll()
                .antMatchers("/api/purchaseItems").permitAll()
                .antMatchers("/api/cart").permitAll()
                .antMatchers("/api/cartItems").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().permitAll()
                .and()
                .logout().permitAll();

    }


}

