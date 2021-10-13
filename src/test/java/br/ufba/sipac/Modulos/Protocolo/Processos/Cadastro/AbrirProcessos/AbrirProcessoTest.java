package br.ufba.sipac.Modulos.Protocolo.Processos.Cadastro.AbrirProcessos;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufba.sipac.Login.Usuarios.ThiagoCoutinho;

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
		this.abrirProcessos.fechar();
	}
	
	@Test
	public void CaminhosFuncionandoCorretamente()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
	}
	
	@Test
	public void DeveAdicionarServidorInteressadoComDadosCorretos()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarServidorInteressado();

		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComSucesso());
		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("1574037", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("elieide.orrico!!@ufba.br", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Servidor", tipoInteressadoLogado);
	}
	@Test
	public void NaoDeveAdicionarServidorInteressadoPorFaltaDeDadosDoServidor()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarServidorInteressadoComFaltaDeDadosDoServidor();
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComErooPorFaltaDeDadosDoServidor());
	}
	@Test
	public void NaoDeveAdicionarServidorInteressadoPorFaltaDeDadosDoEmail()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarServidorInteressadoComFaltaDeDadosDoEmail();
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComEroPorFaltaDeDadosDoEmail());
	}
	
	@Test
	public void DeveAdicionarAlunoInteressadoComDadosCorretos()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarAlunoInteressado();

		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComSucesso());
		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("212215251", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("elieide.orrico!!@ufba.br", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Aluno Pós-Graduação", tipoInteressadoLogado);
	}
	@Test
	public void NaoDeveAdicionarAlunoInteressadoComDadosCorretosPorFaltaDeDadosDoServidor()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarServidorInteressadoComFaltaDeDadosDoServidor();
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComErooPorFaltaDeDadosDoServidor());
	}
	@Test
	public void NaoDeveAdicionarAlunoInteressadoPorFaltaDeDadosDoEmail()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarAlunoInteressadoComFaltaDeDadosDoEmail();
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComEroPorFaltaDeDadosDoEmail());
	}

	@Test
	public void DeveAdicionarCredorInteressadoComDadosCorretos()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarCredorInteressado();

		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComSucesso());
		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("14.674.337/0001-99", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ASSEMBLÉIA LEGISLATIVA DO ESTADO DA BAHIA", nomeInteressadoLogado);
		//String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		//Assert.assertEquals("", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Credor", tipoInteressadoLogado);
	}
	public void NaoDeveAdicionarCredorInteressadoComDadosCorretosPorFaltaDeDadosDoServidor()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarCredorInteressadoComFaltaDeDadosDoServidor();
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComErooPorFaltaDeDadosDoServidor());
	}
	/*@Test
	public void NaoDeveAdicionarCredorInteressadoPorFaltaDeDadosDoEmail()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarCredorInteressadoComFaltaDeDadosDoServidor();
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComErooPorFaltaDeDadosDoEmail());
	}*/
	
	@Test
	public void DeveAdicionarUnidadeInteressadoComDadosCorretos()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarUnidadeInteressado(); //SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA (12.01.42)

		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComSucesso());
		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("120142", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("SUPERINTENDÊNCIA DE TECNOLOGIA DA INFORMAÇÃO /UFBA", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("sti!!@ufba.br", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Unidade", tipoInteressadoLogado);
	}
	public void NaoDeveAdicionarUnidadeInteressadoComFaltaDeDadosDoServido()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarUnidadeInteressadoComFaltaDeDadosDoServidor();
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComErooPorFaltaDeDadosDoServidor());
	}
	@Test
	public void NaoDeveAdicionarUnidadeInteressadoPorFaltaDeDadosDoEmail()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarUnidadeInteressadoComFaltaDeDadosDoEmail();
		
		//Assert.assertFalse(paginaDeLogin.isPaginaAtual());
		//Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComEroPorFaltaDeDadosDoEmail());
	}

	/*@Test
	public void DeveAdicionarOutrosInteressadoComDadosCorretos()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarOutrosInteressado();

		Assert.assertTrue(abrirProcessos.mensagemDeInteressadoAdicionadoComSucesso());
		String identificadorInteressadoLogado = abrirProcessos.getIdentificadorInteressadoLogado();
		Assert.assertEquals("1574037", identificadorInteressadoLogado);
		String nomeInteressadoLogado = abrirProcessos.getNomeInteressadoLogado();
		Assert.assertEquals("ELIEIDE SANTOS ORRICO", nomeInteressadoLogado);
		String emailInteressadoLogado = abrirProcessos.getEmailInteressadoLogado();
		Assert.assertEquals("elieide.orrico!!@ufba.br", emailInteressadoLogado);
		String tipoInteressadoLogado = abrirProcessos.getTipoInteressadoLogado();
		Assert.assertEquals("Servidor", tipoInteressadoLogado);
	}*/
	
	@Test
	public void DevePreencherOFormularioComDadosCorretos()
	{
		this.abrirProcessos.preencherFormularioDeLogin(usuario, senha);
		this.abrirProcessos.efetuarLogin();
		this.abrirProcessos.caminho();
		
		this.abrirProcessos.adicionarServidorInteressado();
		
		this.abrirProcessos.preencherFormularioAbrirProcessosComTodosOsDadosCorretos();
		
	
		this.abrirProcessos.submeterFormularioAbrirProcessos();
		
		Assert.assertTrue(this.abrirProcessos.isPaginaAtual());
	}
}






































