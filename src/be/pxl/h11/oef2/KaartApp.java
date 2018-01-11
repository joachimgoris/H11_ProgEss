package be.pxl.h11.oef2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class KaartApp {

	public static void main(String[] args) {
		Scanner invoer = new Scanner(System.in);
			ArrayList<Kaart> kaarten = new ArrayList<Kaart>(52);
			
			for(Soort s : Soort.values()) {
				vullArray(s, kaarten);
			}
			
			Collections.shuffle(kaarten);
			
			Random rdm = new Random();
			
			String input = "";
			Kaart c;
			Kaart s;
			do {
				c = kaarten.get(rdm.nextInt(kaarten.size()));
				s = kaarten.get(rdm.nextInt(kaarten.size()));
				if(c.getRanking().ordinal()>s.getRanking().ordinal()) {
					System.out.println(c.getRanking()+" "+s.getRanking());
					System.out.println("Computer wins");
				}
				else {
					if(c.getRanking().ordinal()<s.getRanking().ordinal()) {
						System.out.println(c.getRanking()+" "+s.getRanking());
						System.out.println("Speler wins");
					}
				}
				input = invoer.next();
			}while(!input.equals("n"));
			invoer.close();
	}
	
	private static void vullArray(Soort s, ArrayList<Kaart> kaarten) {
		for(Ranking r : Ranking.values()) {
			Kaart k = new Kaart(r, s);
			kaarten.add(k);
		}
	}

}
