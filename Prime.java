import java.util.*;
import java.lang.Math;

public class Prime{
public static void main(String[] args){
	Scanner scn=new Scanner(System.in);
	int t=scn.nextInt();
	for(int i=1;i<=t;i++){
		int n=scn.nextInt();
		int count=0;
		for(int j=2;j<=Math.sqrt(n);j++){
			if(n%j==0){
				count++;
				break;
			}
		}
		if(count==1){
			System.out.println("it is not Prime");
		}else{
			System.out.println("it is prime");
		}
	}
}
}

