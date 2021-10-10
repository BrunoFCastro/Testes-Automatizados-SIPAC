package Geral.Login.Modulos.Protocolo.Processos.Cadastro.RetiradaDePecas.Desentranhamento;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Geral.Login.Usuarios.ThiagoCoutinho;

public class DesentranhamentoTest 
{
	private DesentranhamentoPage desentranhamento;
	
	public String usuario = ThiagoCoutinho.getUsuario();
	public String senha = ThiagoCoutinho.getSenha();
	
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