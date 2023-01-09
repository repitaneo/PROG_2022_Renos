package robots;

public class Gimnasio {

	
	public static Robot lucha(Robot robot0, Robot robot1) {
		
		// 0 -- ataca robot0
		// 1 -- ataca robot1
		int turno = (int)(Math.random()*2);
		
		while((robot0.vida>0)&&(robot1.vida>0)) {
			
			int golpe = (int)(Math.random()*101);

			if(turno==0) {
				// el golpe lo da robot0
				if(robot1.defensa<golpe) {
					robot1.vida -= robot0.ataque;
					
				}
			}
			else if(turno==1) {
				// el golpe lo da robot1
				if(robot0.defensa<golpe) {
					robot0.vida -= robot1.ataque;
				}
			}
			
			turno=(turno==0)?1:0;
		}
		
		if(robot0.vida<=0) {
			return robot1; 
		}
		else return robot0;
		
	}
	
	
	
}
