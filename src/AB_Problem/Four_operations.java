package AB_Problem;

import java.util.Scanner;
import java.math.*;;
public class Four_operations{	
	public static void main(String[] arg){
    Scanner scanner  = new Scanner(System.in);
    Double a,b;
    a = scanner.nextDouble();
    b = scanner.nextDouble();
    System.out.println(Math.round(a+b));
    System.out.println(Math.round(a-b));
    System.out.println(Math.round(a*b));
    System.out.println((int)Math.floor(a/b));
/*    BigDecimal a,b;
    a=scanner.nextBigDecimal();  
    b=scanner.nextBigDecimal();  
     
    System.out.println(a.add(b));    
    System.out.println(a.subtract(b));    
    System.out.println(a.multiply(b));    
//    System.out.println((a.divide(b,0)).setScale(0, BigDecimal.ROUND_HALF_UP));   
    System.out.println(a.divide(b,0));   
    }
*/
	}
}