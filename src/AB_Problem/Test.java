package AB_Problem;

import java.math.BigDecimal; 
import java.text.DecimalFormat;

public class Test{ 
public static void main(String[] args){ 
   double i=2, j=2.1, k=2.5, m=2.9; 
   System.out.println("���С��ȡ��:Math.floor(2)=" + (int)Math.floor(i)); 
   System.out.println("���С��ȡ��:Math.floor(2.1)=" + (int)Math.floor(j)); 
   System.out.println("���С��ȡ��:Math.floor(2.5)=" + (int)Math.floor(k)); 
   System.out.println("���С��ȡ��:Math.floor(2.9)=" + (int)Math.floor(m)); 
                                        
   /* ��α�ע�͵Ĵ��벻����ȷ��ʵ����������ȡ�� 
   System.out.println("��������ȡ��:Math.rint(2)=" + (int)Math.rint(i)); 
   System.out.println("��������ȡ��:Math.rint(2.1)=" + (int)Math.rint(j)); 
   System.out.println("��������ȡ��:Math.rint(2.5)=" + (int)Math.rint(k)); 
   System.out.println("��������ȡ��:Math.rint(2.9)=" + (int)Math.rint(m)); 
   
   System.out.println("��������ȡ��:(2)=" + new DecimalFormat("0").format(i)); 
   System.out.println("��������ȡ��:(2.1)=" + new DecimalFormat("0").format(i)); 
   System.out.println("��������ȡ��:(2.5)=" + new DecimalFormat("0").format(i)); 
   System.out.println("��������ȡ��:(2.9)=" + new DecimalFormat("0").format(i)); 
   */ 
   
   System.out.println("��������ȡ��:(2)=" + new BigDecimal("2").setScale(0, BigDecimal.ROUND_HALF_UP)); 
   System.out.println("��������ȡ��:(2.1)=" + new BigDecimal("2.1").setScale(0, BigDecimal.ROUND_HALF_UP)); 
   System.out.println("��������ȡ��:(2.5)=" + new BigDecimal("2.5").setScale(0, BigDecimal.ROUND_HALF_UP)); 
   System.out.println("��������ȡ��:(2.9)=" + new BigDecimal("2.9").setScale(0, BigDecimal.ROUND_HALF_UP));

   System.out.println("����:Math.ceil(2)=" + (int)Math.ceil(i)); 
   System.out.println("����:Math.ceil(2.1)=" + (int)Math.ceil(j)); 
   System.out.println("����:Math.ceil(2.5)=" + (int)Math.ceil(k)); 
   System.out.println("����:Math.ceil(2.9)=" + (int)Math.ceil(m));

   System.out.println("���С��ȡ��:Math.floor(-2)=" + (int)Math.floor(-i)); 
   System.out.println("���С��ȡ��:Math.floor(-2.1)=" + (int)Math.floor(-j)); 
   System.out.println("���С��ȡ��:Math.floor(-2.5)=" + (int)Math.floor(-k)); 
   System.out.println("���С��ȡ��:Math.floor(-2.9)=" + (int)Math.floor(-m)); 
   
   System.out.println("��������ȡ��:(-2)=" + new BigDecimal("-2").setScale(0, BigDecimal.ROUND_HALF_UP)); 
   System.out.println("��������ȡ��:(-2.1)=" + new BigDecimal("-2.1").setScale(0, BigDecimal.ROUND_HALF_UP)); 
   System.out.println("��������ȡ��:(-2.5)=" + new BigDecimal("-2.5").setScale(0, BigDecimal.ROUND_HALF_UP)); 
   System.out.println("��������ȡ��:(-2.9)=" + new BigDecimal("-2.9").setScale(0, BigDecimal.ROUND_HALF_UP));

   System.out.println("����:Math.ceil(-2)=" + (int)Math.ceil(-i)); 
   System.out.println("����:Math.ceil(-2.1)=" + (int)Math.ceil(-j)); 
   System.out.println("����:Math.ceil(-2.5)=" + (int)Math.ceil(-k)); 
   System.out.println("����:Math.ceil(-2.9)=" + (int)Math.ceil(-m)); 
   } 
}