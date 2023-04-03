package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LignePAnier;
import model.Panier;
import model.Produit;
import repository.BoutiqueMangmenet;

/**
 * Servlet implementation class PanierServlet
 */
@WebServlet("/PanierServlet")
public class PanierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PanierServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BoutiqueMangmenet boutiquemangement= new BoutiqueMangmenet();
		int id =Integer.parseInt(request.getParameter("id"));
		Produit p = boutiquemangement.getProduitByID(id);
	HttpSession session =request.getSession();
		if((Panier)session.getAttribute("panier")==null) {
			LignePAnier lp=new LignePAnier(p,1);
			List<LignePAnier> lpp =new ArrayList<LignePAnier>();
					lpp.add(lp);
			Panier panier=new Panier(lpp);
			session.setAttribute("panier",panier );
		}
		else {
			Panier panier=(Panier)session.getAttribute("panier");
			boolean test=false;
			for(int i=0;i<panier.getListlignepanier().size();i++)
			{
				if(panier.getListlignepanier().get(i).getProduit().getId()==p.getId()) {
					panier.getListlignepanier().get(i).setQuantite(panier.getListlignepanier().get(i).getQuantite()+1);
				test=true;
				}
				
			}
			if(!test) {
				LignePAnier lp=new LignePAnier(p,1);
				List<LignePAnier> lpp =new ArrayList<LignePAnier>();
						lpp.add(lp);
						panier.getListlignepanier().add(lp);
						session.setAttribute("panier",panier );
			}
		}
		response.sendRedirect("panier.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
