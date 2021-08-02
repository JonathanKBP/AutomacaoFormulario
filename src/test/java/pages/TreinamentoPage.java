package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TreinamentoPage extends BasePage{
    public TreinamentoPage(WebDriver navegador) {
        super(navegador);
    }

    public TreinamentoHomePage clicarComeçarAutomaçãoWeb(){
        navegador.findElement(By.linkText("COMEÇAR AUTOMAÇÃO WEB")).click();

        return new TreinamentoHomePage(navegador);
    }
}
