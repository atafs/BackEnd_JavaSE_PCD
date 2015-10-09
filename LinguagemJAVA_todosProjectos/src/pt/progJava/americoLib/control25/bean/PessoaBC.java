package pt.progJava.americoLib.control25.bean;

import java.util.List;

import pt.progJava.americoLib.control25.dao.Dao;
import pt.progJava.americoLib.control25.dao.PessoaDao;

public class PessoaBC implements Dao {

	@Override
	public void insert(Object o) {
		PessoaDao pd = new PessoaDao();
		pd.insert((Pessoa)o);
	}

	@Override
	public void update(Object o) {
		PessoaDao pd = new PessoaDao();
		pd.update((Pessoa)o);

	}

	@Override
	public void delete(Object o) {
		PessoaDao pd = new PessoaDao();
		pd.delete((Pessoa)o);

	}

	@Override
	public Pessoa select(int i) {
		PessoaDao pd = new PessoaDao();
		Pessoa p = (Pessoa) pd.select(i);
		return p;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pessoa> select() {
		PessoaDao pd = new PessoaDao();
		List<Pessoa> pessoas = pd.select();
		return pessoas;
	}


}
