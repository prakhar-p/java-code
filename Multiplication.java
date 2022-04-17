import java.util.*;
class Multiplication{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int b=scn.nextInt();
		System.out.print(ans(n1,n2,b));
	}
	public static int ans(int n1,int n2,int b){
		int output=0;
		int p=1;	
		while(n2>0){
			int d=n2%10;
			n2=n2/10;
			int totally=singleDigit(n1,d,b);
			output=addition(output,totally*p,b);
			p=p*10;
		}
		return output;
	}
	public static int singleDigit(int n1,int d,int b){
		int output=0;
		int c=0;
		int p=1;
		while(n1>0 || c>0){
			int n0=n1%10;
			n1=n1/10;
			int dth=n0*d+c;
			c=dth/b;
			dth=dth%b;
			output+=dth*p;
			p=p*10;
		}
		return output;
	}
	public static int addition(int n1,int n2,int b){
		int c=0;
		int output=0;
		int p=1;
		while(n1>0 || n2>0 || c>0){
			int n0=n1%10;
			int nth=n2%10;
			n1=n1/10;
			n2=n2/10;
			
			int ans=n0+nth+c;
			c=ans/8;
			int k=ans%8;
			output+=k*p;
			p=p*10;
		}
		return output;
	}
}