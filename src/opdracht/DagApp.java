package opdracht;

public class DagApp {

	public static void main(String[] args) {
		Dag vandaag = Dag.DINSDAG;
		System.out.println(vandaag);
		
		for(Dag dag : Dag.values()) {
			System.out.println(dag.name()+" "+dag.ordinal()+" "+dag.getWeekend());
		}
	}

}
