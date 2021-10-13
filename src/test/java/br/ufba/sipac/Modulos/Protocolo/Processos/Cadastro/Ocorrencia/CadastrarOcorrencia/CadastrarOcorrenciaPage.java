package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.Ocorrencia.CadastrarOcorrencia;

import org.openqa.selenium.By;

import br.ufba.sipac.PageObject;

public class CadastrarOcorrenciaPage  extends PageObject
{
	public CadastrarOcorrenciaPage() 
	{
		super(null);
	}

	public void caminho()
	{
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/index.jsf");
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/menu.jsf");
		this.browser.findElement(By.xpath("//*[@id=\"menuForm:processos-alterar-ocorrencia\"]")).click();
	}
	
	public boolean isPaginaAtual() 
	{
		return browser.getCurrentUrl().contains("https://treinamentosipac.ufba.br/sipac/protocolo/menu.jsf");
	}
}