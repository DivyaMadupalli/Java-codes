import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth number for fibonacci series :");
		int number = sc.nextInt();
		int num1=1;
		int num2=1;
		int num=0;
		System.out.println(num1);
        System.out.println(num2);	
        while(number!=0) {
        	num = num1+ num2;
        	num1=num2;
        	num2=num;
        	System.out.println(num);
        	number--;
        }

	}

}
