package programacionUD2.unidad2;

public class ForTraza {
	public static void main(String[] args) {
		int i,j;
		for (i=1; i<= 3; i++) {
			System.out.println("Bucle externo,i="+i);
			
			j=1;
			while (j <= 1 ) {
				System.out.println("...Bucle interno,j=" + j);
				j++;
			}
		}
	}

}
