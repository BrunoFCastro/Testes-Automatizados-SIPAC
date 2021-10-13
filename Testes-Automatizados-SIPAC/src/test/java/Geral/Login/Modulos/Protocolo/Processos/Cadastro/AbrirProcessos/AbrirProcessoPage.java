package Geral.Login.Modulos.Protocolo.Processos.Cadastro.AbrirProcessos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

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
	public boolean mensagemDeInteressadoAdicionadoComEroPorFaltaDeDadosDoEmail() 
	{
		return browser.getPageSource().contains("E-mail: Campo obrigatório não informado.");
	}
	
	public void preencherFormularioAbrirProcessosComTodosOsDadosCorretos()
	{	
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:classificacaoConarq\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:classificacaoConarq\"]")).sendKeys("MODERNIZAÇÃO E REFORMA ADMINISTRATIVA PROJETOS, ESTUDOS E NORMAS"); //001 - MODERNIZAÇÃO E REFORMA ADMINISTRATIVA PROJETOS, ESTUDOS E NORMAS
		try
        {
            Thread.sleep(700);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:classificacaoConarq\"]")).sendKeys(Keys.DOWN);
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:classificacaoConarq\"]")).sendKeys(Keys.ENTER);
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:natureza\"]")).sendKeys(Keys.DOWN);
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:natureza\"]")).sendKeys(Keys.ENTER);
		
		try
        {
            Thread.sleep(700);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:assunto\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:assunto\"]")).sendKeys("test");
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:natureza\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:natureza\"]")).sendKeys(Keys.DOWN);
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:natureza\"]")).sendKeys(Keys.ENTER);
		
		try
        {
            Thread.sleep(700);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:hipoteseLegalRestrito\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:hipoteseLegalRestrito\"]")).sendKeys(Keys.DOWN);
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:hipoteseLegalRestrito\"]")).sendKeys(Keys.ENTER);
		
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


	public void submeterFormularioAbrirProcessos() 
	{
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tfoot/tr/td/input[2]")).click();
	}

	public void adicionarServidorInteressado()
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
	public void adicionarServidorInteressadoComFaltaDeDadosDoServidor() 
	{
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).sendKeys("elieide.orrico!!@ufba.br");
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tfoot/tr/td/input")).click();
	}
	public void adicionarServidorInteressadoComFaltaDeDadosDoEmail() 
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
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).sendKeys("");
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tfoot/tr/td/input")).click();
	}
	
	public void adicionarAlunoInteressado()
	{
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).sendKeys(Keys.DOWN);
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).sendKeys(Keys.ENTER);
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).sendKeys("elieide.orrico!!@ufba.br");
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:nomeAluno\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:nomeAluno\"]")).sendKeys("ELIEIDE SANTOS ORRICO"); //ELIEIDE SANTOS ORRICO (212215251)
		try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:nomeAluno\"]")).sendKeys(Keys.ENTER);
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
	public void adicionarAlunoInteressadoComFaltaDeDadosDoServidor() 
	{
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).sendKeys("elieide.orrico!!@ufba.br");
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tfoot/tr/td/input")).click();
	}
	public void adicionarAlunoInteressadoComFaltaDeDadosDoEmail() 
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
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).sendKeys("");
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tfoot/tr/td/input")).click();
	}

	public void adicionarCredorInteressado()
	{
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).sendKeys(Keys.DOWN);
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).sendKeys(Keys.DOWN);
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).sendKeys(Keys.ENTER);
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:notificarInteressado:1\"]")).click();
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:nomeCredor\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:nomeCredor\"]")).sendKeys("ASSEMBLÉIA LEGISLATIVA DO ESTADO DA BAHIA"); //ASSEMBLÉIA LEGISLATIVA DO ESTADO DA BAHIA
		try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:nomeCredor\"]")).sendKeys(Keys.ENTER);
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
	public void adicionarCredorInteressadoComFaltaDeDadosDoServidor() 
	{
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).sendKeys("elieide.orrico!!@ufba.br");
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tfoot/tr/td/input")).click();
	}
	
	public void adicionarUnidadeInteressado()
	{		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).sendKeys(Keys.DOWN);
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).sendKeys(Keys.DOWN);
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).sendKeys(Keys.DOWN);
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).sendKeys(Keys.ENTER);
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).sendKeys("sti!!@ufba.br");
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:unidade\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:unidade\"]")).sendKeys("SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA"); 
		try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:unidade\"]")).sendKeys(Keys.ENTER);
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
	public void adicionarUnidadeInteressadoComFaltaDeDadosDoServidor() 
	{
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).sendKeys("sti!!@ufba.br");
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tfoot/tr/td/input")).click();
	}
	public void adicionarUnidadeInteressadoComFaltaDeDadosDoEmail() 
	{	
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:nomeServidorInteressado\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:nomeServidorInteressado\"]")).sendKeys("SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA"); //ELIEIDE SANTOS ORRICO (1574037)
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
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).sendKeys("");
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tfoot/tr/td/input")).click();
	}
	
	public void adicionarOutrosInteressado()
	{
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).sendKeys(Keys.DOWN);
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).sendKeys(Keys.DOWN);
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).sendKeys(Keys.DOWN);
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).sendKeys(Keys.DOWN);
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/select")).sendKeys(Keys.ENTER);
		
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
	public void adicionarOutrosInteressadoComFaltaDeDadosDoServidor() 
	{
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).sendKeys("elieide.orrico!!@ufba.br");
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tfoot/tr/td/input")).click();
	}
	public void adicionarOutrosInteressadoComFaltaDeDadosDoEmail() 
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
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).click();
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:email\"]")).sendKeys("");
		
		browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm\"]/table/tbody/tr[2]/td/table/tfoot/tr/td/input")).click();
	}
	
	public String getNomeInteressadoLogado() 
	{
		try 
		{
			return browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:j_id_jsp_1137659535_169:0:j_id_jsp_1137659535_185\"]")).getText(); //ELIEIDE SANTOS ORRICO
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}
	public String getEmailInteressadoLogado() 
	{
		try 
		{
			return browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:j_id_jsp_1137659535_169:0:j_id_jsp_1137659535_187\"]")).getText(); //elieide.orrico!!@ufba.br
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}
	public String getTipoInteressadoLogado() 
	{
		try 
		{
			return browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:j_id_jsp_1137659535_169:0:j_id_jsp_1137659535_190\"]")).getText(); //Servidor
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}
	public String getIdentificadorInteressadoLogado() 
	{
		try 
		{
			return browser.findElement(By.xpath("//*[@id=\"dadosGeraisForm:j_id_jsp_1137659535_169:0:j_id_jsp_1137659535_182\"]")).getText(); //1574037
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}
}















