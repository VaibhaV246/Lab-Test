package lab7;
import java.util.Scanner;
public class NumOfVowel {
	
	private static void vowelCount() {       
		int count = 0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String s =sc.nextLine();
		sc.close();
		s=s.toUpperCase();                 
		
		for(int i=0;i<s.length();i++) {    
			
				if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I'|| 
						s.charAt(i)=='O' || s.charAt(i)=='U' ) {
					count++;                
				}					
		}									
		System.out.println("Total Number of Vowels in given String is : "+count);
	}


	public static void main(String[] args) {
		vowelCount();           
	}
}
