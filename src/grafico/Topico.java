package grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

import codigo.JPanelMensagem;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;

public class Topico extends JFrame {

	private JPanel contentPane;
	private JTextField txtTeste;

	public Topico(String index, String topicoSelecionado) {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHome.setBounds(50, 11, 43, 25);
		contentPane.add(lblHome);
		
		lblHome.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				Home a = new Home();
				
				dispose();
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JLabel lblPerfil = new JLabel("Perfil");
		lblPerfil.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPerfil.setBounds(175, 11, 43, 25);
		contentPane.add(lblPerfil);
		lblPerfil.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				Perfil a = new Perfil();
				
				dispose();
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JLabel lblLogout = new JLabel("Logout");
		lblLogout.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLogout.setBounds(300, 11, 139, 25);
		contentPane.add(lblLogout);
		lblLogout.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				Login a = new Login();
				
				dispose();
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JLabel lblSair = new JLabel("Sair");
		lblSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSair.setBounds(425, 11, 43, 25);
		contentPane.add(lblSair);
		
		lblSair.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				dispose();
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JLabel lblSessao = new JLabel(index);
		lblSessao.setBackground(Color.LIGHT_GRAY);
		lblSessao.setOpaque(true);
		lblSessao.setHorizontalAlignment(SwingConstants.CENTER);
		lblSessao.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSessao.setBounds(10, 47, 480, 27);
		contentPane.add(lblSessao);
		
		JButton btnResponder = new JButton("Responder");
		btnResponder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResponderTopico a = new ResponderTopico(index, topicoSelecionado);
				dispose();
			}
		});
		btnResponder.setBounds(384, 366, 106, 23);
		contentPane.add(btnResponder);
		
		//Puxando dados
		String titTopic = "";
		String msgTopic = "";
		
		for(int i=0; i<codigo.Topico.dadosTopico.size(); i++) {
			if(index.equals(codigo.Topico.dadosTopico.get(i).getSessao()) && (topicoSelecionado.equals(codigo.Topico.dadosTopico.get(i).getTitulo()))) {
				titTopic = topicoSelecionado;
				msgTopic = codigo.Topico.dadosTopico.get(i).getMensagem();
			}
		}
		
		JLabel lblTitulotopico = new JLabel("Topico: "+titTopic);
		lblTitulotopico.setBackground(Color.LIGHT_GRAY);
		lblTitulotopico.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTitulotopico.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulotopico.setBounds(10, 85, 350, 25);
		contentPane.add(lblTitulotopico);
		
		JTextArea txtrMsgtopico = new JTextArea();
		txtrMsgtopico.setLineWrap(true);
		txtrMsgtopico.setBackground(Color.LIGHT_GRAY);
		txtrMsgtopico.setEditable(false);
		txtrMsgtopico.setText(msgTopic);
		JScrollPane barraMsgTopico = new JScrollPane(txtrMsgtopico);
		barraMsgTopico.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		barraMsgTopico.setBounds(10, 116, 480, 85);
		contentPane.add(barraMsgTopico);
		
		//Chamar JPanel
		JPanelMensagem a = new JPanelMensagem();
		contentPane.add(a.estrutura(index, topicoSelecionado));
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sessao a = new Sessao(index);
				dispose();
			}
		});
		btnVoltar.setBounds(10, 366, 106, 23);
		contentPane.add(btnVoltar);
		
		JButton btnExcluirTopico = new JButton("Excluir tópico");
		btnExcluirTopico.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnExcluirTopico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int confirm = JOptionPane.showConfirmDialog(null, "Você tem certeza?", "Excluir tópico", 0);
				if(confirm == 0) {
					codigo.Topico a = new codigo.Topico();
					a.excluirTopico(index, topicoSelecionado);
					Sessao b = new Sessao(index);
					dispose();
				}
				
			}
		});
		btnExcluirTopico.setBounds(370, 85, 120, 23);
		if(codigo.VariaveisEstaticas.isMod == true || codigo.VariaveisEstaticas.isAdm == true) {
			btnExcluirTopico.setVisible(true);
		}else {
			btnExcluirTopico.setVisible(false);
		}
		contentPane.add(btnExcluirTopico);
		
		JLabel lblRespostas = new JLabel("Respostas:");
		lblRespostas.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRespostas.setHorizontalAlignment(SwingConstants.LEFT);
		lblRespostas.setBounds(10, 205, 480, 14);
		contentPane.add(lblRespostas);
		
		setVisible(true);
	}
}
