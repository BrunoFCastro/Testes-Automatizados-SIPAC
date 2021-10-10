package Geral.Login.Modulos.Protocolo.Processos.Cadastro.Ocorrencia.AlterarOcorrencia;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Geral.Login.Usuarios.ThiagoCoutinho;

public class AlterarOcorrenciaTest 
{
	private AlterarOcorrenciaPage alterarOcorrencia;
	
	public String usuario = ThiagoCoutinho.getUsuario();
	public String senha = ThiagoCoutinho.getSenha();
	
	@BeforeEach
	public void beforeEach() 
	{
		this.alterarOcorrencia = new AlterarOcorrenciaPage();
	}
	
	@AfterEach
	public void afterEach() 
	{
		this.alterarOcorrencia.fechar();
	}
	
	@Test
	public void CaminhosFuncionandoCorretamente()
	{
		this.alterarOcorrencia.preencherFormularioDeLogin(usuario, senha);
		this.alterarOcorrencia.efetuarLogin();
		this.alterarOcorrencia.caminho();
		
		Assert.assertTrue(this.alterarOcorrencia.isPaginaAtual());
	}
}