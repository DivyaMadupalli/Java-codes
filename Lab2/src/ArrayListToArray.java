import java.util.ArrayList;
public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    ArrayList<Integer> list= new ArrayList<>();
	    list.add(1);
	    list.add(2);
	    list.add(3);

	    // Create a new array of String type
	    Integer [] arr = new Integer[list.size()];

	    // Convert ArrayList into the string array
	    list.toArray(arr);
	    System.out.print("Array: ");
	    for(int i=0;i<arr.length;i++) {
	      if(i==arr.length-1)
	      System.out.print(arr[i]);
	      else
		      System.out.println(arr[i]+",");
	    }
	}

}
