import java.util.*;

class Triangle{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		int max=a;
		if(b>max){
			max=b;
		}
		if(c>max){
			max=c;
		}
		boolean ans;
		if(max==a){
			ans=((b*b)+(c*c))==(a*a);
		}
		else if(max==b){
			ans=((a*a)+(c*c))==(b*b);
		}
		else{
			ans=((b*b)+(a*a))==(c*c);
		}
		System.out.println(ans);
	}
}