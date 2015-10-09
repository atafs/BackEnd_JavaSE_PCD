package pt.progJava.americoLib.control25.bean;

/* POJP: plain object java project */
public class Pessoa {

	/* attributes */
	private Integer id;
	private String nome;
	private String cpf;
	private String email;
	private String fone;
	private String ddd;
	
	/* getters and setters */
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	
	@Override
	public String toString() {
		return "[nome:> " + nome + "]";
	}
	
	
}


