import java.util.*;
class ReverseDigit{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		while(n!=0){
			int k=n%10;
			System.out.println(k);
			n=n/10;
		}
	}
}