package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.DefinirLocaliza��oFisica;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.sipac.Login.Usuarios.UsuarioTestModuloDeProtocolo;

public class DefinirLocaliza��oFisicaTest 
{
	private DefinirLocaliza��oFisicaPage definirLocaliza��oFisica;
	
	public String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	public String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
	@BeforeEach
	public void beforeEach() 
	{
		this.definirLocaliza��oFisica = new DefinirLocaliza��oFisicaPage();
	}
	
	@AfterEach
	public void afterEach() 
	{
		this.definirLocaliza��oFisica.fechar();
	}
	
	@Test
	public void CaminhosFuncionandoCorretamente()
	{
		this.definirLocaliza��oFisica.preencherFormularioDeLogin(usuario, senha);
		this.definirLocaliza��oFisica.efetuarLogin();
		this.definirLocaliza��oFisica.caminho();
		
		Assert.assertTrue(this.definirLocaliza��oFisica.isPaginaAtual());
	}
}
