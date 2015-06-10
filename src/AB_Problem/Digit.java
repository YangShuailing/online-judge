package AB_Problem;

import java.util.*;
import java.math.*;
public class Digit {
	  public static void main(String[] args){
		  Scanner scanner = new Scanner(System.in);
		  BigInteger a,b,mul;
		  a = scanner.nextBigInteger();
		  b = scanner.nextBigInteger();
		  mul =a.multiply(b);
		 String s = String.valueOf(mul);
		 System.out.println(mul);
		 System.out.println(s.length());
	  }
}
