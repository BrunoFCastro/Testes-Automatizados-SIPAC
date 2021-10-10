package Geral.Login.Modulos.Protocolo.Processos.Cadastro.RegistrarDadosDoProcesso;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Geral.Login.Usuarios.ThiagoCoutinho;

public class RegistrarDadosDoProcessoTest  
{
	private RegistrarDadosDoProcessoPage registrarDadosDoProcesso;
	
	public String usuario = ThiagoCoutinho.getUsuario();
	public String senha = ThiagoCoutinho.getSenha();
	
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