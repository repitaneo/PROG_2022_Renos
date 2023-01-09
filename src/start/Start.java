package start;

import robots.Gimnasio;
import robots.Robot;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot juanjo = new Robot("Juanjo");
		Robot marcos = new Robot("Marcos");
		
		System.out.println(marcos);
		System.out.println(juanjo);

		
		
		Robot ganador = Gimnasio.lucha(juanjo, marcos);
		System.out.println(ganador);
		
		
	}

}
