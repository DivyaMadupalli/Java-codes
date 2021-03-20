import java.util.Arrays;
import java.util.Collections;
public class productSort {

	public static void main(String[] args) {
		String [] list = new String[] {"apple","cape","ball","ice","dress"};
		Arrays.sort(list,Collections.reverseOrder());
		System.out.println("Array elements in descending order: " +Arrays.toString(list));
		Arrays.sort(list);;
		System.out.println("Array elements in ascending order: " +Arrays.toString(list));
			

	}

}
