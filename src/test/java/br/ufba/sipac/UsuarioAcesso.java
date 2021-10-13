package br.ufba.sipac.Login.Usuarios;

public class UsuarioAcesso {
	//Usuário e senha para acessar a VPN
	private static String usuarioAcesso = "";
	private static String senhaAcesso = "";
	//Usuário e senha para acessar teste2
	private static String usuarioSipac = "";
	private static String senhaSipac = "";
	
	//Funções retornam usuário e senhas e protegem os dados de serem modificados.
	public static String getUsuarioAcesso() 
	{
		return usuarioAcesso;
	}
	public static String getSenhaAcesso() 
	{
			return senhaAcesso;
	}
	public static String getUsuarioSipac() 
	{
		return usuarioSipac;
	}
	public static String getSenhaSipac() 
	{
			return senhaSipac;
	}

}
