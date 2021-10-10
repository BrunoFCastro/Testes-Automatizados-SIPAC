package Geral.Login.Modulos.Protocolo.Processos.Cadastro.AlterarResponsavel;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Geral.Login.Usuarios.ThiagoCoutinho;

public class AlterarResponsavelTest 
{
	private AlterarResponsavelPage alterarResponsavelPage;
	
	public String usuario = ThiagoCoutinho.getUsuario();
	public String senha = ThiagoCoutinho.getSenha();
	
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