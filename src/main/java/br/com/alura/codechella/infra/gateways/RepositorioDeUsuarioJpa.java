package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.core.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.core.domain.entities.usuario.Usuario;

import java.util.List;

public class RepositorioDeUsuarioJpa implements RepositorioDeUsuario {

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public List<Usuario> listarTodos() {
        return List.of();
    }
}
