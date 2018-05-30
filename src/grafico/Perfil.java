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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Perfil extends JFrame {

	private JPanel contentPane;

	public Perfil(String login) {
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
		
		JLabel lblSessao = new JLabel("PERFIL");
		lblSessao.setBackground(Color.LIGHT_GRAY);
		lblSessao.setOpaque(true);
		lblSessao.setHorizontalAlignment(SwingConstants.CENTER);
		lblSessao.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSessao.setBounds(10, 64, 480, 27);
		contentPane.add(lblSessao);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(10, 102, 84, 35);
		contentPane.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIdade.setBounds(10, 148, 84, 35);
		contentPane.add(lblIdade);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmail.setBounds(10, 194, 84, 35);
		contentPane.add(lblEmail);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCidade.setBounds(10, 240, 84, 35);
		contentPane.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEstado.setBounds(10, 286, 84, 35);
		contentPane.add(lblEstado);
		
		JLabel lblPais = new JLabel("Pa\u00EDs");
		lblPais.setHorizontalAlignment(SwingConstants.CENTER);
		lblPais.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPais.setBounds(10, 332, 84, 35);
		contentPane.add(lblPais);
		
		//Puxar Dados Perfil
		String nome = "";
		int idade = 0;
		String email = "";
		String cidade = "";
		String estado = "";
		String pais = "";
		
		for(int i=0; i<codigo.Perfil.dadosPerfil.size(); i++){
			
			if(codigo.Perfil.dadosPerfil.get(i).getNome().equals(login)){
				nome = codigo.Perfil.dadosPerfil.get(i).getNome();
				idade = codigo.Perfil.dadosPerfil.get(i).getIdade();
				email = codigo.Perfil.dadosPerfil.get(i).getEmail();
				cidade = codigo.Perfil.dadosPerfil.get(i).getCidade();
				estado = codigo.Perfil.dadosPerfil.get(i).getEstado();
				pais = codigo.Perfil.dadosPerfil.get(i).getPais();
			}
			
		}
		
		JLabel seuNome = new JLabel(nome);
		seuNome.setHorizontalAlignment(SwingConstants.CENTER);
		seuNome.setFont(new Font("Tahoma", Font.BOLD, 16));
		seuNome.setBounds(104, 102, 259, 35);
		contentPane.add(seuNome);
		
		JLabel suaIdade = new JLabel(String.valueOf(idade));
		suaIdade.setHorizontalAlignment(SwingConstants.CENTER);
		suaIdade.setFont(new Font("Tahoma", Font.BOLD, 16));
		suaIdade.setBounds(104, 148, 259, 35);
		contentPane.add(suaIdade);
		
		JLabel seuEmail = new JLabel(email);
		seuEmail.setHorizontalAlignment(SwingConstants.CENTER);
		seuEmail.setFont(new Font("Tahoma", Font.BOLD, 16));
		seuEmail.setBounds(104, 194, 259, 35);
		contentPane.add(seuEmail);
		
		JLabel suaCidade = new JLabel(cidade);
		suaCidade.setHorizontalAlignment(SwingConstants.CENTER);
		suaCidade.setFont(new Font("Tahoma", Font.BOLD, 16));
		suaCidade.setBounds(104, 240, 259, 35);
		contentPane.add(suaCidade);
		
		JLabel seuEstado = new JLabel(estado);
		seuEstado.setHorizontalAlignment(SwingConstants.CENTER);
		seuEstado.setFont(new Font("Tahoma", Font.BOLD, 16));
		seuEstado.setBounds(104, 286, 259, 35);
		contentPane.add(seuEstado);
		
		JLabel seuPais = new JLabel(pais);
		seuPais.setHorizontalAlignment(SwingConstants.CENTER);
		seuPais.setFont(new Font("Tahoma", Font.BOLD, 16));
		seuPais.setBounds(104, 332, 259, 35);
		contentPane.add(seuPais);
		
		setVisible(true);
	}
}
