package AB_Problem;

import java.util.Scanner;
import java.math.BigInteger;;
public class BigInt_mul{	
	public static void main(String[] arg){
    Scanner scanner  = new Scanner(System.in);
    BigInteger a,b;
    a=scanner.nextBigInteger();  
    b=scanner.nextBigInteger();  
    System.out.println(a.multiply(b));    
    }

}