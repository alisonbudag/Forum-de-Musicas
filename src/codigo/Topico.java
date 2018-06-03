package codigo;

import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Topico {

	// Atributos
	private String titulo;
	private String mensagem;
	private String sessao;
	private String respostas;

	// Método Mágico
	public String getRespostas() {
		return respostas;
	}

	public void setRespostas(String respostas) {
		this.respostas = respostas;
	}

	public String getSessao() {
		return sessao;
	}

	public void setSessao(String sessao) {
		this.sessao = sessao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	// ArrayList Tópico
	public static ArrayList<Topico> dadosTopico = new ArrayList<>();
	// ArrayList RespostasTópico
	public static ArrayList<Topico> dadosRespostasTopico = new ArrayList<>();

	// Validar Tópico
	public void validaTopico(String titulo, String mensagem, String index) {

		boolean valida = true;
		
		if ((!titulo.equals("")) && (!mensagem.equals(""))) {
			if (dadosTopico.size() > 0) {
				for (int i = 0; i < dadosTopico.size(); i++) {
					if (index.equals(dadosTopico.get(i).getSessao()) && titulo.equals(dadosTopico.get(i).getTitulo())) {
						valida = false;
						break;
					} else {
						valida = true;
					}
				}
				
				if(valida == true) {
					cadastrar(titulo, mensagem, index);
					JOptionPane.showMessageDialog(null, "Topico criado.");
				}else {
					JOptionPane.showMessageDialog(null, "Já existe um tópico com este título na sessão de "+index);
				}
			}else {
				cadastrar(titulo, mensagem, index);
				JOptionPane.showMessageDialog(null, "Topico criado.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
		}

	}

	// Cadastrar no Array
	public void cadastrar(String titulo, String mensagem, String index) {

		Topico a = new Topico();
		a.setTitulo(titulo);
		a.setMensagem(mensagem);
		a.setSessao(index);

		Topico.dadosTopico.add(a);

	}

	// Listar tópicos
	public DefaultListModel<String> listarTopico(String index) {

		DefaultListModel<String> modelo = new DefaultListModel<>();

		for (int i = 0; i < Topico.dadosTopico.size(); i++) {
			if (index.equals(Topico.dadosTopico.get(i).getSessao())) {
				modelo.addElement(dadosTopico.get(i).getTitulo());
			}
		}

		return modelo;

	}

	// Excluir tópico
	public void excluirTopico(String index, String topicoSelecionado) {

		for (int i = 0; i < Topico.dadosTopico.size(); i++) {
			if (index.equals(Topico.dadosTopico.get(i).getSessao())) {
				if (topicoSelecionado.equals(Topico.dadosTopico.get(i).getTitulo())) {
					Topico.dadosTopico.remove(i);
				}
			}

		}

	}

	// Validar responder tópico
	public void validaResponderTopico(String mensagem, String index, String topicoSelecionado) {

		if ((!mensagem.equals(""))) {
			cadastrarResponderTopico(mensagem, index, topicoSelecionado);
		} else {
			JOptionPane.showMessageDialog(null, "Você precisa digitar alguma coisa para enviar.");
		}

	}

	// Cadastrar resposta no Array
	public void cadastrarResponderTopico(String mensagem, String index, String topicoSelecionado) {

		Topico a = new Topico();
		a.setRespostas(mensagem);
		a.setSessao(index);
		a.setTitulo(topicoSelecionado);
		Topico.dadosRespostasTopico.add(a);

	}
	
	// Excluir respostas do tópico
	public void excluirRespostasTopico(String index, String topicoSelecionado) {
		
		for (int i = 0; i < Topico.dadosRespostasTopico.size(); i++) {
			if (index.equals(Topico.dadosRespostasTopico.get(i).getSessao())) {
				if (topicoSelecionado.equals(Topico.dadosRespostasTopico.get(i).getTitulo())) {
					Topico.dadosRespostasTopico.remove(i);
					i--;
				}
			}
		}
		
	}

}
