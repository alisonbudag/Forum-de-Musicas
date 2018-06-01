package grafico;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import codigo.Perfil;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class Cadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JPasswordField txtSenha;
	private JPasswordField txtRepSenha;
	private JTextField txtPais;
	private JTextField txtEstado;
	private JTextField txtCidade;

	public Cadastrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 276, 397);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Cadastrar");

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
		txtNome.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				super.keyTyped(e);
				if (txtNome != null && txtNome.getText() != null && txtNome.getText().length() >= 12) {
					e.setKeyChar((char) KeyEvent.VK_CLEAR);
				}
			}
		});

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
		for (int i = 12; i < 100; i++) {
			comboIdade.addItem(i);
		}

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String senha = String.valueOf(txtSenha.getPassword());
				String repSenha = String.valueOf(txtRepSenha.getPassword());
				String email = txtEmail.getText();
				int idade = (int) comboIdade.getSelectedItem();
				String estado = txtEstado.getText();
				String cidade = txtCidade.getText();
				String pais = txtPais.getText();

				Perfil a = new Perfil();

				if (a.validaPerfil(nome, senha, repSenha, email, idade, estado, cidade, pais) == true) {
					Login b = new Login();
					dispose();
				} else {
					txtNome.setText("");
					txtSenha.setText("");
					txtRepSenha.setText("");
					txtEmail.setText("");
					txtEstado.setText("");
					txtCidade.setText("");
					txtPais.setText("");
					comboIdade.setSelectedIndex(0);
					txtNome.requestFocus();
				}

			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCadastrar.setBounds(10, 292, 235, 23);
		contentPane.add(btnCadastrar);

		JLabel lblPais = new JLabel("Pa\u00EDs");
		lblPais.setOpaque(true);
		lblPais.setHorizontalAlignment(SwingConstants.CENTER);
		lblPais.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPais.setBackground(Color.LIGHT_GRAY);
		lblPais.setBounds(10, 199, 97, 20);
		contentPane.add(lblPais);

		txtPais = new JTextField();
		txtPais.setColumns(10);
		txtPais.setBounds(117, 199, 128, 20);
		contentPane.add(txtPais);

		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setOpaque(true);
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEstado.setBackground(Color.LIGHT_GRAY);
		lblEstado.setBounds(10, 230, 97, 20);
		contentPane.add(lblEstado);

		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		txtEstado.setBounds(117, 230, 128, 20);
		contentPane.add(txtEstado);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setOpaque(true);
		lblCidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCidade.setBackground(Color.LIGHT_GRAY);
		lblCidade.setBounds(10, 261, 97, 20);
		contentPane.add(lblCidade);

		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(117, 261, 128, 20);
		contentPane.add(txtCidade);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login a = new Login();
				
				dispose();
				
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancelar.setBounds(10, 323, 235, 23);
		contentPane.add(btnCancelar);

		setVisible(true);
	}
}
