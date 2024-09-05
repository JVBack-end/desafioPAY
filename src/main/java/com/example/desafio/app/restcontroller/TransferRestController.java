package com.example.desafio.app.restcontroller;

import com.example.desafio.domain.dto.request.TransferDtoRequest;
import com.example.desafio.domain.usecase.TransferUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferRestController {

    @Autowired
    private TransferUseCase transferUseCase;

    @PostMapping("/transfer")
    public ResponseEntity transfer(@RequestBody TransferDtoRequest transferDtoRequest) throws Exception {
        return ResponseEntity.ok().body(transferUseCase.transfer(transferDtoRequest));
    }


}
