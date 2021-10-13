package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.CadastrarProceso;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.sipac.Login.Usuarios.UsuarioTestModuloDeProtocolo;

public class CadastrarProcessoTest 
{
	private CadastrarProcessoPage cadastrarProcesso;
	
	public String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	public String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
	@BeforeEach
	public void beforeEach() 
	{
		this.cadastrarProcesso = new CadastrarProcessoPage();
	}
	
	@AfterEach
	public void afterEach() 
	{
		this.cadastrarProcesso.fechar();
	}
	
	@Test
	public void CaminhosFuncionandoCorretamente()
	{
		this.cadastrarProcesso.preencherFormularioDeLogin(usuario, senha);
		this.cadastrarProcesso.efetuarLogin();
		this.cadastrarProcesso.caminho();
		
		Assert.assertTrue(this.cadastrarProcesso.isPaginaAtual());
	}
}