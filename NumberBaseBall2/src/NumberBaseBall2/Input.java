package NumberBaseBall2;

public class Input {
	int[] Inputnum = new int[3];
	public void input(String a) {
		//String a = "123";
		String[] Inputnumber = a.split(""); //Input String Slice
		int[] Transint = new int[a.length()]; 
		
		for(int i=0;i<a.length();i++) {
			Transint[i] = Integer.parseInt(Inputnumber[i]); //String -> Int
			Inputnum[i] = Transint[i];
			
		}
		
		
		
	}

}
