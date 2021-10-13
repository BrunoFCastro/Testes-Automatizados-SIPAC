package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AutuarProcesso;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.sipac.Login.Usuarios.UsuarioTestModuloDeProtocolo;

public class AutuarProcessoTest 
{
	private AutuarProcessoPage autuarProcesso;
	
	public String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	public String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
	@BeforeEach
	public void beforeEach() 
	{
		this.autuarProcesso = new AutuarProcessoPage();
	}
	
	@AfterEach
	public void afterEach() 
	{
		this.autuarProcesso.fechar();
	}
	
	@Test
	public void CaminhosFuncionandoCorretamente()
	{
		this.autuarProcesso.preencherFormularioDeLogin(usuario, senha);
		this.autuarProcesso.efetuarLogin();
		this.autuarProcesso.caminho();
		
		Assert.assertTrue(this.autuarProcesso.isPaginaAtual());
	}
}