import java.util.Scanner;

public class Test6{
    public static void main(String[] args){
        int grade=0;
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        grade = input.nextInt();
        
        switch (grade / 10){
			case 9:
			case 10:
				System.out.println("A");
				break;
			
			case 8:
				System.out.println("B");
				break;
			
			case 7:
				System.out.println("C");
				break;
			
			case 6:
				System.out.println("D");
				break;
			
			default:
				System.out.println("E");
				break;
		}
        
	}
}
