package Geral.Login.Modulos.Protocolo.Processos.Cadastro.ProcessosSigilosos.ReclassificarProcessos;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Geral.Login.Usuarios.ThiagoCoutinho;

public class ReclassificarProcessosTest 
{
	private ReclassificarProcessosPage reclassificarProcessos;
	
	public String usuario = ThiagoCoutinho.getUsuario();
	public String senha = ThiagoCoutinho.getSenha();
	
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