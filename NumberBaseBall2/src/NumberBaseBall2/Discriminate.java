package NumberBaseBall2;
import java.util.Scanner;

public class Discriminate {
	
	public void dicriminate() {
		RandomNumber RN = new RandomNumber();
		Input In = new Input();
		Scanner scanner = new Scanner(System.in);
		RN.randomnumber();							//Call Random number class RandomNumber()
		int chance = 0;
		int Out    = 0;
		while(chance < 11) {   						//chance 10 
			int Strike = 0;
			int Ball   = 0;
			
		System.out.print("Choose Number : ");
		String Message = scanner.nextLine();	  //Input Keyboard
		
		In.input(Message);
			for(int i=0;i<RN.randomnum.length;i++) {
				for(int j=0;j<In.Inputnum.length;j++) {
					if(RN.randomnum[i] == In.Inputnum[j]) {		//Discriminate Number
						if(i==j) {Strike++;}					//Discriminate location
						else 	 {Ball++;}
					}
					
				}
			}
			
		
		if(Strike == 0 && Ball == 0) {Out++;}						//Not Collect Number
		System.out.println("Strike: "+ Strike);

		System.out.println("Ball: "+ (Ball ));
		
		System.out.println("Out: "+ Out);
		chance++;										// Chance Count
			if(Strike == 3 ) {
				System.out.println("Collect!!");
				break;
			}
			else if(Out == 3) {
				System.out.println("3OUT!!!!!!");
				break;
			}
			else if(chance==10) {
				System.out.println("Chance Over!");
				break;
			}
		}
	}

	
}
