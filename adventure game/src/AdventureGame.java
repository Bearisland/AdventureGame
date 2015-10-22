import java.util.Scanner;

public class AdventureGame {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to adventure game");
		System.out.print("Please enter name: ");
		String name = in.next();
		System.out.println("Hello " + name);
		
		String className = "";
		
		while (className == "") {
			
			System.out.println("Pick a class: wizard [1] warrior [2] hunter [3]");
			
			int classNumber = in.nextInt();
			
			if (classNumber > 0 && classNumber < 4) {
				
				if (classNumber == 1) className = "wizard";
				
				else if (classNumber == 2) className = "warrior"; 
				
				else className = "hunter";
				
				System.out.println("You are a " + className);
				
			} else {
				
				System.out.println("invalid number");
				
			}
			
		}
		
		in.close();
		
	}
	
}
