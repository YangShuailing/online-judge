package P1000;

import java.util.Scanner;

public class EvenNub {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int i = Math.abs(scanner.nextInt());
		if(i % 2 ==1){
			System.out.println("no");
		}else {
			System.out.println("yes");
		}
	}

}
