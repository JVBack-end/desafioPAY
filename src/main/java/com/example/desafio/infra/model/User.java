package com.example.desafio.infra.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    private long id;

    @Column (name = "document")
    private String document;

    @Column (name = "name")
    private String name;

    @Email
    @Column (name = "email")
    private String email;

    @Column (name = "password")
    private String password;

    @Column (name = "type")
    private String type;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account", referencedColumnName = "accountNumber")
    private Account account;

}
