package Geral.Login.Modulos.Protocolo.Processos.Cadastro.AbrirProcessos;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Geral.Login.Usuarios.ThiagoCoutinho;

public class AbrirProcessoTest 
{		
	private AbrirProcessoPage abrirProcessos;
	
	public String usuario = ThiagoCoutinho.getUsuario();
	public String senha = ThiagoCoutinho.getSenha();
	
	@BeforeEach
	public void beforeEach() 
	{
		this.abrirProcessos = new AbrirProcessoPage();
	}
	
	@AfterEach
	public void afterEach() 
	{
		//this.abrirProcessos.fechar();
	}
	
	@Test
	public void CaminhosFuncionandoCorretamente()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
	}
	
	@Test
	public void DeveAdicionarAssinanteComDadosCorretos()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressado();
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComSucesso());
	}
	@Test
	public void NaoDeveAdicionarAssinantePorFaltaDeDadosDoServidor()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressadoComFaltaDeDadosDoServidor();
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComErooPorFaltaDeDadosDoServidor());
	}
	@Test
	public void NaoDeveAdicionarAssinantePorFaltaDeDadosDoEmail()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressadoComFaltaDeDadosDoEmail();
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComErooPorFaltaDeDadosDoEmail());
	}
	/*@Test
	public void NaoDeveAdicionarAssinantePorFaltaDeDadosDoServidorEDoEmail()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarInteressadoSemDdos();
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComErooPorFaltaDeDadosDoEmail());
		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComErooPorFaltaDeDadosDoServidor());
	}*/
	
	@Test
	public void DevePreencherOFormularioComDadosCorretos()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.preencherFormularioAbrirProcessosComTodosOsDadosCorretos();
		
	
		//this.abrirProcessos.SubmeterFormularioAbrirProcessos();
		
		Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
	}
}

























