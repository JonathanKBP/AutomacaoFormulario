package tests;

import static org.junit.Assert.*;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import pages.TreinamentoPage;
import suports.Web;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "UserTest.csv")
public class UserTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome(); //Executar quando o teste for local
    }

    @Test
    public void testCreateUser(
        @Param(name="name")String name,
        @Param(name="lastName")String lastName,
        @Param(name="email")String email,
        @Param(name="address")String address,
        @Param(name="universidade")String universidade,
        @Param(name="profile")String profile,
        @Param(name="gende")String gende,
        @Param(name="age")String age,
        @Param(name="mensagemEsperada")String mensagemEsperada
    ){
        String textotoast = new TreinamentoPage(navegador)
                .clicarComeçarAutomaçãoWeb()
                .clickFormulario()
                .clickCriarUsuario()
                .createUser(name, lastName, email, address, universidade, profile, gende, age)
                .capturarTextoNotice();

        assertEquals(mensagemEsperada, textotoast);

    }
    @After
    public void tearDown() {
        navegador.quit();
    }
}
