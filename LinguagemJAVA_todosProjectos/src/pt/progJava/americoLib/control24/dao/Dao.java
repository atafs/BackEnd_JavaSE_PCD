package pt.progJava.americoLib.control24.dao;

import java.util.List;

public interface Dao {
	
	public void insert(Object o);
	public void update(Object o);
	public void delete(Object o);
	public Object select(int id);
	@SuppressWarnings("rawtypes")
	public List select();
	
}
