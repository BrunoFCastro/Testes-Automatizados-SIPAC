package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AutuarProcesso;

import org.openqa.selenium.By;

import br.ufba.sipac.PageObject;

public class AutuarProcessoPage extends PageObject
{
	public AutuarProcessoPage() 
	{
		super(null);
	}
	
	public void caminho()
	{
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/index.jsf");
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/menu.jsf");
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/processo/cadastro/abrir_processo_1.jsf");
	}
	
	public boolean isPaginaAtual() 
	{
		return browser.getCurrentUrl().contains("https://treinamentosipac.ufba.br/sipac/protocolo/processo/cadastro/abrir_processo_1.jsf");
	}
}