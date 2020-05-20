import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileStreams {

	public static void main(String[] args){
		
		String dishName;
		double price;
		int quantity;
		double totalPrice = 0;
		
		try {
			File file = new File("file");
			file.exists();
			Scanner scanner = new Scanner(file);
			for(int i=0; i<3; i++) {
				dishName = scanner.next();
				price = scanner.nextDouble();
				quantity = scanner.nextInt();
				System.out.println(dishName + " " + price + " " + quantity);
				totalPrice += price*quantity;
			}	
			System.out.println("Total price: " + totalPrice);
		}catch(FileNotFoundException e){
			System.out.println("File not found!");		
		}catch(InputMismatchException e){
			System.out.println("Wrong input data!");		
		}	
	}
}
