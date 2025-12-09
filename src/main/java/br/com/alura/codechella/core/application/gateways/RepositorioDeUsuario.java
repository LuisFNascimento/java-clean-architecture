package br.com.alura.codechella.core.application.gateways;

import br.com.alura.codechella.core.domain.entities.usuario.Usuario;

import java.util.List;

public interface RepositorioDeUsuario {

    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}
