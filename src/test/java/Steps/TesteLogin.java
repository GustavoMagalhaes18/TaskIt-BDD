package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TesteLogin {

    WebDriver robo;

    @Before
    public void abrirNavegador(){

        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver1\\chromedriver.exe");
        robo = new ChromeDriver();
        robo.get("http://www.juliodelima.com.br/taskit/");

    }

    @After
    public void quit(){

        robo.quit();

    }

    @Dado("que o usuario esta no site TaskIt e clica no botao Sign in")
    public void que_o_usuario_esta_no_site_task_it_e_clica_no_botao_sign_in() {

        robo.findElement(By.xpath("//a[@data-target='signinbox']")).click();

    }

    @Quando("ele preenche os campos {string} e {string} com dados validos")
    public void ele_preenche_os_campos_e_com_dados_validos(String login, String senha) {

        robo.findElement(By.xpath("//input[@placeholder='Please, tell us your login']")).sendKeys(login);
        robo.findElement(By.xpath("//input[@placeholder='Excuse me, can you tell us a secret?']")).sendKeys(senha);

    }

    @Quando("clcia no botao SIGN IN")
    public void clcia_no_botao_sign_in() {

        robo.findElement(By.id("btn-submit-sign-in")).click();

    }

    @Entao("o usuario deve ver o {string}")
    public void o_usuario_deve_ver_o(String resultado) {

        robo.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assertions.assertEquals(resultado, robo.findElement(By.className("me")).getText());

    }

}
