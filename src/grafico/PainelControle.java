package grafico;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigo.VariaveisEstaticas;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class PainelControle extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public PainelControle() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 270);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblMembros = new JLabel("Membros");
		lblMembros.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMembros.setHorizontalAlignment(SwingConstants.CENTER);
		lblMembros.setOpaque(true);
		lblMembros.setBackground(Color.LIGHT_GRAY);
		lblMembros.setBounds(10, 11, 300, 17);
		contentPane.add(lblMembros);
		
		//Instanciar Painel de Controle
		codigo.PainelControle a = new codigo.PainelControle();
		
		JScrollPane barraTabela = new JScrollPane();
		barraTabela.setBounds(10, 39, 300, 156);
		contentPane.add(barraTabela);
		
		table = new JTable(a.listarMembros());
		table.setBackground(Color.LIGHT_GRAY);
		table.setDefaultEditor(Object.class, null);
		barraTabela.setViewportView(table);
		
		JButton btnBanir = new JButton("Banir");
		btnBanir.setBounds(10, 206, 145, 23);
		contentPane.add(btnBanir);
		btnBanir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(table.getSelectedRow() != -1) {
					if(VariaveisEstaticas.isAdm == true || VariaveisEstaticas.isMod == true) {
						
						int linha;
						linha = table.getSelectedRow();
						String nome = table.getValueAt(linha, 0).toString();
						boolean ehBan = false;
						
						if(table.getValueAt(linha, 1).toString().equals("Banido")) {
							ehBan = true;
						}else{
							ehBan = false;
						}
						
						codigo.Perfil a = new codigo.Perfil();
						codigo.PainelControle b = new codigo.PainelControle();
						a.banirMembro(linha, nome, ehBan);
						table.setModel(b.listarMembros());
						
					}else {
						JOptionPane.showMessageDialog(null, "Você não tem permissão para fazer isto.");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Selecione um usuário primeiro.");
				}
				
			}
		});
		
		JButton btnAdicionarModerador = new JButton("Adicionar Mod");
		btnAdicionarModerador.setBounds(165, 206, 145, 23);
		contentPane.add(btnAdicionarModerador);
		btnAdicionarModerador.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if(table.getSelectedRow() != -1) {
					if(VariaveisEstaticas.isAdm == true) {
						int linha;
						linha = table.getSelectedRow();
						String nome = table.getValueAt(linha, 0).toString();
						boolean ehAdm = false;
						boolean ehMod = false;
						if(table.getValueAt(linha, 1).toString().equals("Administrador")) {
							ehAdm = true;
							ehMod = true;
							JOptionPane.showMessageDialog(null, "Impossível rebaixar o nível de um ADM.");
						}else if(table.getValueAt(linha, 1).toString().equals("Moderador")) {
							ehAdm = false;
							ehMod = true;
						}else {
							ehAdm = false;
							ehMod = false;
						}
					
						codigo.Perfil a = new codigo.Perfil();
						codigo.PainelControle b = new codigo.PainelControle();
						a.alterarNivel(linha, nome, ehAdm, ehMod);
						table.setModel(b.listarMembros());
					}else {
						JOptionPane.showMessageDialog(null, "Você não tem permissão para fazer isto.");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Selecione um usuário primeiro.");
				}
					
			}
		});
	
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				int linha = table.getSelectedRow();
				
				if(table.getValueAt(linha, 1).toString().equals("Moderador")) {
					btnAdicionarModerador.setText("Remover Mod");
					btnBanir.setText("Desbanir");
				}else if(table.getValueAt(linha, 1).toString().equals("Membro")){
					btnAdicionarModerador.setText("Adicionar Mod");
					btnBanir.setText("Banir");
				}else if(table.getValueAt(linha, 1).toString().equals("Banido")) {
					btnAdicionarModerador.setText("Adicionar Mod");
					btnBanir.setText("Desbanir");
				}else {
					btnAdicionarModerador.setText("Remover Mod");
					btnBanir.setText("Banir");
				}
				
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
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home a = new Home();
				dispose();
			}
		});
		btnVoltar.setBounds(123, 236, 70, 23);
		contentPane.add(btnVoltar);
		
		setVisible(true);
	}
}
