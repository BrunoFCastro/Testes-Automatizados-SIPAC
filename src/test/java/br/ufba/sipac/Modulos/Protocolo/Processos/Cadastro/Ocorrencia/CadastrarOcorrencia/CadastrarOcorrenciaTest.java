package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.Ocorrencia.CadastrarOcorrencia;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.sipac.Login.Usuarios.UsuarioTestModuloDeProtocolo;

public class CadastrarOcorrenciaTest 
{
	private CadastrarOcorrenciaPage cadastrarOcorrencia;
	
	public String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	public String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
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