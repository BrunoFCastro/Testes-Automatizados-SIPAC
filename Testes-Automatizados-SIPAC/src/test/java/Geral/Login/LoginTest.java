package Geral.Login;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import Geral.Login.Usuarios.ThiagoCoutinho;

public class LoginTest 
{
	private LoginPage paginaDeLogin;
	
	public String usuario = ThiagoCoutinho.getUsuario();
	public String senha = ThiagoCoutinho.getSenha();

	@BeforeEach
	public void beforeEach() 
	{
		this.paginaDeLogin = new LoginPage();
	}

	@AfterEach
	public void afterEach() 
	{
		this.paginaDeLogin.fechar();
	}
	
	@Test
	public void DeveEfetuarLoginCorretamenteComDadosValidos() 
	{
		paginaDeLogin.preencherFormularioDeLogin(usuario, senha);
		paginaDeLogin.efetuarLogin();

		String nomeUsuarioLogado = paginaDeLogin.getNomeUsuarioLogado();
		Assert.assertEquals("THIAGO COUTINHO SOUSA SILVA", nomeUsuarioLogado);
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
	}
	
	
}
