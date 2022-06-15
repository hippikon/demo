package de.riverserene.intellij.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@org.springframework.context.annotation.Configuration
public class ApplicationSecurity extends WebSecurityConfigurerAdapter {

//	@Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/").hasAnyRole("USER")
//                .antMatchers("/h2-console/**").hasAnyRole("USER").and().cors().disable()
//        		.csrf().disable();
//        http.csrf().disable();
//        http.headers().frameOptions().sameOrigin();
//    }

	@Override
	public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/h2-console/**","/webjars/**");
    }
	   
  @Autowired
  public void initialize(AuthenticationManagerBuilder builder, DataSource dataSource) throws Exception {
    builder.jdbcAuthentication().dataSource(dataSource).withUser("dave")
      .password("{noop}secret").roles("USER");
  }

}