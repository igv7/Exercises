package homework;

public class Fibonacci {

	public static void main(String[] args) {
		
		int f1 = 1;
		int f2 = 1;
		
//		for (int i = 6; i>2; i--) {
//			
//			f2 = f1+f2;
//			f1 = f2-f1;
//		}
//			System.out.println("The number of index 6" + " is "+f2);
		
		
//		int i=7;
//		while (i>2) {
//			f2 = f1+f2;
//			f1 = f2-f1;
//			i = i-1;
//		}
//			System.out.println("The number of index 7" + " is "+f2);
		
		
		int i=3;
		do {
			f2 = f1+f2;
			f1 = f2-f1;
			i++;
		} while (i<=8);
			System.out.println("The number of index 8" + " is "+f2);
		
			
    }

}