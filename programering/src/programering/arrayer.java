package programering;

public class arrayer {
	
	
	public static void main(String[] args) {
		
		int[] fivers1 = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};
		
		int[] fivers2 = new int[20];
		for(int i = 0; i < 20; i++) {
			
			fivers2[i] = i*5;
				
		}
		
		for(int i = 0; i < fivers2.length; i++)  {
			System.out.println(fivers2[i]);
	
		}
		
		int[] seven = new int[2];
		for(int i = 0; i < 2; i++) {
		
			seven[i] = i*7;
		}
		for(int i = 0; i < seven.length; i++)  {
			System.out.println(seven[i]);
	
		}
		
	}
		
	}
	


