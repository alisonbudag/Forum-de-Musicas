package grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Topico extends JFrame {

	private JPanel contentPane;

	public Topico(String index, String login, String topicoSelecionado) {
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
		lblHome.setBounds(51, 11, 43, 25);
		contentPane.add(lblHome);
		
		lblHome.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				Home a = new Home(login);
				
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
		lblPerfil.setBounds(145, 11, 43, 25);
		contentPane.add(lblPerfil);
		lblPerfil.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				Perfil a = new Perfil(login);
				
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
		
		JLabel lblCaixaDeMensagens = new JLabel("Caixa de Mensagens");
		lblCaixaDeMensagens.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCaixaDeMensagens.setBounds(224, 11, 139, 25);
		contentPane.add(lblCaixaDeMensagens);
		
		JLabel lblSair = new JLabel("Sair");
		lblSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSair.setBounds(410, 11, 43, 25);
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
		
		JLabel lblSessao = new JLabel("Darkest Side of the Music - ");
		lblSessao.setBackground(Color.LIGHT_GRAY);
		lblSessao.setOpaque(true);
		lblSessao.setHorizontalAlignment(SwingConstants.CENTER);
		lblSessao.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSessao.setBounds(10, 47, 480, 27);
		contentPane.add(lblSessao);
		
		JPanel pnlTopico = new JPanel();
		pnlTopico.setBackground(Color.LIGHT_GRAY);
		pnlTopico.setBounds(10, 95, 480, 266);
		contentPane.add(pnlTopico);
		pnlTopico.setLayout(null);
		
		JLabel lblTtuloDoTpico = new JLabel("T\u00EDtulo do t\u00F3pico");
		lblTtuloDoTpico.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTtuloDoTpico.setHorizontalAlignment(SwingConstants.LEFT);
		lblTtuloDoTpico.setBounds(10, 11, 460, 22);
		pnlTopico.add(lblTtuloDoTpico);
		
		JTextArea txtrComentario = new JTextArea();
		txtrComentario.setEditable(false);
		txtrComentario.setOpaque(false);
		txtrComentario.setText("Coment\u00E1rio");
		txtrComentario.setBounds(10, 44, 460, 104);
		pnlTopico.add(txtrComentario);
		
		JTextArea txtComentario2 = new JTextArea();
		txtComentario2.setEditable(false);
		txtComentario2.setOpaque(false);
		txtComentario2.setText("Coment\u00E1rio #2");
		txtComentario2.setBounds(10, 159, 460, 104);
		pnlTopico.add(txtComentario2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 2, 2);
		pnlTopico.add(scrollPane);
		
		JButton btnResponder = new JButton("Responder");
		btnResponder.setBounds(10, 366, 106, 23);
		contentPane.add(btnResponder);
		
		setVisible(true);
	}
}
