import java.util.*;
import java.lang.Math;
class InverseNumber{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		int index=1;
		int od=0;
		int inverse=0;
		while(n!=0){
			od=n%10;
			int id=index;
			int ii=od;
			inverse=(int)(inverse + id*(Math.pow(10,ii-1)));
			
			n=n/10;
			index++; 
		}
		System.out.println(inverse);
	}
}