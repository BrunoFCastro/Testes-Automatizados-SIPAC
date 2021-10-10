package Geral.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import Geral.PageObject;

public class LoginPage extends PageObject
{
	public LoginPage() 
	{
		super(null);
	}

	public String getNomeUsuarioLogado() 
	{
		try 
		{
			return browser.findElement(By.xpath("//*[@id=\"info-usuario\"]/p[2]")).getText();
		} 
		catch (NoSuchElementException e) 
		{
			return null;
		}
	}

	public boolean isPaginaAtual() 
	{
		return browser.getCurrentUrl().contains(URL_LOGIN);
	}

	public boolean isMensagemDeLoginInvalidoVisivel() 
	{
		return browser.getPageSource().contains("Usu�rio e/ou senha inv�lidos");
	}
}