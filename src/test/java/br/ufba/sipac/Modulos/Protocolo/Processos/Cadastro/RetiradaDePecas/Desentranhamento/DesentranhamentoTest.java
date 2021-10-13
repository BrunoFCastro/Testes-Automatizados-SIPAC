package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.RetiradaDePecas.Desentranhamento;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.sipac.Login.Usuarios.UsuarioTestModuloDeProtocolo;

public class DesentranhamentoTest 
{
	private DesentranhamentoPage desentranhamento;
	
	public String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	public String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
	@BeforeEach
	public void beforeEach() 
	{
		this.desentranhamento = new DesentranhamentoPage();
	}
	
	@AfterEach
	public void afterEach() 
	{
		this.desentranhamento.fechar();
	}
	
	@Test
	public void CaminhosFuncionandoCorretamente()
	{
		this.desentranhamento.preencherFormularioDeLogin(usuario, senha);
		this.desentranhamento.efetuarLogin();
		this.desentranhamento.caminho();
		
		Assert.assertTrue(this.desentranhamento.isPaginaAtual());
	}
}