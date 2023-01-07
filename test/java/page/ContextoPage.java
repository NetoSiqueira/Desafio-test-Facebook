package page;

import base.BasePage;
import core.Propriedades;
import org.openqa.selenium.By;

import static core.Propriedades.paginaInicial;

public class ContextoPage extends BasePage {

public String verificaoPaginaInicial(){
  return   obterValorPorTexto(By.xpath("//h2[.='"+paginaInicial +"']"));
}

}
