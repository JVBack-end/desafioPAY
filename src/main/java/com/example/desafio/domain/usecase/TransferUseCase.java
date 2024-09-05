package com.example.desafio.domain.usecase;

import com.example.desafio.domain.dto.request.TransferDtoRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public interface TransferUseCase {
    public String transfer (@Valid TransferDtoRequest transferDtoRequest) throws Exception;
}
