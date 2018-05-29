package grafico;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel pnlLogin;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	public Login() {
		//JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 145);
		setTitle("Login");
		pnlLogin = new JPanel();
		pnlLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlLogin);
		pnlLogin.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLogin.setBounds(20, 11, 80, 20);
		pnlLogin.add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(110, 11, 150, 20);
		pnlLogin.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSenha.setBounds(20, 42, 80, 20);
		pnlLogin.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(110, 42, 150, 20);
		pnlLogin.add(txtSenha);
		txtSenha.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String login = txtLogin.getText();
				String senha = String.valueOf(txtSenha.getPassword());
				
				codigo.Login a = new codigo.Login();
				
				dispose();
				
				if(a.validaLogin(login, senha) == true){
					Home b = new Home();
					dispose();
				}else{
					txtLogin.setText("");
					txtSenha.setText("");
					txtLogin.requestFocus();
				}
				
				
			}
		});
		btnEntrar.setBounds(95, 74, 89, 23);
		pnlLogin.add(btnEntrar);
		
		//Exibir JFrame
		setVisible(true);
	}
}
