package Geral.Login.Modulos.Protocolo.Processos.Cadastro.DefinirLocalizaçãoFisica;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Geral.Login.Usuarios.ThiagoCoutinho;

public class DefinirLocalizaçãoFisicaTest 
{
	private DefinirLocalizaçãoFisicaPage definirLocalizaçãoFisica;
	
	public String usuario = ThiagoCoutinho.getUsuario();
	public String senha = ThiagoCoutinho.getSenha();
	
	@BeforeEach
	public void beforeEach() 
	{
		this.definirLocalizaçãoFisica = new DefinirLocalizaçãoFisicaPage();
	}
	
	@AfterEach
	public void afterEach() 
	{
		this.definirLocalizaçãoFisica.fechar();
	}
	
	@Test
	public void CaminhosFuncionandoCorretamente()
	{
		this.definirLocalizaçãoFisica.preencherFormularioDeLogin(usuario, senha);
		this.definirLocalizaçãoFisica.efetuarLogin();
		this.definirLocalizaçãoFisica.caminho();
		
		Assert.assertTrue(this.definirLocalizaçãoFisica.isPaginaAtual());
	}
}
