package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.RegistrarDadosDoProcesso;

import org.openqa.selenium.By;

import br.ufba.sipac.PageObject;

public class RegistrarDadosDoProcessoPage extends PageObject
{
	public RegistrarDadosDoProcessoPage() 
	{
		super(null);
	}

	public void caminho()
	{
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/index.jsf");
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/menu.jsf");
		this.browser.findElement(By.xpath("//*[@id=\"menuForm:processo-registrar-dados\"]")).click();
	}
	
	public boolean isPaginaAtual() 
	{
		return browser.getCurrentUrl().contains("https://treinamentosipac.ufba.br/sipac/protocolo/menu.jsf");
	}
}