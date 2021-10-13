/*
 *  4). Write a java program to perform character circular left and right shift with the given
 *	number of times.
 */



import java.util.Scanner;

public class Main {
	
	static String leftrotate(String str, int pos) {
		String res = str.substring(pos) + str.substring(0, pos);
		return res;
	}
	
	  static String rightrotate(String str, int pos)
	    {
	            return leftrotate(str, str.length() - pos);
	    }
	
	public static void main(String[] args) {
		
		Scanner var = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String str = var.nextLine();
		
		System.out.print("Enter the value for left rotation: ");
		int rotl = var.nextInt();
		
		String strl, strr;
		strl = leftrotate(str,rotl);
		
		System.out.print("Enter the value for right rotation: ");
		int rotr = var.nextInt();
		strr = rightrotate(str,rotr);
		System.out.println("After left rotation string by "+rotl+" -> "+ strl);
		System.out.println("After right rotation string by "+rotr+" -> "+strr);
	}

}
