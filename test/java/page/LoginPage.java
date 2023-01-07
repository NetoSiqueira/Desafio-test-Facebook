package page;

import base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
  private final By email =  By.id("email");
  private final By senha  = By.id("pass");
  private final String login = "Entrar";

  private final By telaInicial = By.xpath("//div/div[@aria-label = 'Configurações e controles da conta']//*[@aria-label = 'Seu perfil']");

  private final By mensagemInvalida = By.xpath("//div[@class='_9ay7']");


public void inseriEmail(String dados){
  escreve(email, dados);
}

  public void inserirSenha(String dados){
    escreve(senha, dados);
  }

  public void entrar(){
      clicarBotaoPorTexto(login);
  }

  public void verificaoTelainicial(){
      clicar(telaInicial);
  }


  public String retornarNome(){
  return obterValorPorTexto(By.cssSelector("div[class='x9f619 x1n2onr6 x1ja2u2z x78zum5 xdt5ytf x193iq5w xeuugli" +
          " x1r8uery x1iyjqo2 xs83m0k x150jy0e x1e558r4 xjkvuk6 x1iorvi4'] span[class]"));
  }

  public String verificarMensagemErro(){
  return obterValorPorTexto(mensagemInvalida);
  }
}
