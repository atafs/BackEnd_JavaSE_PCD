package pt.progJava.americoLib.control16;

@SuppressWarnings("serial")
public class AnimalException extends Exception{

	@Override
	public void printStackTrace() {
		super.printStackTrace();
		System.out.println("ERRO: o animal nao pode ter mais de cem anos...\n");;
	}
}
