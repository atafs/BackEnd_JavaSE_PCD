package OO_11Exception;


public class Cadastrador {
	
	public void cadastrar(Pessoa p1) throws AgeException{
		
		if(p1.getIdade() < 18) {
			throw new AgeException();
		} else {
			System.out.println("cadastro realizado!!! YEEEEESSSSSSS");
		}
	}

}
