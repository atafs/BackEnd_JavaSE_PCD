package pt.progJava.americoLib.control74_aula1_1;

public class MilitanteTest {

	public static void main(String[] args) {

		//instantiate
		Militante militante = new Militante("Americo Tomas", 2014, "Sintra");
		
		//prints
		System.out.println(militante.getNumero());
		System.out.println(militante.getNome());
		System.out.println(militante.getAnoInscricao());
		System.out.println(militante.getCidadeRecenseamento());
		
		System.out.println(militante.toString());
		
	}
}
