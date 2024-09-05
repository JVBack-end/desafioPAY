package com.example.desafio.app.restcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferRestController {

    @PostMapping("/transfer")
    public ResponseEntity transfer() {
        return ResponseEntity.ok().body("Transfer criado com sucesso!");
    }


}
