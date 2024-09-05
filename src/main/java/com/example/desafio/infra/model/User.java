package com.example.desafio.infra.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table (name = "user", schema = "public")
public class User {

    @Id
    @Column (name = "document")
    private String document;

    @Max(250)
    @Column (name = "name")
    private String name;

    @Email
    @Column (name = "email")
    private String email;

    @Min(8)
    @Max(20)
    @Column (name = "password")
    private String password;

    @Column (name = "type")
    private String type;

    @Column (name = "account")
    @OneToOne
    private Account account;

}
