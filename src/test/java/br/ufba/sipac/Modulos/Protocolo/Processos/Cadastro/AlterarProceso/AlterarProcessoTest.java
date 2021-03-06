package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AlterarProceso;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.sipac.Login.Usuarios.UsuarioTestModuloDeProtocolo;

public class AlterarProcessoTest
{
	private AlterarProcessoPage alterarProcesso;
	
	public String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	public String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
	@BeforeEach
	public void beforeEach() 
	{
		this.alterarProcesso = new AlterarProcessoPage();
	}
	
	@AfterEach
	public void afterEach() 
	{
		this.alterarProcesso.fechar();
	}
	
	@Test
	public void CaminhosFuncionandoCorretamente()
	{
		this.alterarProcesso.preencherFormularioDeLogin(usuario, senha);
		this.alterarProcesso.efetuarLogin();
		this.alterarProcesso.caminho();
		
		Assert.assertTrue(this.alterarProcesso.isPaginaAtual());
	}
}