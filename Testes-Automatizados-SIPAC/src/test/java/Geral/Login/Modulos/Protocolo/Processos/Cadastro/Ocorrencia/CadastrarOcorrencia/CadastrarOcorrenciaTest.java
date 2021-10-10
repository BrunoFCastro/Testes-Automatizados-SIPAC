package Geral.Login.Modulos.Protocolo.Processos.Cadastro.Ocorrencia.CadastrarOcorrencia;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Geral.Login.Usuarios.ThiagoCoutinho;

public class CadastrarOcorrenciaTest 
{
	private CadastrarOcorrenciaPage cadastrarOcorrencia;
	
	public String usuario = ThiagoCoutinho.getUsuario();
	public String senha = ThiagoCoutinho.getSenha();
	
	@BeforeEach
	public void beforeEach() 
	{
		this.cadastrarOcorrencia = new CadastrarOcorrenciaPage();
	}
	
	@AfterEach
	public void afterEach() 
	{
		this.cadastrarOcorrencia.fechar();
	}
	
	@Test
	public void CaminhosFuncionandoCorretamente()
	{
		this.cadastrarOcorrencia.preencherFormularioDeLogin(usuario, senha);
		this.cadastrarOcorrencia.efetuarLogin();
		this.cadastrarOcorrencia.caminho();
		
		Assert.assertTrue(this.cadastrarOcorrencia.isPaginaAtual());
	}
}