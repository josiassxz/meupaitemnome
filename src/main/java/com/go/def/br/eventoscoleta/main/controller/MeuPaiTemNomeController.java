package com.go.def.br.eventoscoleta.main.controller;

import com.go.def.br.eventoscoleta.main.entity.MeuPaiTemNome;
import com.go.def.br.eventoscoleta.main.service.MeuPaiTemNomeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("")

@RequestMapping(value = "/meupaitemnome", produces = {"application/json"})
//@Tag(description = "Meu pai tem nome")
public class MeuPaiTemNomeController {

    @Autowired
    private MeuPaiTemNomeService meuPaiTemNomeService;

    @PostMapping("/save")
    public ResponseEntity<MeuPaiTemNome> saveEntity(@RequestBody MeuPaiTemNome meuPaiTemNome) {
        MeuPaiTemNome entity = meuPaiTemNomeService.save(meuPaiTemNome);
        return ResponseEntity.ok(entity);
    }
}
