package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.core.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.core.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.persistence.UsuarioRepository;

import java.util.List;

public class RepositorioDeUsuarioJpa implements RepositorioDeUsuario {

    private final UsuarioRepository repository;

    public RepositorioDeUsuarioJpa(UsuarioRepository repository) {
        this.repository = repository;
    }
    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public List<Usuario> listarTodos() {
        return repository.findAll();
    }
}
