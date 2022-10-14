public class Test9 {
	public static void main(String[] args){
		int row=0;
		
		while (row < 5){
			int star=0;
			while(star<=row){
				System.out.print("*");
				star = star + 1;
			}
			System.out.println("");
			
			row = row + 1;
		}
		while (row < 9){
			int star=8;
			while(star>=row){
				star = star - 1;
				System.out.print("*");
				
			}
			row = row +1;
			System.out.println("");
			
			
		}
	
	}
}