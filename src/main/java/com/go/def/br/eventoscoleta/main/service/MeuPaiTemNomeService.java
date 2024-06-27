package com.go.def.br.eventoscoleta.main.service;


import com.go.def.br.eventoscoleta.main.entity.MeuPaiTemNome;
import com.go.def.br.eventoscoleta.main.repository.MeuPaiTemNomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeuPaiTemNomeService {

    @Autowired
    private MeuPaiTemNomeRepository meuPaiTemNomeRepository;

    public MeuPaiTemNome save(MeuPaiTemNome meuPaiTemNome) {
        return meuPaiTemNomeRepository.save(meuPaiTemNome);
    }
}
