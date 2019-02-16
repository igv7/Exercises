package ex6;

public class Boom {

	public static void main(String[] args) {
		
		System.out.println("       *******7-Boom*******");
		
		int num=100;
		String string="Boom";
		
		for (int i = 0; i <=num; i++) {
			if (i%7==0 || i%10==7 || i/10==7) {
				System.out.print(i+"-"+string+", ");
			}else {
				System.out.print(i+", ");
			}
		}
		
		

	}

}
