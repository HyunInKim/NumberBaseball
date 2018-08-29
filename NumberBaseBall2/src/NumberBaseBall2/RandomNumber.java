package NumberBaseBall2;
import java.util.Random;   //import Random Method

public class RandomNumber {
	int [] randomnum = new int[3];		//Global Variable
	public void randomnumber() {
		Random random = new Random();
		for(int i=0;i<3;i++) {
			randomnum[i] = random.nextInt(9) ;  // Random Number 0~9
			for(int j=1;j<i;j++) {				//check overlap
				if(randomnum[i] == randomnum[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("random number : " + randomnum[0]);
		System.out.print( randomnum[1]);
		System.out.println( randomnum[2]);
	}

	
}
