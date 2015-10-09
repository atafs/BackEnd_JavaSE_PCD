package OO_04PessoaTemCarro;

public class Start_OO_04PessoaComCarro {

	public static void main(String[] args) {

		/* instantiate classes */
		PessoaComCarro p 	= new PessoaComCarro();
		p.nome 				= "Americo";
		p.idade 			= 34;
		
		Carro c 			= new Carro();
		c.ano				= 1976;
		c.nome 				= "Mustang";
		
		/* place the object Carro in attribute Pessoa */
		p.carro 			= c;
		
		p.carro.andar("60 Kmh\n");
		p.verificarIdade();

		
		
	}

}
