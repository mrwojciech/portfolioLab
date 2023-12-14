package pl.coderslab.charity.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.servlet.http.HttpSession;
import javax.websocket.SessionException;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user@email.com") // Define the username
                .password("{noop}password") // Define the password (Note: {noop} for plain text password, use proper encoding for production)
                .roles("USER"); // Assign roles to the user if needed
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/login").permitAll()
                .antMatchers("/form-confirmation", "/form-confirmation#summary").permitAll()
                .antMatchers("/donations/add").permitAll()
                .antMatchers("/favicon.ico", "/static/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .csrf().disable()
                .formLogin()
                .loginPage("/login")
                .usernameParameter("email")  //login form parameter may be email
                .successHandler((request, response, authentication) -> {
                    String loggedInUser = authentication.getName();
                    HttpSession session = request.getSession();
                    if (session != null) {
                        session.setAttribute("loggedInUser", loggedInUser);
                    }
                    response.sendRedirect("/donations/add"); // Redirect after login
                })
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/donations/add")
                .invalidateHttpSession(true)
                .deleteCookies("JSESSIONID") ;
    }
/*
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println("configureeGlobal");
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser("user@wp.pl")
                .password(passwordEncoder.encode("pass"))
                .roles("USER");
    }*/

}
