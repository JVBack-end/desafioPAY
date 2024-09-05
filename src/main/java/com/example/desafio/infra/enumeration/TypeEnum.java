package com.example.desafio.infra.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeEnum {

    COMUM("F"),
    LOJISTA("J");

    public final String type;

}
