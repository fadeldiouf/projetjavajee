package sn.askanbiBank;

import java.util.List;

import sn.askanbiBank.dao.IdaoClient;
import sn.askanbiBank.dao.IdaoClientImpl;
import sn.askanbiBank.domaine.Client;
import sn.askanbiBank.model.ClientModel;

public class ts {
	
	private static IdaoClient metier = new IdaoClientImpl();
	
		public static void main(String[] args) {

			ClientModel model = new ClientModel();
			List<Client> clients= metier.liste();
			model.setClients(clients);
			System.out.println("liste des clients "+model);
			System.out.println("liste des clients ");
	}

}
