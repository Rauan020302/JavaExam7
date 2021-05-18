package itacademy.task2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
             .authorizeRequests()
                .antMatchers("/role").hasRole("ADMIN")
             //.antMatchers(HttpMethod.POST, "/student").hasRole("ADMIN")
             .antMatchers(HttpMethod.DELETE,"/student").hasRole("ADMIN")
             .antMatchers(HttpMethod.GET,"/student").permitAll()
             .antMatchers(HttpMethod.GET, "/student/find").permitAll()
             //.antMatchers(HttpMethod.POST,"/course").hasRole("ADMIN")
                .and().httpBasic().and().logout().and().formLogin();
    }

}
