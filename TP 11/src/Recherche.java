import java.util.*;
public class Recherche {

	public static void main(String[] args) {
		Random r = new Random();
		String ch=null;
		long x=Long.valueOf(0);
		long t [] = new long [2000000];
		int n =1000000;
		for(int i=0;i<n;i++) {
			t[i]=r.nextInt(100000)*r.nextInt(100000);
			System.out.println(t[i]);
		}
		for(int i=0;i<=n;i++) {
			if(t[i]==x) {
				ch="element existe";
			}
			else {
				ch="element ne pas exister";
			}
		}
		System.out.println(ch);
	}
}
