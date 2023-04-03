package tp44;

public class noeud {
	public int val ;
	public noeud fg ;
	public noeud fd ;
	
	
	public noeud( noeud fg,int val, noeud fd) {
		
		this.val = val;
		this.fg = fg;
		this.fd = fd;
	}
	  	  
}
