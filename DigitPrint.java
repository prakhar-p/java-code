import java.util.*;
import java.lang.Math;
class DigitPrint{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int digit=0;
		int temp=n;
		while(temp!=0){
			temp=temp/10;
			digit++;
		}
		System.out.println(digit);
		System.out.println(n);
		int power=(int)Math.pow(10,digit-1);
		System.out.println(power);
		while(power!=0){
			int k=n/power;
			System.out.println(k);
			n=n%power;
			power=power/10;
		}
		
	}
}