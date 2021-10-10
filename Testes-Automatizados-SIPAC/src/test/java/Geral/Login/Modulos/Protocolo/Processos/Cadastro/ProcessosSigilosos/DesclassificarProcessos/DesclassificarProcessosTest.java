package Geral.Login.Modulos.Protocolo.Processos.Cadastro.ProcessosSigilosos.DesclassificarProcessos;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Geral.Login.Usuarios.ThiagoCoutinho;

public class DesclassificarProcessosTest 
{
	private DesclassificarProcessosPage desclassificarProcessos;
	
	public String usuario = ThiagoCoutinho.getUsuario();
	public String senha = ThiagoCoutinho.getSenha();
	
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