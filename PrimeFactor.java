import java.util.*;
import java.lang.Math;

class PrimeFactor{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();

		for(int i=2;i<=Math.sqrt(n);i++){
			while(n%i==0){
				n=n/i;
				System.out.println(" "+i);
			}
		}
		if(n!=1){
			System.out.println(n);
		}
	}
}