package com.go.def.br.eventoscoleta.main.controller;

import com.go.def.br.eventoscoleta.main.dto.MeuPaiTemNomeDTO;
import com.go.def.br.eventoscoleta.main.entity.MeuPaiTemNome;
import com.go.def.br.eventoscoleta.main.service.MeuPaiTemNomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/meupaitemnome", produces = {"application/json"})
public class MeuPaiTemNomeController {

    @Autowired
    private MeuPaiTemNomeService meuPaiTemNomeService;

    private static final Logger log = LoggerFactory.getLogger(MeuPaiTemNomeController.class);

    @PostMapping("/save")
    public ResponseEntity<MeuPaiTemNome> saveEntity(@RequestBody MeuPaiTemNomeDTO meuPaiTemNomeDTO) {
        try {
            log.info("Recebido DTO: " + meuPaiTemNomeDTO);
            MeuPaiTemNome entity = meuPaiTemNomeService.save(meuPaiTemNomeDTO);
            log.info("Salvo Entity: " + entity);
            return ResponseEntity.ok(entity);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }
}
