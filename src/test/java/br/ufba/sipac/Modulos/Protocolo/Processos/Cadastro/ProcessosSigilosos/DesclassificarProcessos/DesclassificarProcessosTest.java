package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.ProcessosSigilosos.DesclassificarProcessos;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.sipac.Login.Usuarios.UsuarioTestModuloDeProtocolo;

public class DesclassificarProcessosTest 
{
	private DesclassificarProcessosPage desclassificarProcessos;
	
	public String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	public String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
	@BeforeEach
	public void beforeEach() 
	{
		this.desclassificarProcessos = new DesclassificarProcessosPage();
	}
	
	@AfterEach
	public void afterEach() 
	{
		this.desclassificarProcessos.fechar();
	}
	
	@Test
	public void CaminhosFuncionandoCorretamente()
	{
		this.desclassificarProcessos.preencherFormularioDeLogin(usuario, senha);
		this.desclassificarProcessos.efetuarLogin();
		this.desclassificarProcessos.caminho();
		
		Assert.assertTrue(this.desclassificarProcessos.isPaginaAtual());
	}
}