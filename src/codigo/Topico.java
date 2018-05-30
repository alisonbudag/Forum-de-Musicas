package codigo;

import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Topico {

	//Atributos
	private String titulo;
	private String mensagem;
	
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
	public void validaTopico(String titulo, String mensagem){
		
		if((!titulo.equals("")) && (!mensagem.equals(""))){
			cadastrar(titulo, mensagem);
			JOptionPane.showMessageDialog(null, "Topico criado.");
		}else{
			JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
		}
		
	}
	
	//Cadastrar no Array
	public void cadastrar(String titulo, String mensagem){
		
		Topico a = new Topico();
		a.setTitulo(titulo);
		a.setMensagem(mensagem);
		
		Topico.dadosTopico.add(a);
		
	}
	
	//
	public DefaultListModel<String> listarTopico(){
		
		DefaultListModel<String> modelo = new DefaultListModel<>();
		
		for(int i=0; i<Topico.dadosTopico.size(); i++){
			modelo.addElement(dadosTopico.get(i).getTitulo());
		}
		
		return modelo;		
		
	}
	
}
