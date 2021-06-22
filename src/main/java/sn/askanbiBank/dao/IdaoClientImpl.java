package sn.askanbiBank.dao;

import java.util.ArrayList;

import sn.askanbiBank.domaine.Client;
import sn.askanbiBank.utilis.Connexion;

import java.sql.*;

public class IdaoClientImpl implements IdaoClient{

     Connection con= Connexion.connexionDB();
     PreparedStatement pst;
     Statement stmt;
     ResultSet rs;
	@Override
	public void save(Client t) {
		// TODO Auto-generated method stub
		String sql= "INSERT INTO client VALUES (?,?,?,?,?,?,?,?,?)" ;
	      try {
	     pst = con.prepareStatement(sql);
	     pst.setString(1, t.getNom());
	     pst.setString(2,t.getPrenom());
	     pst.setString(3,t.getAddresse());
	     pst.setNString(4, t.getDatenaiss());
	     pst.setLong(5, t.getTelephone());
	     pst.setString(6, t.getEmail());
	     pst.setString(7, t.getCivilite());
	     pst.setString(8, t.getGenre());
	     pst.setLong(9, t.getCni());
	     pst.execute();
	     
	      }catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	      }
	}

	@Override
	public ArrayList<Client> liste() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client update(Client t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client active(Client t) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client desactive(Client t) {
		return null;
		// TODO Auto-generated method stub
		
	}

}
