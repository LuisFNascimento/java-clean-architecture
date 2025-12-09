package br.com.alura.codechella.domain.entities.usuario;

import br.com.alura.codechella.core.domain.entities.usuario.FabricaDeUsuario;
import br.com.alura.codechella.core.domain.entities.usuario.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {
    @Test
    public void naoDeveCadastrarUsuarioComCpfInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("123456789-00", "João Silva", LocalDate.parse("1990-08-07"), "email@email.com"));

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("12345678900", "João Silva", LocalDate.parse("1990-08-07"), "email@email.com"));

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("", "João Silva", LocalDate.parse("1990-08-07"), "email@email.com"));

    }

    @Test
    public void deveCriarUsuarioUsandoFabricaDeUsuario() {
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCpfNascimento("Maria Souza", "987.654.321-00", LocalDate.parse("1985-05-15"));

        Assertions.assertEquals("Maria Souza", usuario.getNome());
        Assertions.assertEquals("987.654.321-00", usuario.getCpf());
        Assertions.assertEquals(LocalDate.parse("1985-05-15"), usuario.getNascimento());
    }
    @Test
    public void naoDeveCadastrarUsuarioMenorDeIdade() {
        LocalDate dataNascimento = LocalDate.now().minusYears(17);

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("123.456.789-00", "Ana Pereira", LocalDate.parse("1979-10-05"), "fulano@gmail.com"));
    }
}