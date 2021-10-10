package Geral.Login.Modulos.Protocolo.Processos.Cadastro.Diligencia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Geral.PageObject;

public class DiligenciaPage extends PageObject
{
	public DiligenciaPage() 
	{
		super(null);
	}
	
	public void caminho()
	{
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/index.jsf");
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/menu.jsf");
		this.browser.findElement(By.xpath("//*[@id=\"menuForm:processo-diligencia-processo\"]")).click();
	}
	
	public boolean isPaginaAtual() 
	{
		return browser.getCurrentUrl().contains("https://treinamentosipac.ufba.br/sipac/protocolo/menu.jsf");
	}
}