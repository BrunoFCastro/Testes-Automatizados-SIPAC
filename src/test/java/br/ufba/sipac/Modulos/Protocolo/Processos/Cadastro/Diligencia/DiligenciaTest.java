package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.Diligencia;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.sipac.Login.Usuarios.UsuarioTestModuloDeProtocolo;

public class DiligenciaTest 
{
	private DiligenciaPage diligencia;
	
	public String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	public String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
	@BeforeEach
	public void beforeEach() 
	{
		this.diligencia = new DiligenciaPage();
	}
	
	@AfterEach
	public void afterEach() 
	{
		this.diligencia.fechar();
	}
	
	@Test
	public void CaminhosFuncionandoCorretamente()
	{
		this.diligencia.preencherFormularioDeLogin(usuario, senha);
		this.diligencia.efetuarLogin();
		this.diligencia.caminho();
		
		Assert.assertTrue(this.diligencia.isPaginaAtual());
	}
}