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

public class Home extends JFrame {

	private JPanel contentPane;

	public Home() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTree tree = new JTree();
		tree.setOpaque(false);
		tree.setRootVisible(false);
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("root") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("Musica");
						node_1.add(new DefaultMutableTreeNode("Discuss\u00E3o"));
						node_1.add(new DefaultMutableTreeNode("Ouvindo Agora"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Divulga\u00E7\u00E3o e Arte");
						node_1.add(new DefaultMutableTreeNode("Bandas"));
						node_1.add(new DefaultMutableTreeNode("Composi\u00E7\u00F5es"));
						node_1.add(new DefaultMutableTreeNode("Photoshop"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Feedback");
						node_1.add(new DefaultMutableTreeNode("Bugs"));
						node_1.add(new DefaultMutableTreeNode("Melhorias"));
					add(node_1);
				}
			}
		));
		tree.setBounds(10, 102, 464, 248);
		contentPane.add(tree);
		
		JLabel backHome = new JLabel("");
		backHome.setIcon(new ImageIcon(getClass().getResource("/home.png")));
		backHome.setBounds(31, 11, 25, 25);
		contentPane.add(backHome);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHome.setBounds(66, 11, 43, 25);
		contentPane.add(lblHome);
		
		JLabel lblPerfil = new JLabel("Perfil");
		lblPerfil.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPerfil.setBounds(151, 11, 43, 25);
		contentPane.add(lblPerfil);
		
		JLabel lblCaixaDeMensagens = new JLabel("Caixa de Mensagens");
		lblCaixaDeMensagens.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCaixaDeMensagens.setBounds(225, 11, 139, 25);
		contentPane.add(lblCaixaDeMensagens);
		
		JLabel lblSair = new JLabel("Sair");
		lblSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSair.setBounds(404, 11, 43, 25);
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
		
		JLabel lblNewLabel = new JLabel("Bem Vindo ao Darkest Side of the Music");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 64, 464, 27);
		contentPane.add(lblNewLabel);
		
		setVisible(true);
	}
}
