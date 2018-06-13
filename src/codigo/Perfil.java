package codigo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Perfil {

	// Atributos
	private String nome;
	private String senha;
	private String email;
	private int idade;
	private String estado;
	private String cidade;
	private String pais;
	/*
	 * Adicionar Atributo de Nível de Acesso Membro = false; Moderador = true
	 */
	private boolean mod;
	private boolean adm;
	private boolean banido;

	// Métodos Mágicos
	public boolean isBanido() {
		return banido;
	}

	public void setBanido(boolean banido) {
		this.banido = banido;
	}

	public boolean isAdm() {
		return adm;
	}

	public void setAdm(boolean adm) {
		this.adm = adm;
	}

	public boolean isMod() {
		return mod;
	}

	public void setMod(boolean mod) {
		this.mod = mod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String país) {
		this.pais = país;
	}

	// ArrayList
	public static ArrayList<Perfil> dadosPerfil = new ArrayList<>();

	// Validar Dados
	public boolean validaPerfil(String nome, String senha, String repSenha, String email, int idade, String estado,
			String cidade, String pais) {

		boolean valida = true;

		if (!nome.equals("") && (!senha.equals("")) && (!repSenha.equals("")) && (!email.equals(""))
				&& (!estado.equals("")) && (!cidade.equals("")) && (!pais.equals(""))) {

			if (senha.equals(repSenha)) {

				for (int i = 0; i < Login.dadosLogin.size(); i++) {

					if (Login.dadosLogin.get(i).getLogin().equalsIgnoreCase(nome)) {

						valida = false;
						break;

					}

				}

				if (valida == true) {
					cadastrar(nome, senha, repSenha, email, idade, estado, cidade, pais);
					JOptionPane.showMessageDialog(null, "Bem vindo ao Darkest Side of the Music, " + nome + "!");
				} else {
					JOptionPane.showMessageDialog(null, "Nome de usuário já existente.");
				}

			} else {
				valida = false;
				JOptionPane.showMessageDialog(null, "A senha precisa ser confirmada corretamente.");
			}

		} else {
			valida = false;
			JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
		}

		return valida;

	}

	// Cadastrar primeiro Perfil
	public void perfilAdm() {

		Perfil a = new Perfil();
		a.nome = "Alison";
		a.senha = "123";
		a.idade = 23;
		a.email = "alison.rafaelc@gmail.com";
		a.pais = "Brasil";
		a.estado = "Santa Catarina";
		a.cidade = "Blumenau";
		a.mod = true;
		a.adm = true;
		a.banido = false;

		dadosPerfil.add(a);

		Login b = new Login();

		b.setLogin("Alison");
		b.setSenha("123");
		Login.dadosLogin.add(b);

	}

	// Cadastrar no Array de Perfil e Login
	public void cadastrar(String nome, String senha, String repSenha, String email, int idade, String estado,
			String cidade, String pais) {

		Perfil a = new Perfil();
		a.setNome(nome);
		a.setSenha(senha);
		a.setIdade(idade);
		a.setEmail(email);
		a.setPais(pais);
		a.setEstado(estado);
		a.setCidade(cidade);
		a.setMod(false);
		a.setAdm(false);
		a.setBanido(banido);
		dadosPerfil.add(a);

		Login b = new Login();
		b.setLogin(nome);
		b.setSenha(senha);

		Login.dadosLogin.add(b);

	}

	// Alterar níveis perfil
	public void alterarNivel(int linha, String nome, boolean ehAdm, boolean ehMod) {

		for (int i = 0; i < codigo.Perfil.dadosPerfil.size(); i++) {
			if (dadosPerfil.get(i).getNome().equals(nome)) {
				Perfil a = new Perfil();
				a.setNome(dadosPerfil.get(i).getNome());
				a.setSenha(dadosPerfil.get(i).getSenha());
				a.setIdade(dadosPerfil.get(i).getIdade());
				a.setEmail(dadosPerfil.get(i).getEmail());
				a.setPais(dadosPerfil.get(i).getPais());
				a.setEstado(dadosPerfil.get(i).getEstado());
				a.setCidade(dadosPerfil.get(i).getCidade());
				if (ehAdm == true) {
					a.setAdm(true);
					a.setMod(true);
				} else if (ehMod == true) {
					a.setAdm(false);
					a.setMod(false);
					if (nome.equals(VariaveisEstaticas.usuarioLogado)) {
						VariaveisEstaticas.isMod = false;
					}
				} else {
					a.setAdm(false);
					a.setMod(true);
				}
				a.setBanido(false);

				Perfil.dadosPerfil.set(linha, a);

			}

		}

	}
	
	public void banirMembro(int linha, String nome, boolean ehBan) {
		for (int i = 0; i < codigo.Perfil.dadosPerfil.size(); i++) {
			if (dadosPerfil.get(i).getNome().equals(nome)) {
				Perfil a = new Perfil();
				a.setNome(dadosPerfil.get(i).getNome());
				a.setSenha(dadosPerfil.get(i).getSenha());
				a.setIdade(dadosPerfil.get(i).getIdade());
				a.setEmail(dadosPerfil.get(i).getEmail());
				a.setPais(dadosPerfil.get(i).getPais());
				a.setEstado(dadosPerfil.get(i).getEstado());
				a.setCidade(dadosPerfil.get(i).getCidade());
				a.setAdm(dadosPerfil.get(i).isAdm());
				a.setMod(dadosPerfil.get(i).isMod());
				if(ehBan == true) {
					a.setBanido(false);
				}else if((dadosPerfil.get(i).isAdm() == true) || (dadosPerfil.get(i).isMod() == true)){
					a.setBanido(false);
					JOptionPane.showMessageDialog(null, "Você não tem permissão para fazer isto.");
				}else {
					a.setBanido(true);
				}

				Perfil.dadosPerfil.set(linha, a);

			}

		}
		
	}

}
