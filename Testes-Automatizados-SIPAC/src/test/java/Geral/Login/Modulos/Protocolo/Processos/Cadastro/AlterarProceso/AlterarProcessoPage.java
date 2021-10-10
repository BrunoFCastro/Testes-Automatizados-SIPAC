package Geral.Login.Modulos.Protocolo.Processos.Cadastro.AlterarProceso;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Geral.PageObject;

public class AlterarProcessoPage extends PageObject
{
	public AlterarProcessoPage() 
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