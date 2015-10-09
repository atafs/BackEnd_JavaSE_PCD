package OO_11Exception;

import OO_11Exception.AgeException;
import OO_11Exception.Cadastrador;
import OO_11Exception.Pessoa;

public class Start_OO_11Exception {
	
	public static void main(String[] args) {
	
		Pessoa p1 = new Pessoa();
		p1.setNome("Americo");
		p1.setIdade(34);
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Tomas");
		p2.setIdade(14);
		
		Cadastrador c1 = new Cadastrador();
		Cadastrador c2 = new Cadastrador();
		
		try {
			c1.cadastrar(p1);
			c2.cadastrar(p2);

		} catch (AgeException e) {
			System.out.println("ERRO: cadastrar a pessoa....");
			e.printStackTrace();
		}
		
		
		
	}
	
	

}
