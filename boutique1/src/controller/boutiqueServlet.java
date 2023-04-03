package controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Categorie;
import model.Produit;
import repository.BoutiqueMangmenet;

/**
 * Servlet implementation class boutiqueServlet
 */
@WebServlet("/boutiqueServlet")
public class boutiqueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public boutiqueServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BoutiqueMangmenet boutiquemangement= new BoutiqueMangmenet();
		if(request.getParameter("id")!=null)
		{
			int id= Integer .parseInt(request.getParameter("id"));
			List<Produit> listproduit2=boutiquemangement.getProduitBycategorie(id);
			request.setAttribute("produits", listproduit2);
		}
		else {
			List<Produit> listproduit=boutiquemangement.getAllProduit();
			
			request.setAttribute("produits", listproduit);
		}
		List<Categorie> listcategorie=boutiquemangement.getAllCategorie();
		request.setAttribute("categorie", listcategorie);
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
