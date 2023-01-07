package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import page.LoginPage;

public class LoginSteps  {
    //TODO PRECISO SER COLOCADO EMAIL VALIDO E SENHA NO METODO QUE TESTA LOGIN DO SUCESSO
    private LoginPage page = new LoginPage();

    @Dado("que insere um login valido")
    public void que_insere_um_login_valido() {
        page.inseriEmail("emailficticio@gmail.com");
        page.inserirSenha("teste123456");
    }
    @Dado("efetua o login")
    public void efetua_o_login() {
        page.entrar();
    }
    @Entao("verifico a tela inicial")
    public void verifico_a_tela_inicial() {
        page.verificaoTelainicial();
        Assert.assertEquals("Siqueira Neto", page.retornarNome());
    }


    @Dado("que insere um email invalido")
    public void que_insere_um_email_invalido() {
        page.inseriEmail("Emailinvalido@email.com.br");
        page.inserirSenha("emailinvalido");
    }
    @Entao("verifico a tela de erro email invalido")
    public void verifico_a_tela_de_mensagem_de_erro() {
       Assert.assertEquals("O email que você inseriu não está conectado " +
               "a uma conta. Encontre sua conta e entre.", page.verificarMensagemErro());
    }


    @Dado("que insere uma senha invalida")
    public void que_insere_uma_senha_invalida() {
        page.inseriEmail("emailficticio@gmail.com");
        page.inserirSenha("senhainvalida");
    }

    @Entao("verifico a tela de erro senha invalida")
    public void verifico_a_tela_de_erro_senha_invalida() {
      Assert.assertEquals("A senha inserida está incorreta. Esqueceu a senha?", page.verificarMensagemErro());
    }


}
