package com.go.def.br.eventoscoleta.main.repository;

import com.go.def.br.eventoscoleta.main.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>, JpaSpecificationExecutor<Usuario> {


    Usuario findByEmailAndSenha(String email, String senha);

    Usuario findByEmailContaining(String email);

    Usuario findByNomeContaining(String nome);
}
