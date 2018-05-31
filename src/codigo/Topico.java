package codigo;

import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Topico {

	//Atributos
	private String titulo;
	private String mensagem;
	private String sessao;
	
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

	//ArrayList
	public static ArrayList<Topico> dadosTopico = new ArrayList<>();
	
	//Validar Topico
	public void validaTopico(String titulo, String mensagem, String index){
		
		if((!titulo.equals("")) && (!mensagem.equals(""))){
			cadastrar(titulo, mensagem, index);
			JOptionPane.showMessageDialog(null, "Topico criado.");
		}else{
			JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
		}
		
	}
	
	//Cadastrar no Array
	public void cadastrar(String titulo, String mensagem, String index){
		
		Topico a = new Topico();
		a.setTitulo(titulo);
		a.setMensagem(mensagem);
		a.setSessao(index);
		
		Topico.dadosTopico.add(a);
		
	}
	
	//
	public DefaultListModel<String> listarTopico(String index){
		
		DefaultListModel<String> modelo = new DefaultListModel<>();
		
		for(int i=0; i<Topico.dadosTopico.size(); i++){
			if(index.equals(Topico.dadosTopico.get(i).getSessao())) {
				modelo.addElement(dadosTopico.get(i).getTitulo());
			}
		}
		
		return modelo;		
		
	}
	
}
