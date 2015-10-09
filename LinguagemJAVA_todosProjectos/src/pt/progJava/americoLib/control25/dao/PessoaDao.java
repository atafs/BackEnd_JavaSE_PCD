package pt.progJava.americoLib.control25.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pt.progJava.americoLib.control25.bean.Pessoa;

public class PessoaDao implements Dao {

	@Override
	public void delete(Object arg0) {
		Pessoa p = (Pessoa) arg0;
		String sql = "delete from Pessoa where id = ?";

		java.sql.PreparedStatement ps;
		try {
			ps = Conector.getConexao().prepareStatement(sql);
			ps.setInt(1, p.getId());
			ps.execute();
			System.out.println("\n[DELETE efectuado com SUCESSO...]");


		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insert(Object arg0) {
		Pessoa p = (Pessoa) arg0;
		String sql = "insert into Pessoa (nome, cpf, fone, ddd, email) values(?,?,?,?,?)";

		try {
			PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
			ps.setString(1, p.getNome());
			ps.setString(2, p.getCpf());
			ps.setString(3, p.getFone());
			ps.setString(4, p.getDdd());
			ps.setString(5, p.getEmail());

			ps.execute();
			System.out.println("[INSERT " + p.getNome() + " ...efectuado com SUCESSO...]\n");


		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List select() {
		String sql = "select * from Pessoa";
		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		try {
			PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Pessoa p = new Pessoa();
				p.setNome(rs.getString("nome"));
				p.setCpf(rs.getString("cpf"));
				p.setFone(rs.getString("fone"));
				p.setDdd(rs.getString("ddd"));
				p.setEmail(rs.getString("email"));
				p.setId(rs.getInt("id"));

				pessoas.add(p);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("[SELECT list efectuado com SUCESSO...]\n");
		return pessoas;
	}

	@Override
	public Object select(int arg0) {
		String sql = "select * from Pessoa where id = ?";
		Pessoa p = new Pessoa();

		try {
			PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
			ps.setInt(1, arg0);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				p.setNome(rs.getString("nome"));
				p.setCpf(rs.getString("cpf"));
				p.setFone(rs.getString("fone"));
				p.setDdd(rs.getString("ddd"));
				p.setEmail(rs.getString("email"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("[SELECT: " + p.getNome() + "...efectuado com SUCESSO...]\n");
		return p;
	}

	@Override
	public void update(Object arg0) {
		Pessoa p = (Pessoa) arg0;
		String sql = "update pessoa set nome = ?, cpf = ?, fone = ?, ddd = ?, email = ? where id = ?";

		try {
			PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
			ps.setString(1, p.getNome());
			ps.setString(2, p.getCpf());
			ps.setString(3, p.getFone());
			ps.setString(4, p.getDdd());
			ps.setString(5, p.getEmail());
			ps.setInt(6, p.getId());

			ps.execute();
			System.out.println("[UPDATE: " + p.getNome() + ", Id: " + p.getId() + "...efectuado com SUCESSO...]\n");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
