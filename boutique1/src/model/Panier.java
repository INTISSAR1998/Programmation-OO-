package model;

import java.util.List;

public class Panier {
private List<LignePAnier>listlignepanier;

public Panier(List<LignePAnier> listlignepanier) {
	super();
	this.listlignepanier = listlignepanier;
}

public List<LignePAnier> getListlignepanier() {
	return listlignepanier;
}

public void setListlignepanier(List<LignePAnier> listlignepanier) {
	this.listlignepanier = listlignepanier;
}

}
