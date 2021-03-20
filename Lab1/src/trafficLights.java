
import java.util.Scanner;
public class trafficLights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("RED");
		System.out.println("YELLOW");
		System.out.println("GREEN");
		Scanner sc = new Scanner (System.in);
		System.out.println("Select one number from the above 3:");
		int number = sc.nextInt();
		switch(number) {
		case 1:
			System.out.println("stop");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3:
			System.out.println("Go");
			break;
		
		}
		
	}

}
