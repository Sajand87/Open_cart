package Com_Hrms_Pages;

import java.util.Scanner;

public class String_comprasion {
	
	
	
	
	
	
	
	
	public static void main(String args[]) throws Exception {
		
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			
			for(int i=0;i<s1.length(); i++) {
				
				
				if(s1.charAt(i)==s2.charAt(i)) {
					
					System.out.println("matched");
				}
				else {
					
					System.out.println("not matched");
			
					
				}
				
				
				
				
				
				
			}
			
			
			
		}
		
		
		
		
		
		
	

}
