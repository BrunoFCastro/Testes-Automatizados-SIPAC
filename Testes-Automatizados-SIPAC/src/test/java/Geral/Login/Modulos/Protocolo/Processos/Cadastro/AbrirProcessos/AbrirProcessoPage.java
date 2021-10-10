package Geral.Login.Modulos.Protocolo.Processos.Cadastro.AbrirProcessos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import Geral.PageObject;

public class AbrirProcessoPage extends PageObject
{
	public AbrirProcessoPage() 
	{
		super(null);
	}
	
	public void caminho()
	{
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/index.jsf");
		this.browser.navigate().to("https://treinamentosipac.ufba.br/sipac/protocolo/menu.jsf");
		browser.findElement(By.xpath("//*[@id=\"menuForm:processo-movimentacao-abrirProc\"]")).click();
	}

	public boolean isPaginaAtual() 
	{
		return browser.getCurrentUrl().contains(URL_LOGIN);
	}
	public boolean mensagemDeInteressadoAdicionadoComSucesso() 
	{
		return browser.getPageSource().contains("Interessado adicionado com sucesso.");
	}
	public boolean mensagemDeInteressadoAdicionadoComErooPorFaltaDeDadosDoServidor() 
	{
		return browser.getPageSource().contains("Servidor: Campo obrigatório não informado.");
	}
	public boolean mensagemDeInteressadoAdicionadoComErooPorFaltaDeDadosDoEmail() 
	{
		return browser.getPageSource().contains("E-mail: Campo obrigatório não informado.");
	}
	
	public void preencherFormularioAbrirProcessosComTodosOsDadosCorretos()
	{	
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:classificacaoConarq\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:classificacaoConarq\"]")).sendKeys("MODERNIZAÇÃO E REFORMA ADMINISTRATIVA PROJETOS, ESTUDOS E NORMAS"); //001 - MODERNIZAÇÃO E REFORMA ADMINISTRATIVA PROJETOS, ESTUDOS E NORMAS
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:natureza\"]")).sendKeys(Keys.DOWN);
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:natureza\"]")).sendKeys(Keys.ENTER);
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:assunto\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:assunto\"]")).sendKeys("test");
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:natureza\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:natureza\"]")).sendKeys(Keys.DOWN);
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:natureza\"]")).sendKeys(Keys.ENTER);
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:observacao\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:observacao\"]")).sendKeys("test");
	}
	public void adicionarInteressado()
	{
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).sendKeys("elieide.orrico!!@ufba.br");
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:nomeServidorInteressado\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:nomeServidorInteressado\"]")).sendKeys("ELIEIDE SANTOS ORRICO"); //ELIEIDE SANTOS ORRICO (1574037)
		try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:nomeServidorInteressado\"]")).sendKeys(Keys.ENTER);
		try
        {
            Thread.sleep(700);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tfoot/tr/td/input")).click();
	}
	public void adicionarInteressadoComFaltaDeDadosDoServidor() 
	{
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).sendKeys("elieide.orrico!!@ufba.br");
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tfoot/tr/td/input")).click();
	}
	public void adicionarInteressadoComFaltaDeDadosDoEmail() 
	{	
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:nomeServidorInteressado\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:nomeServidorInteressado\"]")).sendKeys("ELIEIDE SANTOS ORRICO"); //ELIEIDE SANTOS ORRICO (1574037)
		try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:nomeServidorInteressado\"]")).sendKeys(Keys.ENTER);
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tfoot/tr/td/input")).click();
	}

	public void submeterFormularioAbrirProcessos() 
	{
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tfoot/tr/td/input[2]")).click();
	}
}















