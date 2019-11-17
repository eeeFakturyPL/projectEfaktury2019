package pl.project.Faktury2019.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private PasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/")
                .hasAnyAuthority("ROLE_USER","ROLE_ADMIN")
                .antMatchers("/index/*")
                .hasAnyAuthority("ROLE_USER","ROLE_ADMIN")
                .antMatchers("/index*")
                .hasAnyAuthority("ROLE_USER","ROLE_ADMIN")
                .antMatchers("/users*")
                .hasAnyAuthority("ROLE_USER","ROLE_ADMIN")
                .antMatchers("/rejestracja*")
                .hasAnyAuthority("ROLE_USER","ROLE_ADMIN")
                .anyRequest().permitAll()
                .and()
                .csrf().disable()
                .headers().frameOptions().disable()
                .and()
                .formLogin()
                .loginPage("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .loginProcessingUrl("/login-process")
                .defaultSuccessUrl("/index")
                .and()
                .logout().logoutSuccessUrl("/login");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("password")
                .roles("USER")
                .and()
                .withUser("admin")
                .password("password")
                .roles("ADMIN");

        auth.jdbcAuthentication()
                .usersByUsernameQuery("select u.login, u.password, 1 from login_user u where u.login=?")
                .authoritiesByUsernameQuery("select u.login, u.role, 1 from login_user u where u.login=?")
                .dataSource(jdbcTemplate.getDataSource())
                .passwordEncoder(bCryptPasswordEncoder);
    }

}

