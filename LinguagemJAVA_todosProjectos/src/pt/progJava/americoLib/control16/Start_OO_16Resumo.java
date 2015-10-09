package pt.progJava.americoLib.control16;

public class Start_OO_16Resumo {

	public static void main(String[] args) {
		
		/*instantiate*/
		Pessoa p = new Pessoa();
		p.setIdade(34);
		p.setPeso(67);
		
		TesteAnimal t = new TesteAnimal();
		t.testa(p);
		
		Pessoa p1 = new Pessoa();
		p1.setIdade(101);
		p1.setPeso(120);
		
		try {
			t.verificaIdade(p);
			t.verificaIdade(p1);
		} catch (AnimalException e) {
			e.printStackTrace();
		} finally {
			System.out.println("o finally e sempre executado...");
		}
	}

}
