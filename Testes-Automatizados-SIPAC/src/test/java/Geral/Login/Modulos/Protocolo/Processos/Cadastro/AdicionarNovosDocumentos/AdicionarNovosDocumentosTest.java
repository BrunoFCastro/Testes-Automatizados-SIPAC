package Geral.Login.Modulos.Protocolo.Processos.Cadastro.AdicionarNovosDocumentos;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Geral.Login.Usuarios.ThiagoCoutinho;


public class AdicionarNovosDocumentosTest
{		
	private AdicionarNovosDocumentosPage adicionarNovosDocumentosPage;
	
	public String usuario = ThiagoCoutinho.getUsuario();
	public String senha = ThiagoCoutinho.getSenha();
	
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
