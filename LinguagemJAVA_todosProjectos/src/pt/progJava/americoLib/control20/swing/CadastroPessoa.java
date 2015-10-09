package pt.progJava.americoLib.control20.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import static java.lang.System.*;
import pt.progJava.americoLib.control20.bean.Pessoa;
import pt.progJava.americoLib.control20.db.PessoaDao;

@SuppressWarnings("serial")
public class CadastroPessoa extends JFrame implements ActionListener {

	private JTextField nome;
	private JTextField fone;
	private JTextField email;
	private JButton limpar;
	private JButton salvar;
	private JTextField cpf;
	private JTextField ddd;
	private JTextField id;

	private Pessoa p = new Pessoa();
	private PessoaDao pd = new PessoaDao();

	public CadastroPessoa() {

		this.setBounds(200, 200, 650, 298);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);

		JLabel label;
		JLabel label_1;
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(30, 48, 70, 15);
		this.getContentPane().add(lblNome);

		nome = new JTextField();
		nome.setBounds(128, 47, 360, 17);
		this.getContentPane().add(nome);
		nome.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(30, 128, 70, 15);
		this.getContentPane().add(lblTelefone);

		fone = new JTextField();
		fone.setBounds(194, 127, 117, 17);
		this.getContentPane().add(fone);
		fone.setColumns(10);

		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(30, 161, 70, 15);
		this.getContentPane().add(lblEmail);

		email = new JTextField();
		email.setBounds(128, 161, 360, 19);
		this.getContentPane().add(email);
		email.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(30, 202, 556, 2);
		this.getContentPane().add(separator);


		limpar = new JButton("Limpar");
		limpar.setBounds(180, 216, 117, 25);
		limpar.setActionCommand("limpar");
		limpar.addActionListener(this);

		this.getContentPane().add(limpar);
		
		salvar = new JButton("Salvar");
		salvar.setBounds(30, 216, 117, 25);
		salvar.setActionCommand("salvar");
		salvar.addActionListener(this);

		this.getContentPane().add(salvar);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(30, 89, 70, 15);
		getContentPane().add(lblCpf);

		cpf = new JTextField();
		cpf.setBounds(128, 87, 182, 19);
		getContentPane().add(cpf);
		cpf.setColumns(10);

		ddd = new JTextField();
		ddd.setColumns(10);
		ddd.setBounds(128, 127, 39, 17);
		getContentPane().add(ddd);

		label = new JLabel("(");
		label.setBounds(116, 128, 13, 15);
		getContentPane().add(label);

		label_1 = new JLabel(")");
		label_1.setBounds(174, 128, 13, 15);
		getContentPane().add(label_1);

		JLabel lblId = new JLabel("Id");
		lblId.setBounds(30, 12, 70, 15);
		getContentPane().add(lblId);

		id = new JTextField();
		id.setBounds(128, 16, 114, 19);
		getContentPane().add(id);
		id.setColumns(10);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("limpar")) {
			nome.setText(null);
			cpf.setText(null);
			ddd.setText(null);
			email.setText(null);
			fone.setText(null);
			id.setText(null);
			out.println("os campos foram todos limpos...");
			
		} else if(e.getActionCommand().equals("salvar")) {
			p.setNome(this.nome.getText());
			p.setCpf(this.cpf.getText());
			p.setDdd(this.ddd.getText());
			p.setEmail(this.email.getText());
			p.setFone(this.fone.getText());
			out.println("foram colocados na class Pessoa os dados...");
			
			pd.salvar(p);
			out.println("foram carregar no mySql os meus dados...");
			
		}

	}

}
