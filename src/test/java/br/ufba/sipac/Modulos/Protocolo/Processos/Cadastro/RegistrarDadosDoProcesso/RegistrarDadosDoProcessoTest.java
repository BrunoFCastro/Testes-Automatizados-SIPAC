package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.RegistrarDadosDoProcesso;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.sipac.Login.Usuarios.UsuarioTestModuloDeProtocolo;

public class RegistrarDadosDoProcessoTest  
{
	private RegistrarDadosDoProcessoPage registrarDadosDoProcesso;
	
	public String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	public String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
	@BeforeEach
	public void beforeEach() 
	{
		this.registrarDadosDoProcesso = new RegistrarDadosDoProcessoPage();
	}
	
	@AfterEach
	public void afterEach() 
	{
		this.registrarDadosDoProcesso.fechar();
	}
	
	@Test
	public void CaminhosFuncionandoCorretamente()
	{
		this.registrarDadosDoProcesso.preencherFormularioDeLogin(usuario, senha);
		this.registrarDadosDoProcesso.efetuarLogin();
		this.registrarDadosDoProcesso.caminho();
		
		Assert.assertTrue(this.registrarDadosDoProcesso.isPaginaAtual());
	}
}