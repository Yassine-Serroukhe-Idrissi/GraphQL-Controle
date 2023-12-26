package org.example.userscontrole.dao.entites;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @Entity @Builder
@AllArgsConstructor @NoArgsConstructor
@ToString @Table(name = "users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_User;
    private String name;
    private String email;
    private String dateNaissance;
    private String password;
}
