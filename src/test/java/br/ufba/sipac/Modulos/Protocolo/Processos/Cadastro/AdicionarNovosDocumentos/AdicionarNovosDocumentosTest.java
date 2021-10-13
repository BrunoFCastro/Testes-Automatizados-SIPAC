package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AdicionarNovosDocumentos;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.sipac.Login.Usuarios.UsuarioTestModuloDeProtocolo;


public class AdicionarNovosDocumentosTest
{		
	private AdicionarNovosDocumentosPage adicionarNovosDocumentosPage;
	
	public String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	public String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
	@BeforeEach
	public void beforeEach() 
	{
		this.adicionarNovosDocumentosPage = new AdicionarNovosDocumentosPage();
	}
	
	@AfterEach
	public void afterEach() 
	{
		this.adicionarNovosDocumentosPage.fechar();
	}
	
	@Test
	public void CaminhosFuncionandoCorretamente()
	{
		this.adicionarNovosDocumentosPage.preencherFormularioDeLogin(usuario, senha);
		this.adicionarNovosDocumentosPage.efetuarLogin();
		this.adicionarNovosDocumentosPage.caminho();
		
		Assert.assertTrue(this.adicionarNovosDocumentosPage.isPaginaAtual());
	}
}
