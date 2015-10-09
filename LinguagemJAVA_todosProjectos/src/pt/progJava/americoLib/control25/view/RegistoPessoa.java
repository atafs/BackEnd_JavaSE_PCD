package pt.progJava.americoLib.control25.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import pt.progJava.americoLib.control25.bean.Pessoa;
import pt.progJava.americoLib.control25.bean.PessoaBC;

@SuppressWarnings("serial")
public class RegistoPessoa extends JFrame implements ActionListener {

	@SuppressWarnings("rawtypes")
	private JComboBox pessoas;
	private JButton btnSelecionar;
	private JButton btnExcluir;
	private JButton btnSalvar;
	private JButton btnUpdate;
	private JTextField nome;
	private JTextField fone;
	private JTextField email;
	private JTextField id;
	private JTextField cpf;

	@SuppressWarnings("rawtypes")
	public RegistoPessoa() {
		getContentPane().setLayout(null);
		this.setBounds(150, 150, 600, 500);

		JLabel lblNome;
		JLabel lblPessoasCadastradas = new JLabel("Pessoas Registadas");
		lblPessoasCadastradas.setBounds(10, 32, 122, 14);
		getContentPane().add(lblPessoasCadastradas);

		pessoas = new JComboBox();
		pessoas.setBounds(142, 26, 262, 27);
		getContentPane().add(pessoas);

		btnSelecionar = new JButton("Select");
		btnSelecionar.addActionListener(this);
		btnSelecionar.setActionCommand("selecionar");
		btnSelecionar.setBounds(414, 28, 100, 25);
		getContentPane().add(btnSelecionar);

		lblNome = new JLabel("Nome");
		lblNome.setBounds(69, 162, 46, 14);
		getContentPane().add(lblNome);

		nome = new JTextField();
		nome.setBounds(121, 159, 323, 20);
		getContentPane().add(nome);
		nome.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(34, 111, 469, 7);
		getContentPane().add(separator);

		JLabel lblFone = new JLabel("Fone");
		lblFone.setBounds(69, 236, 46, 14);
		getContentPane().add(lblFone);

		fone = new JTextField();
		fone.setBounds(121, 233, 152, 20);
		getContentPane().add(fone);
		fone.setColumns(10);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(69, 278, 46, 14);
		getContentPane().add(lblEmail);

		email = new JTextField();
		email.setBounds(121, 275, 323, 20);
		getContentPane().add(email);
		email.setColumns(10);

		JLabel lblId = new JLabel("ID");
		lblId.setBounds(69, 129, 46, 14);
		getContentPane().add(lblId);

		id = new JTextField();
		id.setBounds(121, 124, 63, 20);
		getContentPane().add(id);
		id.setColumns(10);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(69, 199, 46, 14);
		getContentPane().add(lblCpf);

		cpf = new JTextField();
		cpf.setBounds(121, 190, 152, 20);
		getContentPane().add(cpf);
		cpf.setColumns(10);

		btnExcluir = new JButton("Delete");
		btnExcluir.addActionListener(this);
		btnExcluir.setActionCommand("excluir");
		btnExcluir.setBounds(204, 125, 89, 23);
		getContentPane().add(btnExcluir);

		btnSalvar = new JButton("Insert");
		btnSalvar.addActionListener(this);
		btnSalvar.setActionCommand("salvar");
		btnSalvar.setBounds(160, 333, 89, 23);
		getContentPane().add(btnSalvar);

		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(this);
		btnUpdate.setActionCommand("update");
		btnUpdate.setBounds(278, 333, 89, 23);
		getContentPane().add(btnUpdate);

		this.carregarLista();
	}

	public Pessoa montaPessoa() {
		Pessoa p = new Pessoa();
		p.setNome(this.nome.getText());
		p.setEmail(this.email.getText());
		p.setDdd("351");
		p.setCpf(this.cpf.getText());
		p.setFone(this.fone.getText());
		if (this.id.getText() != null && !this.id.getText().equals("")) {
			p.setId(Integer.parseInt(this.id.getText()));
		}
		return p;
	}
	
	public void limpaTela() {
		this.nome.setText("");
		this.email.setText(null);
		this.fone.setText("");
		this.cpf.setText("");
		this.id.setText(null);
	}
	

	public void setPessoa(Pessoa p) {
		this.nome.setText(p.getNome());
		this.email.setText(p.getEmail());
		this.fone.setText(p.getFone());
		this.cpf.setText(p.getCpf());

		if (p.getId() != null && p.getId() > 0) {
			this.id.setText(p.getId().toString());
		}
	}

	@SuppressWarnings("unchecked")
	public void carregarLista() {
		PessoaBC pbc = new PessoaBC();
		List<Pessoa> pessoasBd = pbc.select();
		pessoas.removeAllItems();
		for (Pessoa pessoa : pessoasBd) {
			pessoas.addItem(pessoa);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(this.btnSelecionar.getActionCommand())) {
			Pessoa p = (Pessoa) pessoas.getSelectedItem();
			this.setPessoa(p);
		} else if (e.getActionCommand().equals(
				this.btnUpdate.getActionCommand())) {
			Pessoa p = this.montaPessoa();
			PessoaBC pbc = new PessoaBC();
			pbc.update(p);
			this.limpaTela();
			this.carregarLista();
		} else if (e.getActionCommand().equals(
				this.btnExcluir.getActionCommand())) {
			Pessoa p = this.montaPessoa();
			PessoaBC pbc = new PessoaBC();
			pbc.delete(p);
			this.limpaTela();
			this.carregarLista();
		} else if (e.getActionCommand().equals(
				this.btnSalvar.getActionCommand())) {
			Pessoa p = this.montaPessoa();
			PessoaBC pbc = new PessoaBC();
			pbc.insert(p);
			this.limpaTela();
			this.carregarLista();
		}

	}

}
