package org.example.userscontrole.service.dtos;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor @ToString
public class UserDTO {
    private String name;
    private String email;
    private String dateNaissance;
}
