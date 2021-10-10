package Geral.Login.Modulos.Protocolo.Processos.Cadastro.RetiradaDePecas.Desmembramento;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Geral.Login.Usuarios.ThiagoCoutinho;

public class DesmembramentoTest 
{
	private DesmembramentoPage desmembramento;
	
	public String usuario = ThiagoCoutinho.getUsuario();
	public String senha = ThiagoCoutinho.getSenha();
	
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