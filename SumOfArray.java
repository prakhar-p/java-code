import java.util.*;
class SumOfArray{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int[] arr1=new int[n1];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=scn.nextInt();
		}
		int n2=scn.nextInt();
		int[] arr2=new int[n2];
		for(int i=0;i<arr2.length;i++){
			arr2[i]=scn.nextInt();
		}
		int[] arr=new int[n1>n2? n1:n2];
		int i=arr1.length-1;
		int j=arr2.length-1;
		int k=arr.length-1;
		int c=0;		
		while(k>=0){
			
			int ans=c;
			if(i>=0){
				ans+=arr1[i];
			}
			if(j>=0){
				ans+=arr2[j];
			}
			c=ans/10;
			arr[k]=ans%10;
			
			i--;
			j--;
			k--;
		}
		if(c!=0){
			System.out.print(c);
		}
		for(int val:arr){
			System.out.print(val);
		}
	}
}