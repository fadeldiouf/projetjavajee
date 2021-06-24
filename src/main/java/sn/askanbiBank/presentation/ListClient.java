package sn.askanbiBank.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.askanbiBank.dao.IdaoClient;
import sn.askanbiBank.dao.IdaoClientImpl;
import sn.askanbiBank.domaine.Client;
import sn.askanbiBank.model.ClientModel;

/**
 * @author Fadilou
 *
 */
@WebServlet("/templates/viewClient/")
public class ListClient extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IdaoClient metier;
	
	public void init() throws ServletException {
		metier= new IdaoClientImpl();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ClientModel model = new ClientModel();
		List<Client> clients= metier.liste();
		model.setClients(clients);
		req.setAttribute("model",model);
		req.getRequestDispatcher("listeclientActive.jsp").forward(req, resp);
	}
	

}
