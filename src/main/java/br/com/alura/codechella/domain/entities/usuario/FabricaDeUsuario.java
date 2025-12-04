package br.com.alura.codechella.domain.entities.usuario;

import br.com.alura.codechella.domain.Address;

import java.time.LocalDate;

public class FabricaDeUsuario {
    
    private Usuario usuario;
    
    public Usuario comNomeCpfNascimento(String nome, String cpf, LocalDate nascimento) {
        this.usuario = new Usuario(cpf, nome, nascimento, "");
        return this.usuario;
    }
    
    private Usuario incluiEndereco(String cep, Integer numero, String complemento) {
        this.usuario.setAddress(new Address(cep, numero, complemento));
        return this.usuario;
    }

}
