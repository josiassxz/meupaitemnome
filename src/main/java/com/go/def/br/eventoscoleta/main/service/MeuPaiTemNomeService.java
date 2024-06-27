package com.go.def.br.eventoscoleta.main.service;

import com.go.def.br.eventoscoleta.main.dto.MeuPaiTemNomeDTO;
import com.go.def.br.eventoscoleta.main.entity.MeuPaiTemNome;
import com.go.def.br.eventoscoleta.main.entity.Usuario;
import com.go.def.br.eventoscoleta.main.repository.MeuPaiTemNomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeuPaiTemNomeService {

    @Autowired
    private MeuPaiTemNomeRepository meuPaiTemNomeRepository;

    @Autowired
    private UsuarioService usuarioService;

    public MeuPaiTemNome save(MeuPaiTemNomeDTO meuPaiTemNomeDTO) {
        Usuario usuario = usuarioService.findById(meuPaiTemNomeDTO.getUsuarioId());
        if (usuario == null) {
            throw new IllegalArgumentException("Usuário não encontrado com o ID: " + meuPaiTemNomeDTO.getUsuarioId());
        }

        MeuPaiTemNome meuPaiTemNome = new MeuPaiTemNome();
        meuPaiTemNome.setAtendimentos(meuPaiTemNomeDTO.getAtendimentos());
        meuPaiTemNome.setRecPatComDna(meuPaiTemNomeDTO.getRecPatComDna());
        meuPaiTemNome.setRecPatSemDna(meuPaiTemNomeDTO.getRecPatSemDna());
        meuPaiTemNome.setRecPatSocioAfetivaComMulti(meuPaiTemNomeDTO.getRecPatSocioAfetivaComMulti());
        meuPaiTemNome.setRecPatSocioAfetivaSemMulti(meuPaiTemNomeDTO.getRecPatSocioAfetivaSemMulti());
        meuPaiTemNome.setRecMatSocoComMulti(meuPaiTemNomeDTO.getRecMatSocoComMulti());
        meuPaiTemNome.setRecMatSocoSemMulti(meuPaiTemNomeDTO.getRecMatSocoSemMulti());
        meuPaiTemNome.setRecMatPostMortem(meuPaiTemNomeDTO.getRecMatPostMortem());
        meuPaiTemNome.setRecPatPostMortem(meuPaiTemNomeDTO.getRecPatPostMortem());
        meuPaiTemNome.setDnaAgendados(meuPaiTemNomeDTO.getDnaAgendados());
        meuPaiTemNome.setDnaRealizados(meuPaiTemNomeDTO.getDnaRealizados());
        meuPaiTemNome.setDnaPositivos(meuPaiTemNomeDTO.getDnaPositivos());
        meuPaiTemNome.setPedidosHml(meuPaiTemNomeDTO.getPedidosHml());
        meuPaiTemNome.setConstaRegistroGenitor(meuPaiTemNomeDTO.getConstaRegistroGenitor());
        meuPaiTemNome.setNaoConstaRegistroGenitor(meuPaiTemNomeDTO.getNaoConstaRegistroGenitor());
        meuPaiTemNome.setUsuario(usuario);

        return meuPaiTemNomeRepository.save(meuPaiTemNome);
    }
}
