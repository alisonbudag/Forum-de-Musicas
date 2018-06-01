package codigo;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class JPanelMensagem {

	public JScrollPane estrutura(String topicoSelecionado) {

		//Contando elementos
		int contarElementos = Topico.dadosRespostasTopico.size();
		
		//Objeto JPanel
		JPanel jp = new JPanel();
		jp.setBackground(Color.GRAY);
		if(contarElementos > 0) {
			jp.setLayout(new GridLayout(contarElementos, 0, 5 ,5));
		}else{
			jp.setLayout(new GridLayout(contarElementos+1, 0, 5 ,5));
		}
		jp.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		//Exibir o subtópico
		int espacamento = 30;
		for(int indice = 0; indice < Topico.dadosRespostasTopico.size(); indice++) {
			JTextArea txtNovaResposta = new JTextArea();
			txtNovaResposta.setEditable(false);
			txtNovaResposta.setBackground(Color.LIGHT_GRAY);
			txtNovaResposta.setText(Topico.dadosRespostasTopico.get(indice).getRespostas());
			JScrollPane barraNovaResposta = new JScrollPane(txtNovaResposta);
			barraNovaResposta.setBounds(10, espacamento, 100, 100);
			espacamento+=30;
			
			jp.add(barraNovaResposta);
		}
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(jp);
		barra.setBounds(10, 202, 480, 154);
		
		
		//Retorno
		return barra;
	}
	
}
