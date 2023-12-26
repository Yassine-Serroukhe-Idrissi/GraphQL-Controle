package org.example.userscontrole;

import org.example.userscontrole.dao.entites.User;
import org.example.userscontrole.dao.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UsersControleApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsersControleApplication.class, args);
    }

    @Bean
    CommandLineRunner start(UserRepository userRepository){
        return args -> {
            userRepository.save(User.builder().name("Yassine").
                    dateNaissance("04/12/2000").
                    password("Yassine").
                    email("yassine@gmail.com").
                    build());
            userRepository.save(User.builder().name("Asaad").
                    dateNaissance("21/12/2001").
                    password("Asaad").
                    email("asaad@gmail.com").
                    build());
            userRepository.save(User.builder().name("Hind").
                    dateNaissance("27/11/1999").
                    password("Hind").
                    email("hind@gmail.com").
                    build());
            userRepository.save(User.builder().name("Mehdi").
                    dateNaissance("21/10/2001").
                    password("Mehdi").
                    email("mehdi@gmail.com").
                    build());

        };
    }

}
