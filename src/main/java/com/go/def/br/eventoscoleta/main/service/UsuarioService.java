package com.go.def.br.eventoscoleta.main.service;


import com.go.def.br.eventoscoleta.main.entity.Usuario;
import com.go.def.br.eventoscoleta.main.enums.Uf;
import com.go.def.br.eventoscoleta.main.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario findByEmail(String email) {
        return usuarioRepository.findByEmailContaining(email);
    }

    public Usuario findByNome(String nome) {
        return usuarioRepository.findByNomeContaining(nome);
    }


    public Usuario findByEmailAndSenha(String email, String senha, Uf uf) {
        Usuario usuario = usuarioRepository.findByEmailAndSenha(email, senha);
        if (usuario != null) {
            Usuario user = new Usuario();
            user.setId(usuario.getId());
            user.setEmail(usuario.getEmail());
            user.setNome(usuario.getNome());
            user.setUf(usuario.getUf());
            return user;
        } else {
            return null;
        }
    }

}