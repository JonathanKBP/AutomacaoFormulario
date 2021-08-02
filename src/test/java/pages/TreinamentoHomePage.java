package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TreinamentoHomePage extends BasePage {
    public TreinamentoHomePage(WebDriver navegador) {
        super(navegador);
    }

    public TreinamentoHomePage clickFormulario(){
        navegador.findElement(By.linkText("Formulário")).click();

        return this;
    }

    public NewUserPage clickCriarUsuario(){
        navegador.findElement(By.linkText("Criar Usuários")).click();

        return new NewUserPage(navegador);
    }
}
