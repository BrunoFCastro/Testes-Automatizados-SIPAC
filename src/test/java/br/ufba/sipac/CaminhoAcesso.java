package br.ufba.sipac.Modulos;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.ufba.sipac.Login.Usuarios.UsuarioAcesso;

public class CaminhoAcesso {
	protected WebDriver driver;
	private Duration time = Duration.ofSeconds(20);
	
	public	void Acesso(){
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://acesso.ufba.br:65443/remote/login?lang=en");
		driver.manage().window().maximize();
	    WebDriverWait wait = new WebDriverWait(driver,time);
	    String abaInicial = driver.getWindowHandle();
		driver.findElement(By.id("username")).sendKeys(UsuarioAcesso.getUsuarioAcesso());
        driver.findElement(By.id("credential")).sendKeys(UsuarioAcesso.getSenhaAcesso());
        driver.findElement(By.id("login_button")).click();
        wait.until(ExpectedConditions.urlMatches("https://acesso.ufba.br:65443/sslvpn/portal.html#/"));
        driver.findElement(By.xpath("//*[@id=\"navbar-view-section\"]/div/div/div[4]/div[2]/button[1]")).click();
        driver.findElement(By.id("url")).sendKeys("https://teste2sipac.ufba.br/");
        driver.findElement(By.xpath("//*[@id=\'navbar-view-section\']/div/div/div[2]/form/div[2]/button[1]")).click();
        Set<String>	abas = driver.getWindowHandles();
        for(String	aba:	abas){
			if(!aba.equals(abaInicial)){
				driver.switchTo().window(aba);
			}
        }
        driver.findElement(By.className("acesso_centro_bg")).click();
        driver.findElement(By.name("login")).sendKeys(UsuarioAcesso.getUsuarioSipac());
        driver.findElement(By.name("senha")).sendKeys(UsuarioAcesso.getSenhaSipac());
        driver.findElement(By.xpath("//*[@id='conteudo']/div[3]/form/table/tfoot/tr/td/input")).click();
	}
	
	public void fechar() 
	{
		driver.quit();
	}
	
	public void sair(){
		//driver.quit();
	}

}
