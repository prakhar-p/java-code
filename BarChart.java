import java.util.*;
class BarChart{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		for(int j=max;j>0;j--){
			for(int k=0;k<arr.length;k++){
				if(arr[k]>=j){
					System.out.print("*\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}