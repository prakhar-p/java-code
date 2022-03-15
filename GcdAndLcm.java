import java.util.*;

class GcdAndLcm{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int temp1=n1;
		int temp2=n2;
		while(n2%n1!=0){
			int rem=n2%n1;
			n2=n1;
			n1=rem;
			
		}
		System.out.println(n1);
		int lcm=(temp2*temp1)/n1;
		System.out.println(lcm);
	}
}