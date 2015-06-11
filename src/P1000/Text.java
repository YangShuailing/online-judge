package P1000;

import java.util.*;


public class Text{
	public static void main(String[] args) throws Exception{
	 
		Scanner sc=new Scanner(System.in);
		 
		 
		int count = 0; 
		int[] a = new int[11];
		for(int i=0;i<11;i++){
		    a[i] = sc.nextInt();
		    
		}
		for(int i=0;i<10;i++){
			if (a[i] <= (a[10]+30)){
		    	count ++;
//		    	 System.out.println(a[10]);
//		    	 System.out.println( a[i]);
		    }
		}
		System.out.println(count);
		    
	}
}

