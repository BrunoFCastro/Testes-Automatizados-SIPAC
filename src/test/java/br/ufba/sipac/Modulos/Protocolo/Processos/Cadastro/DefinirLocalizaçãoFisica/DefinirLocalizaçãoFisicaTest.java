package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.DefinirLocalizaçãoFisica;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.sipac.Login.Usuarios.UsuarioTestModuloDeProtocolo;

public class DefinirLocalizaçãoFisicaTest 
{
	private DefinirLocalizaçãoFisicaPage definirLocalizaçãoFisica;
	
	public String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	public String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
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
