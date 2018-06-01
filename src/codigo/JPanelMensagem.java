package codigo;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class JPanelMensagem {

	public JScrollPane estrutura(String topico) {

		//Contando elementos
		int contarElementos = Topico.dadosRespostasTopico.size();
		
		//Objeto JPanel
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(contarElementos+1, 0, 5 ,5));
		jp.setBorder(new LineBorder(new Color(0, 0, 0)));

		
		//Exibir o subtópico
		int espacamento = 30;
		for(int indice = 0; indice < Topico.dadosRespostasTopico.size(); indice++) {
			JTextArea txtNovaResposta = new JTextArea();
			txtNovaResposta.setBounds(10, espacamento, 480, 111);
			txtNovaResposta.setText(Topico.dadosRespostasTopico.get(indice).getRespostas());
			espacamento+=30;
			
			jp.add(txtNovaResposta);
		}
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(jp);
		barra.setBounds(10, 237, 480, 122);
		
		
		//Retorno
		return barra;
	}
	
}
