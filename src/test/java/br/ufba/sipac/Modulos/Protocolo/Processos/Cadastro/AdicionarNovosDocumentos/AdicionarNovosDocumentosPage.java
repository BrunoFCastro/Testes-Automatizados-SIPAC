package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AdicionarNovosDocumentos;

import br.ufba.sipac.PageObject;

public class AdicionarNovosDocumentosPage extends PageObject
{
	public AdicionarNovosDocumentosPage() 
	{
		super(null);
	}
	
	public void caminho()
	{
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/index.jsf");
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/menu.jsf");
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/processo/cadastro/anexa_doc_2.jsf");
	}
	
	public boolean isPaginaAtual() 
	{
		return browser.getCurrentUrl().contains("https://treinamentosipac.ufba.br/sipac/protocolo/processo/cadastro/anexa_doc_2.jsf");
	}
}