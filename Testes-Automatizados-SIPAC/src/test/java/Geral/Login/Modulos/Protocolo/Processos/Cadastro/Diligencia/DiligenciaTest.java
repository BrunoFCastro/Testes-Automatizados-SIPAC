package Geral.Login.Modulos.Protocolo.Processos.Cadastro.Diligencia;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Geral.Login.Usuarios.ThiagoCoutinho;

public class DiligenciaTest 
{
	private DiligenciaPage diligencia;
	
	public String usuario = ThiagoCoutinho.getUsuario();
	public String senha = ThiagoCoutinho.getSenha();
	
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