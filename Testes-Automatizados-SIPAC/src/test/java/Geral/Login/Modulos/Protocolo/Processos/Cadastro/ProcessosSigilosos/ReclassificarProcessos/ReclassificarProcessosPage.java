package Geral.Login.Modulos.Protocolo.Processos.Cadastro.ProcessosSigilosos.ReclassificarProcessos;

import org.openqa.selenium.By;

import Geral.PageObject;

public class ReclassificarProcessosPage extends PageObject
{
	public ReclassificarProcessosPage() 
	{
		super(null);
	}

	public void caminho()
	{
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/index.jsf");
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/menu.jsf");
		this.browser.findElement(By.xpath("//*[@id=\"menuForm:processo-sigilosos-reclassificacao\"]")).click();
	}

	public boolean isPaginaAtual() 
	{
		return browser.getCurrentUrl().contains("https://treinamentosipac.ufba.br/sipac/protocolo/menu.jsf");
	}
}