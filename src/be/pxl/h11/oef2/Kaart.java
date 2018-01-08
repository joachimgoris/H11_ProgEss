package be.pxl.h11.oef2;

public class Kaart {
	private Ranking ranking;
	private Soort soort;
	
	public Kaart(Ranking r, Soort s) {
		setRanking(r);
		setSoort(s);
	}

	public Ranking getRanking() {
		return ranking;
	}

	public void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}

	public Soort getSoort() {
		return soort;
	}

	public void setSoort(Soort soort) {
		this.soort = soort;
	}
	
}
