package codigo;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class JPanelMensagem {

	public JScrollPane estrutura(String index, String topicoSelecionado) {

		// Contando elementos
		int contarElementos = Topico.dadosRespostasTopico.size();

		// Objeto JPanel
		JPanel jp = new JPanel();
		jp.setBackground(Color.GRAY);
		if (contarElementos > 0) {
			jp.setLayout(new GridLayout(contarElementos, 0, 5, 5));
		} else {
			jp.setLayout(new GridLayout(contarElementos + 1, 0, 5, 5));
		}
		jp.setBorder(new LineBorder(new Color(0, 0, 0)));

		// Exibir o subtópico
		int espacamento = 20;

		for (int indice = 0; indice < Topico.dadosRespostasTopico.size(); indice++) {
			if (Topico.dadosRespostasTopico.get(indice).getSessao().equals(index)) {
				if (Topico.dadosRespostasTopico.get(indice).getTitulo().equals(topicoSelecionado)) {
					JTextArea txtNovaResposta = new JTextArea();
					txtNovaResposta.setEditable(false);
					txtNovaResposta.setBackground(Color.LIGHT_GRAY);
					txtNovaResposta.setText(Topico.dadosRespostasTopico.get(indice).getRespostas());
					JScrollPane barraNovaResposta = new JScrollPane(txtNovaResposta);
					barraNovaResposta.setBounds(10, espacamento, 100, 100);
					espacamento += 20;

					jp.add(barraNovaResposta);
				}
			}
		}

		// JScrollPane
		JScrollPane barra = new JScrollPane(jp);
		barra.setBounds(10, 229, 480, 124);

		// Retorno
		return barra;
	}

}
