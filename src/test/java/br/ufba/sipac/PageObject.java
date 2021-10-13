package br.ufba.sipac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObject 
{
	protected static final String URL_LOGIN = "https://treinamentosipac.ufba.br/sipac/";

	protected WebDriver browser;
	
	public PageObject(WebDriver browser)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		if (browser == null) 
		{
            this.browser = new ChromeDriver();
            this.browser.navigate().to(URL_LOGIN);
        } 
		else 
		{
            this.browser = browser;
            this.browser.navigate().to(URL_LOGIN);
        }
	}
	
	public void fechar() 
	{
		this.browser.quit();
	}
	
	public void preencherFormularioDeLogin(String username, String password)
	{
		this.browser.findElement(By.name("login")).sendKeys(username);
        this.browser.findElement(By.name("senha")).sendKeys(password);
	}
	public void efetuarLogin() 
	{
		this.browser.findElement(By.xpath("//*[@id=\"conteudo\"]/div[3]/form/table/tbody/tr[1]/td/input")).submit();
	}
	
	/*public String RetornaUsuario()
	{
		String usuario;
		return usuario = ThiagoCoutinho.getUsuario();
	}
	public String RettornaSenha ()
	{
		String senha;
		return senha = ThiagoCoutinho.getSenha();
	}*/
}
