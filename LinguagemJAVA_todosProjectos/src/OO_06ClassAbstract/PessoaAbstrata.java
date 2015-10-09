package OO_06ClassAbstract;

public abstract class PessoaAbstrata extends MamiferoAbstrata{
	
	public String nome;
	public int idade;
	public String cpf;
	
	public void andar() {
		System.out.println("... estou a andar!!!");
	}

}
