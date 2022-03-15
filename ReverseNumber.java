import java.util.*;
class ReverseNumber{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int k=scn.nextInt();

		int count=0;
		int temp=n;
		while(temp!=0){
			temp=temp/10;
			count++;
		}
		k=k%count;
		if(k<0){
			k=k+count;
		}

		int div=(int)Math.pow(10,k);
		int mult=(int)Math.pow(10,count-k);
		int ans=n % div;
		int q=n/div;
		int realans=(ans*mult)+q;
		System.out.println(realans);
	}
}