package Geral.Login.Modulos.Protocolo.Processos.Cadastro.AutuarProcesso;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Geral.Login.Usuarios.ThiagoCoutinho;

public class AutuarProcessoTest 
{
	private AutuarProcessoPage autuarProcesso;
	
	public String usuario = ThiagoCoutinho.getUsuario();
	public String senha = ThiagoCoutinho.getSenha();
	
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