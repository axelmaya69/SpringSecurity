package securityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/index").permitAll() // Permitir acceso público a /index
                        .anyRequest().authenticated()         // Proteger las demás rutas
                )
                .formLogin(login -> login.permitAll());    // Habilitar formulario de inicio de sesión
   
        return http.build();
    }
    }

}