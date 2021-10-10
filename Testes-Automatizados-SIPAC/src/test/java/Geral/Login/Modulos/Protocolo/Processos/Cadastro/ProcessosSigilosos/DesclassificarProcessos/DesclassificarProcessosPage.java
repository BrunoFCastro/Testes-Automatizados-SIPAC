package Geral.Login.Modulos.Protocolo.Processos.Cadastro.ProcessosSigilosos.DesclassificarProcessos;

import org.openqa.selenium.By;

import Geral.PageObject;

public class DesclassificarProcessosPage extends PageObject
{
	public DesclassificarProcessosPage() 
	{
		super(null);
	}
	
	public void caminho()
	{
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/index.jsf");
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/menu.jsf");
		this.browser.findElement(By.xpath("//*[@id=\"menuForm:processo-sigilosos-desclassificacao\"]")).click();
	}
	
	public boolean isPaginaAtual() 
	{
		return browser.getCurrentUrl().contains("https://treinamentosipac.ufba.br/sipac/protocolo/menu.jsf");
	}
}