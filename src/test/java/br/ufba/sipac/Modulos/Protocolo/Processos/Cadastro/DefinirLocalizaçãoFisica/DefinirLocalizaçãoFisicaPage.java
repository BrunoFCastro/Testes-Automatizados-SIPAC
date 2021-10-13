package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.DefinirLocaliza��oFisica;

import br.ufba.sipac.PageObject;

public class DefinirLocaliza��oFisicaPage extends PageObject
{
	public DefinirLocaliza��oFisicaPage() 
	{
		super(null);
	}

	public void caminho()
	{
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/index.jsf");
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/menu.jsf");
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/processo/def_localizacao_fisica.jsf");
	}
	
	public boolean isPaginaAtual() 
	{
		return browser.getCurrentUrl().contains("https://treinamentosipac.ufba.br/sipac/protocolo/processo/def_localizacao_fisica.jsf");
	}
}