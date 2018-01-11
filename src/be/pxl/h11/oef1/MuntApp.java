package be.pxl.h11.oef1;

public class MuntApp {

	public static void main(String[] args) {
		
		getAantalMuntjes(9.98);
	}

	public static void getAantalMuntjes(double b) {
		int bedrag =(int) (b*100);
		
		int[] betaling = new int[Munt.values().length];
		
		while(bedrag>0) {
			for(Munt munt : Munt.values()) {
				if(bedrag>=munt.getWaarde()) {
					bedrag -= munt.getWaarde();
					betaling[munt.ordinal()]+=1;
					break;
				}
			}
		}
		
		System.out.println("Voor bedrag "+b+":");
		for(Munt munt : Munt.values()) {
			int muntIndex = munt.ordinal();
			if(betaling[muntIndex]>0) {
				System.out.println(betaling[muntIndex]+"x "+munt);
			}
		}
	}
}
