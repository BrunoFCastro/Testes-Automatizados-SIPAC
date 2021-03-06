package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.RetiradaDePecas.Desmembramento;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.sipac.Login.Usuarios.UsuarioTestModuloDeProtocolo;

public class DesmembramentoTest 
{
	private DesmembramentoPage desmembramento;
	
	public String usuario = UsuarioTestModuloDeProtocolo.getUsuario();
	public String senha = UsuarioTestModuloDeProtocolo.getSenha();
	
	@BeforeEach
	public void beforeEach() 
	{
		this.desmembramento = new DesmembramentoPage();
	}
	
	@AfterEach
	public void afterEach() 
	{
		this.desmembramento.fechar();
	}
	
	@Test
	public void CaminhosFuncionandoCorretamente()
	{
		this.desmembramento.preencherFormularioDeLogin(usuario, senha);
		this.desmembramento.efetuarLogin();
		this.desmembramento.caminho();
		
		Assert.assertTrue(this.desmembramento.isPaginaAtual());
	}
}