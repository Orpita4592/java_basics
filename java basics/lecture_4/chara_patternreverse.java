package lecture_4;

import java.util.Scanner;

public class chara_patternreverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=1,n;
		System.out.println("Enter the no of rows ");
		n =sc.nextInt();
		
		while(i<=n) {
			int j=1; char t=(char)('E'-i+1);
			while(j<=i) {
				
				System.out.print(t);
				j++;
				t=(char)(t+1);
				
			} 
			
			System.out.println();
			i++;

	}

}}
