
public class Tableau {

	public static void main(String[] args) {
		int tab[]={5,70,60,4,6,8};
		int s = 0;

		for (int i=0;i< tab.length;i++)
			s = s +tab[i];
		    float m = s/tab.length;
		    System.out.println("la somme est:"+s);
		    System.out.println("la moyenne est:"+m);

		    int s1=0;
		    int n =0;
		for (int i=0;i< tab.length;i++)
			if (tab[i]>50){
				s1=s1+tab[i];
				n=n+1;}
				float m1=s1/n;
				System.out.println("la moyenne est:"+m1);

	    int max=tab[0];
	    int min=tab[0];
	    int rgmax=0;
	    int rgmin=0;
		for (int i=0;i< tab.length;i++){
			if(tab[i]>max){
				max=tab[i];
				rgmax=i+1;
			}
		    if(tab[i]<min){
		    	min=tab[i];
		    	rgmin=i+1;
		    }
		}
		System.out.println("le rang de max est:"+rgmax);
		System.out.println("le rang de min est:"+rgmin);

		int aux;
		for(int i=0;i<tab.length-1;i++){
			for(int j=i+1;j<tab.length;j++){
				if(tab[i]>tab[j]){
					aux=tab[i];
					tab[i]=tab[j];
					tab[j]=aux;
				}

			}
		}
			for(int i=0;i<tab.length;i++){
				System.out.print(tab[i]+" ");
			}
	}
}
