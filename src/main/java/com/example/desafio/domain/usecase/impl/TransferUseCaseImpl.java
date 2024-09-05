package com.example.desafio.domain.usecase.impl;

import com.example.desafio.domain.dto.request.TransferDtoRequest;
import com.example.desafio.domain.usecase.TransferUseCase;
import com.example.desafio.infra.enumeration.TypeEnum;
import com.example.desafio.infra.model.User;
import com.example.desafio.infra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransferUseCaseImpl implements TransferUseCase {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String transfer(TransferDtoRequest transferDtoRequest) throws Exception {
        Optional<User> payer = userRepository.findById(transferDtoRequest.getPayer());

        if (payer.isEmpty()) {
            throw new Exception("ERROR: Pagador não encontrado!");
        } else if (TypeEnum.LOJISTA.getType().equals(payer.get().getType())) {
            throw new Exception("ERROR: Lojista não pode realizar transferência!!");
        }

        return null;
    }

}
