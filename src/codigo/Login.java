package codigo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Login {

	//Atributos
	private String login, senha;
	
	//ArrayList
	public static ArrayList<Login> dadosLogin = new ArrayList<>();
	
	//Método Mágico
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	//Primeiro ADM	
	public void primeiroAdmin() {
		
		Login a = new Login();
		
		a.setLogin("Admin");;
		a.setSenha("Admin");
		dadosLogin.add(a);
		
	}
	
	//Validar Login
	public boolean validaLogin(String login, String senha){
		
		boolean valida = false;
		
		if(!login.equals("") && (!senha.equals(""))){
			
			for(int i=0; i<dadosLogin.size(); i++) {
				
				if(dadosLogin.get(i).getLogin().equals(login) && (dadosLogin.get(i).getSenha().equals(senha))) {
					valida = true;
					break;
				}
				
			}
			
			if(valida == false) {
				JOptionPane.showMessageDialog(null, "Login e/ou senha incorreto(s).");
			}
			
		}else{
			JOptionPane.showMessageDialog(null, "Preencha todos os campos");
		}
		
		return valida;
		
	}
	
	
}
