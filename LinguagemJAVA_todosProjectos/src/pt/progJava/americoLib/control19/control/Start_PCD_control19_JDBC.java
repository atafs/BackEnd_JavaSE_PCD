package pt.progJava.americoLib.control19.control;

import pt.progJava.americoLib.control19.bean.Pessoa;
import pt.progJava.americoLib.control19.db.PessoaDao;

public class Start_PCD_control19_JDBC {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		p.setNome("Ana");
		p.setDdd("62");
		p.setEmail("anammbatalha@gmail.com");
		p.setCpf("12345678910");
		p.setFone("917639454");
		
		PessoaDao pd = new PessoaDao();
		pd.salvar(p);
	}

}
