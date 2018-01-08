package be.pxl.h11.oef1;

public class MuntApp {

	public static void main(String[] args) {
		
		getAantalMuntjes(9.98);
	}

	public static void getAantalMuntjes(double b) {
		int bedrag =(int) (b*100);
		
		while(bedrag>0) {
			for(Munt munt : Munt.values()) {
				if(bedrag>=munt.getWaarde()) {
					System.out.println(munt.name());
					bedrag -= munt.getWaarde();
				}
			}
		}
	}
}
