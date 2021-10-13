package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AlterarResponsavel;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.sipac.Login.Usuarios.UsuarioTestModuloDeProtocolo;

public class AlterarResponsavelTest 
{
	private AlterarResponsavelPage alterarResponsavelPage;
	
	public String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	public String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
	@BeforeEach
	public void beforeEach() 
	{
		this.alterarResponsavelPage = new AlterarResponsavelPage();
	}
	
	@AfterEach
	public void afterEach() 
	{
		this.alterarResponsavelPage.fechar();
	}
	
	@Test
	public void CaminhosFuncionandoCorretamente()
	{
		this.alterarResponsavelPage.preencherFormularioDeLogin(usuario, senha);
		this.alterarResponsavelPage.efetuarLogin();
		this.alterarResponsavelPage.caminho();
		
		Assert.assertTrue(this.alterarResponsavelPage.isPaginaAtual());
	}
}