package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.ProcessosSigilosos.ReclassificarProcessos;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.sipac.Login.Usuarios.UsuarioTestModuloDeProtocolo;

public class ReclassificarProcessosTest 
{
	private ReclassificarProcessosPage reclassificarProcessos;
	
	public String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	public String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
	@BeforeEach
	public void beforeEach() 
	{
		this.reclassificarProcessos = new ReclassificarProcessosPage();
	}
	
	@AfterEach
	public void afterEach() 
	{
		this.reclassificarProcessos.fechar();
	}
	
	@Test
	public void CaminhosFuncionandoCorretamente()
	{
		this.reclassificarProcessos.preencherFormularioDeLogin(usuario, senha);
		this.reclassificarProcessos.efetuarLogin();
		this.reclassificarProcessos.caminho();
		
		Assert.assertTrue(this.reclassificarProcessos.isPaginaAtual());
	}
}