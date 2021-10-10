package Geral.Login.Modulos.Protocolo.Processos.Cadastro.Ocorrencia.AlterarOcorrencia;

import org.openqa.selenium.By;

import Geral.PageObject;

public class AlterarOcorrenciaPage  extends PageObject
{
	public AlterarOcorrenciaPage() 
	{
		super(null);
	}
	
	public void caminho()
	{
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/index.jsf");
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/menu.jsf");
		this.browser.findElement(By.xpath("//*[@id=\"menuForm:processos-cadastrar-ocorrencia\"]")).click();
	}
	
	public boolean isPaginaAtual() 
	{
		return browser.getCurrentUrl().contains("https://treinamentosipac.ufba.br/sipac/protocolo/menu.jsf");
	}
}