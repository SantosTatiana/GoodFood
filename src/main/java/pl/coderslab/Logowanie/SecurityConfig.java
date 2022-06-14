package pl.coderslab.Logowanie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation
        .web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import pl.coderslab.Logowanie.SpringDataUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public SpringDataUserDetailsService customUserDetailsService() {
        return new SpringDataUserDetailsService();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//
//        @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/login/**", "/registration/**", "/contact").permitAll()
//                .antMatchers("/app/**").hasAnyAuthority("USER")
//                .and().formLogin()
//                .loginPage("/login/user")
//                .defaultSuccessUrl("/app")
//                .and().logout().logoutSuccessUrl("/")
//                .permitAll();
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/app/**").hasAnyRole("USER","ADMIN")
//                .and().formLogin()
//                .loginPage("/login/user")
//                .defaultSuccessUrl("/");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers("/login/user").permitAll()
//                .antMatchers("/register/user").permitAll()
//                .antMatchers("/app","app/**").hasAnyRole("USER")
//                .and().formLogin().loginPage("/login/user")
//                .and().logout().logoutSuccessUrl("/").permitAll()
//                .and().exceptionHandling().accessDeniedPage("/403");
////                .defaultSuccessUrl("/app");
//    }


//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers("/login/user").permitAll()
//                .antMatchers("/register/user").permitAll()
//                .antMatchers("/app/**").hasRole("USER")
//                .and().formLogin().permitAll();
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers("/login/user").permitAll()
//                .antMatchers("/register/user").permitAll()
//                .antMatchers("/app/**").hasRole("USER")
//                .and().formLogin().loginPage("/login/user")
//                .defaultSuccessUrl("/app");
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin/**").hasAnyRole("USER","ADMIN")
                .and().formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/app/recipes");
    }




}
