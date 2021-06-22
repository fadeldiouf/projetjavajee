package sn.askanbiBank.dao;

import java.util.ArrayList;

public interface Idao <T>{
	public void save (T t);
	public ArrayList<T> liste();
	public T update (T t);
	public T active (T t);
	public T desactive (T t);

}
