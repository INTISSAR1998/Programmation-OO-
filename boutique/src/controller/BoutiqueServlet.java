package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Categorie;
import model.Produit;
import repository.BoutiqueManagement;

/**
 * Servlet implementation class BoutiqueServlet
 */
@WebServlet("/BoutiqueServlet")
public class BoutiqueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoutiqueServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BoutiqueManagement boutiqueManagement= new  BoutiqueManagement();
		List<Produit> listeproduit=boutiqueManagement.getAllProduit();
		if (request.getParameter("id")!=null) {
			int id=Integer.parseInt(request.getParameter("id"));
			List<Produit> listp=boutiqueManagement.getProduitByCategorie(id);
			request.setAttribute("produits", listp);
		}else {
			
			List<Produit> listp=boutiqueManagement.getAllProduit();
			request.setAttribute("produits", listeproduit);

		}
		List<Categorie> listecategorie=boutiqueManagement.getAllCategorie();
		request.setAttribute("categories", listecategorie);
		request.getRequestDispatcher("boutique.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
