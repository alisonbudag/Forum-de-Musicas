package grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Cadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JPasswordField txtSenha;
	private JPasswordField txtRepSenha;

	public Cadastrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 276, 274);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNovoUsuario = new JLabel("NOVO USU\u00C1RIO");
		lblNovoUsuario.setBackground(Color.LIGHT_GRAY);
		lblNovoUsuario.setOpaque(true);
		lblNovoUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblNovoUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNovoUsuario.setBounds(10, 11, 235, 22);
		contentPane.add(lblNovoUsuario);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBackground(Color.LIGHT_GRAY);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setOpaque(true);
		lblNome.setBounds(10, 44, 97, 20);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(117, 44, 128, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setOpaque(true);
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSenha.setBackground(Color.LIGHT_GRAY);
		lblSenha.setBounds(10, 75, 97, 20);
		contentPane.add(lblSenha);
		
		JLabel lblRepetirSenha = new JLabel("Repetir Senha");
		lblRepetirSenha.setOpaque(true);
		lblRepetirSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblRepetirSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRepetirSenha.setBackground(Color.LIGHT_GRAY);
		lblRepetirSenha.setBounds(10, 106, 97, 20);
		contentPane.add(lblRepetirSenha);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setOpaque(true);
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBackground(Color.LIGHT_GRAY);
		lblEmail.setBounds(10, 137, 97, 20);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(117, 137, 128, 20);
		contentPane.add(txtEmail);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setOpaque(true);
		lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdade.setBackground(Color.LIGHT_GRAY);
		lblIdade.setBounds(10, 168, 97, 20);
		contentPane.add(lblIdade);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(117, 75, 128, 20);
		contentPane.add(txtSenha);
		
		txtRepSenha = new JPasswordField();
		txtRepSenha.setBounds(117, 107, 128, 20);
		contentPane.add(txtRepSenha);
		
		JComboBox<Integer> comboIdade = new JComboBox<>();
		comboIdade.setBounds(117, 169, 128, 20);
		contentPane.add(comboIdade);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCadastrar.setBounds(10, 199, 235, 23);
		contentPane.add(btnCadastrar);
		for(int i=0; i<100; i++){
			comboIdade.addItem(i);
		}
		
		setVisible(true);
	}
}
