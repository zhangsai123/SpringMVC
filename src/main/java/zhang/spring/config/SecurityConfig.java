package zhang.spring.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())// 内存存储用户
                .withUser("zhangsan")// 创建一个用户名
                .password(new BCryptPasswordEncoder().encode("123"))
                .roles("guest")//赋予的角色
                .and()// 连接符
                .withUser("admin")
                .password(new BCryptPasswordEncoder().encode("123"))
                .roles("admin");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .usernameParameter("username")
                .passwordParameter("password")
                .loginPage("/login")
                .loginProcessingUrl("/doLogin")//点击登录时访问的路径
                .defaultSuccessUrl("/success")//登入成功后执行的url
                .and().logout().logoutSuccessUrl("/login")//退出后跳转到首页
                .and().authorizeRequests()
                .antMatchers("/","/login").permitAll()// 不用登陆的路径
                .anyRequest().authenticated()// 其他路径都要认证授权
                .and().httpBasic() //支持basic登陆
                .and().csrf().disable();
    }


    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(
                "/js/**",
                "/css/**",
                "/img/**",
                "/images/**",
                "/fonts/**",
                "/favicon.ico");
    }

}
