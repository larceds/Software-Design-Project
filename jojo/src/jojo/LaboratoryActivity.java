package jojo;
import java.util.Scanner;
public class LaboratoryActivity {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("\nWhat do you want to do? please choose from a-d: ");
        System.out.println("a. Add Book");
        System.out.println("b. View Books");
        System.out.println("c. Borrow Book");
        System.out.println("d. Exit");

        double[] tempss = new double[100];
        char let;
        int num = 0; 															

        do {
            System.out.print("Enter the letter from a-d: ");
            let = Character.toLowerCase(scanner.next().charAt(0));				//the program will ignore if the user will put uppercase or lowercase letter

            if (let == 'a') {													// will just input and store temperature
                System.out.println("Enter Book name: ");
                 String bookName = scanner.nextLine();
                
            } else if (let == 'b') {
            																				// View stored temperatures
                System.out.println("Library: ");
                for (int i = 0; i < num; i++) {
                
                }
            } else if (let == 'c') {														//convert the temperature
               
            }
        } while (let != 'd');
        	
        scanner.close();
    }

	public static void booksName(String[] args) {
		
	}
	}