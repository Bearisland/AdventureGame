import java.util.Random;
import java.util.Scanner;

/**
 * 
 * Main class used to initialise the game and play
 * 
 * @author oli
 *
 */

public class AdventureGame {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		Random treasurechooser = new Random();
		boolean searchroomOne = false;
		int money = 0;
		
		
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
			
			boolean roomOne = true;
			
			System.out.println("You enter a room...");
			
			while (roomOne == true){
				
				System.out.println("What do you do? search for treasure [1] continue to next room [2]");
				
				int choice = in.nextInt();
				
				
				if (choice == 1 && searchroomOne == false) {
				     
				     int i  = treasurechooser.nextInt(2);
				     
				     if (i == 1){ 
				      
				      money += 1;
				      searchroomOne = true;
				      System.out.println("You found one coin");
				      System.out.println("You now have " + money);
				      
				     } else {
				      
				      System.out.println("You found nothing...");
				      
				     }
				     
				    }
				
				if (choice == 2) {
				     
				     roomOne = false;
				     
				    }
					
					
					
				}
				
				
				
				
				
				
			}
			
			
			
			
		
		
		in.close();
		
	}
	
}
