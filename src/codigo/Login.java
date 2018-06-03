package codigo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Login {

	// Atributos
	private String login, senha;

	// ArrayList
	public static ArrayList<Login> dadosLogin = new ArrayList<>();

	// Método Mágico
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

	// Validar Login
	public boolean validaLogin(String login, String senha) {

		boolean valida = false;

		if (!login.equals("") && (!senha.equals(""))) {

			for (int i = 0; i < Perfil.dadosPerfil.size(); i++) {

				if (login.equals(Perfil.dadosPerfil.get(i).getNome())) {

					if (Perfil.dadosPerfil.get(i).isBanido() == false) {

						for (int i2 = 0; i2 < dadosLogin.size(); i2++) {

							if (dadosLogin.get(i).getLogin().equals(login)
									&& (dadosLogin.get(i).getSenha().equals(senha))) {
								valida = true;
								break;
							}

						}

						if (valida == false) {
							JOptionPane.showMessageDialog(null, "Login e/ou senha incorreto(s).");
						}

					}else {
						JOptionPane.showMessageDialog(null, "Essa conta está banida.");
					}

				}

			}

		} else {
			JOptionPane.showMessageDialog(null, "Preencha todos os campos");
		}

		return valida;

	}

}
