package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AlterarResponsavel;

import org.openqa.selenium.By;

import br.ufba.sipac.PageObject;

public class AlterarResponsavelPage extends PageObject
{
	public AlterarResponsavelPage() 
	{
		super(null);
	}
	
	public void caminho()
	{
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/index.jsf");
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/menu.jsf");
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/processo/cadastro/altera_responsavel_1.jsf");
	}

	public boolean isPaginaAtual() 
	{
		return browser.getCurrentUrl().contains("https://treinamentosipac.ufba.br/sipac/protocolo/processo/cadastro/altera_responsavel_1.jsf");
	}
}