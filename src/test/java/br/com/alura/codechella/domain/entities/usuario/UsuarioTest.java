package br.com.alura.codechella.domain.entities.usuario;

import br.com.alura.codechella.domain.entities.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {
    @Test
    public void naoDeveCadastrarUsuarioComCpfInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("123456789-00", "João Silva", LocalDate.parse("1990-08-07"), "email@email.com"));
    }
}