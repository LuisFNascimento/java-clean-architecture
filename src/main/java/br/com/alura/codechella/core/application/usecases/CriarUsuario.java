package br.com.alura.codechella.core.application.usecases;


import br.com.alura.codechella.core.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.core.domain.entities.usuario.Usuario;

public class CriarUsuario {

    private final RepositorioDeUsuario repositorio;

    public CriarUsuario(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        return repositorio.cadastrarUsuario(usuario);
    }
}
