package com.example.desafio.infra.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "account", schema = "public")
public class Account {

    @Id
    @Column (name = "accountNumber")
    private String accountNumber;

    @Column (name = "bankBalance")
    private String bankBalance;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private User id;
}
