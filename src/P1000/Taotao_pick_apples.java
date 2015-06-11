package P1000;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Taotao_pick_apples {
	public static void main(String[] args) throws Exception{
	 
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2=sc.nextLine();
		int count = 0; 
		String[] arr=str.split(" ");//¿Õ¸ñ
		int a1 = Integer.parseInt(str2);
		int[] a = new int[arr.length];
		for(int i=0;i<arr.length;i++){
		    a[i] = Integer.parseInt(arr[i]);
		    if (a[i] <= (a1+30)){
		    	count ++;
		    	 
		    }
		}
		System.out.println(count);
		    
	}
}

