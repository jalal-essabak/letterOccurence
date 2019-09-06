package testString;

import java.util.Scanner;



public class Array {
    
	
	private static Scanner scan = null;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		scan = new Scanner(System.in);
		String str = null;
		System.out.println("Enter String : ");
		str = scan.nextLine();
		
		int length = str.length();
		
		int[] count = new int[255];
		
		char[] ch = new char[length];
		
		for (int i=0 ; i<length ;i++) {
			ch[i]=str.charAt(i);
		}
		
		for (int i = 0 ; i < length ; i++) {
			int number = 0 ;
			for( int j = 0 ; j < length ; j++) {
				if(str.charAt(j)==ch[i]) {
					number++ ;
				}
			}
			count[str.charAt(i)]=number;
		}
	
		for(int i=0 ; i<length ; i++) {
			System.out.println(str.charAt(i)+"=>"+count[str.charAt(i)]);
		}
		
	}

}
